SUMMARY = "Standard finance enums"
DESCRIPTION = "Standard financial enumerations."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python314-finance_enums-0.1.0-3.5.noarch.rpm"
RPM_HASH = "3f18b4b2d27777fce3e9c454e288859ddbb5c3822bb2dea7c8a3d1051916430400574500eb4a324ec772a5ed3fe0697b791abedfdf41002f653e70e33bb32eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-finance-enums \
python314-finance-enums \
python3dist-finance-enums"

RDEPENDS:${PN} += "python-abi \
python314-pandas"

inherit rpm
