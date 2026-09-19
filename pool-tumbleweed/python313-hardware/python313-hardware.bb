SUMMARY = "Hardware detection and classification utilities"
DESCRIPTION = "Hardware detection and classification utilities"
LICENSE = "Apache-2.0"

PV = "0.32.0"

RPM_NAME = "python313-hardware-0.32.0-2.2.noarch.rpm"
RPM_HASH = "2fdb1a440235b9ab596bde5dd40b79da5ba4ff2a0be1d561142d8aacedb681b332d60558da3921c53c35f5b538b56d23fb977e72804730c095121cfa30ac21a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hardware \
python3.13dist-hardware \
python313-hardware \
python3dist-hardware"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-pexpect"

inherit rpm
