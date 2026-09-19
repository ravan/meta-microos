SUMMARY = "Tryton module for purchase requests"
DESCRIPTION = "The purchase_request module of the Tryton application platform allows you to create a purchase request as pre-step for a purchase"
LICENSE = "GPL-3.0-only"

PV = "7.0.1"

RPM_NAME = "trytond_purchase_request-7.0.1-1.4.noarch.rpm"
RPM_HASH = "6a19ce017eb6405998942e6ed3689ca8dacd8d67b1e3931258776f2aa1722cf3d8bc3dc509a7eeabfe612333ece01caf91ae5d91be96511a6670eea51d36547b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-purchase-request \
python3dist-trytond-purchase-request \
trytond-purchase-request"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-product \
trytond-purchase"

inherit rpm
