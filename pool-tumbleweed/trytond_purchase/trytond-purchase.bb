SUMMARY = "The 'purchase' module for the Tryton ERP system"
DESCRIPTION = "The purchase module defines the Purchase model in the Tryton \
application platform. The purchase is mainly defined by a party from \
which the products will be purchased and a list of purchase lines, \
each one containing a product and a quantity."
LICENSE = "GPL-3.0-only"

PV = "7.0.17"

RPM_NAME = "trytond_purchase-7.0.17-1.3.noarch.rpm"
RPM_HASH = "eb741e32ac5f80689cb0600c5e521671d0352d757cfaadee4bc578c3295cb99dffc8b5d6a33e2f57b8c4d53cb6bd3efc4f6e72fdfe95c93a227050f70f92e592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-purchase \
python3dist-trytond-purchase \
trytond-purchase"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-account \
trytond-account-invoice \
trytond-account-product \
trytond-company \
trytond-currency \
trytond-party \
trytond-product \
trytond-stock"

inherit rpm
