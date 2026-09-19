SUMMARY = "Hardware detection and classification utilities"
DESCRIPTION = "Hardware detection and classification utilities"
LICENSE = "Apache-2.0"

PV = "0.32.0"

RPM_NAME = "python314-hardware-0.32.0-2.2.noarch.rpm"
RPM_HASH = "c5f200d9c9568d4a36ad9e97391862589f511883d9f8bd127793ee3f5685797f105299974ddb396f120dddd1a810bcd0910551c1ed8a931e1bba1b6f03983c76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hardware \
python314-hardware \
python3dist-hardware"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-pexpect"

inherit rpm
