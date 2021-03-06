/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.validator.wizards;

import org.eclipse.jface.wizard.IWizardPage;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType;
import org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizard;

/**
 * @author bfitzpat
 *
 */
public class AddValidatorWizard extends BaseWizard {

    private AddValidatorWizardStartPage _startPage = null;
    private AddValidatorWizardXMLPage _xmlPage = null;
    private AddValidatorWizardJavaPage _javaPage = null;

    /**
     * Opens the add transform wizard.
     */
    public AddValidatorWizard() {
        super();
        initPages();
        setWindowTitle("New Validator");
    }

    private void initPages() {
        _startPage = new AddValidatorWizardStartPage("start");
        _xmlPage = new AddValidatorWizardXMLPage(_startPage, "xml");
        _javaPage = new AddValidatorWizardJavaPage(_startPage, "java");
        
    }

    @Override
    public boolean performFinish() {
        if (_startPage != null && _startPage.getValidator() != null) {
            return true;
        }
        return false;
    }

    @Override
    public void addPages() {
        addPage(_startPage);
        addPage(_xmlPage);
        addPage(_javaPage);
    }

    /**
     * @return selected binding
     */
    public ValidateType getValidator() {
        if (_startPage != null) {
            return _startPage.getValidator();
        }
        return null;
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page.equals(_startPage)) {
            ValidateType validatorToTest = _startPage.getValidator();
            if (validatorToTest instanceof XmlValidateType) {
                _xmlPage.refresh();
                return _xmlPage;
            } else if (validatorToTest instanceof JavaValidateType) {
                _javaPage.refresh();
                return _javaPage;
            }
        }
        return null;
    }
    
}
