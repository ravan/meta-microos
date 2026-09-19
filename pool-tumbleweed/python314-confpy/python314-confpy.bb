SUMMARY = "Config file parsing and option management"
DESCRIPTION = "Config file parsing and option management."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python314-confpy-0.11.0-3.5.noarch.rpm"
RPM_HASH = "ac82e21f5c3cc50dcc07b9948a409f1864101c3c6a0c1b9f19aca2a2a25a7e9db5f4c58f3fa34a5647dc41091ab82f74dee65518e41c3a30b1106c2b5d8581f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-confpy \
python314-confpy \
python3dist-confpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
