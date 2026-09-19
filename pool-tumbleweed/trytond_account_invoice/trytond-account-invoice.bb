SUMMARY = "The 'account_invoice' module for the Tryton ERP system"
DESCRIPTION = "The account_invoice module add invoices and payment terms."
LICENSE = "GPL-3.0-only"

PV = "7.0.17"

RPM_NAME = "trytond_account_invoice-7.0.17-1.1.noarch.rpm"
RPM_HASH = "e7035a4c61dddfea267683429874fd6b18ae406cc67937ea969bbe60cc218f20aca9035bf6d7497a497799e604497f675132c313d8f2cfd5b724c0f6697a0fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-account-invoice \
python3dist-trytond-account-invoice \
trytond-account-invoice"

RDEPENDS:${PN} += "python-abi \
python3-dateutil \
trytond \
trytond-account \
trytond-account-product \
trytond-company \
trytond-currency \
trytond-party \
trytond-product"

inherit rpm
