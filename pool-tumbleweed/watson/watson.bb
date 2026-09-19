SUMMARY = "CLI time tracker"
DESCRIPTION = "Watson helps managing time. It can tell how much time was spent on projects. \
It generates reports for clients."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-2.1.0-1.15.noarch.rpm"
RPM_HASH = "ebb9fc57ce3b52faf4d0de6a5831d302ce91813f3cdbed09adf8b255dac1e1e480a9bc64c488dcfd104a9083c30c8661f884b97d63cc074103a76924288e21b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-td-watson \
python3dist-td-watson \
watson"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-arrow \
python3-click \
python3-click-didyoumean \
python3-requests"

inherit rpm
