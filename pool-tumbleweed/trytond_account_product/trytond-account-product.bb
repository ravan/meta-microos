SUMMARY = "The 'account_product' module of the Tryton ERP system"
DESCRIPTION = "The account_product module of the Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "7.0.3"

RPM_NAME = "trytond_account_product-7.0.3-1.1.noarch.rpm"
RPM_HASH = "644f74b7f0ac4db0719d01f7ae3346d2f3e5a8494d22eecb7b75ed43c59d693f9a7eddec234cbb09c1819d2669f66d718a48314d00523b47dfaebe970ad2e542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-account-product \
python3dist-trytond-account-product \
trytond-account-product"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-account \
trytond-company \
trytond-product"

inherit rpm
