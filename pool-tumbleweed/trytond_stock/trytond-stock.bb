SUMMARY = "The 'stock' module for the Tryton ERP system"
DESCRIPTION = "The stock module defines fundamentals for all stock management \
situations: Locations where product are stored, moves between these \
locations, shipments for product arrivals and departures and \
inventory to control and update stock levels."
LICENSE = "GPL-3.0-only"

PV = "7.0.20"

RPM_NAME = "trytond_stock-7.0.20-1.1.noarch.rpm"
RPM_HASH = "5e3813f9a71706b25a9b20ac8530fbecb1615b31eff20b3e44ccc34df3a20c8a67ba17150d11f8e4543ce495eb057c4e53cc465aa5ad7a97037ac25138863b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-stock \
python3dist-trytond-stock \
trytond-stock"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-company \
trytond-currency \
trytond-party \
trytond-product"

inherit rpm
