SUMMARY = "The Stock Supply module for the Tryton ERP system"
DESCRIPTION = "The Stock Supply module adds automatic supply mechanisms and \
introduce the concepts of order point and purchase request into the \
Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "trytond_stock_supply-7.0.5-1.3.noarch.rpm"
RPM_HASH = "c11966ce9117013559ea6bbe94302c9e24c51d44c4f66db9bc6625b00f814517a4d7f49b1bcec4a5fdd67c19721e61acffbe677506a923e065c5e28f0d994a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-stock-supply \
python3dist-trytond-stock-supply \
trytond-stock-supply"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-account \
trytond-party \
trytond-product \
trytond-purchase \
trytond-stock"

inherit rpm
