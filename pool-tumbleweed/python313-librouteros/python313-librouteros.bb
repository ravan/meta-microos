SUMMARY = "Python implementation of MikroTik RouterOS API"
DESCRIPTION = "Python implementation of MikroTik RouterOS API. \
http://wiki.mikrotik.com/wiki/API"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "python313-librouteros-4.2.1-1.1.noarch.rpm"
RPM_HASH = "6198de9b88983965a43b77853aec70c2714401726217dc5cb14b690b85743a47721bdff2004cb1343f37dd5206bc39065f55e47bda5c372c9d132c5b33b68a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-librouteros \
python3.13dist-librouteros \
python313-librouteros \
python3dist-librouteros"

RDEPENDS:${PN} += "python-abi"

inherit rpm
