SUMMARY = "The 'stock_lot' module of the Tryton ERP system"
DESCRIPTION = "The stock lot module defines lot of products. \
A lot is by default just a number to tag moves. It is possible to define per product when the lot is required by selecting the type of location involved in the move."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.7"

RPM_NAME = "trytond_stock_lot-7.0.7-1.1.noarch.rpm"
RPM_HASH = "dc85fd984c09dafb9a294880f138954f2cf9c5bc61e565d121357bf8a3b8dcd08d63bdc8c9f04fa63726266d6d1d6fa05b28d8a9b5e36f1956d7f21e9c1b06e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-stock-lot \
python3dist-trytond-stock-lot \
trytond-stock-lot"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-company \
trytond-currency \
trytond-party \
trytond-product \
trytond-stock"

inherit rpm
