SUMMARY = "The 'account_invoice_stock' module for the Tryton ERP system"
DESCRIPTION = "This module adds capability to bill stock items/materials"
LICENSE = "GPL-3.0-only"

PV = "7.0.2"

RPM_NAME = "trytond_account_invoice_stock-7.0.2-1.4.noarch.rpm"
RPM_HASH = "26d42f73900a2274329d44244a2142782e0fbab13f9f2eb464e7fae9827b1feef8a1958310c3aa8e222ccfbf7d165279583e925015d0000934efefa87b38f939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-account-invoice-stock \
python3dist-trytond-account-invoice-stock \
trytond-account-invoice-stock"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-account-invoice \
trytond-product \
trytond-stock"

inherit rpm
