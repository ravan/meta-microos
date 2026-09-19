SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python313-wakeonlan-3.3.0-1.2.noarch.rpm"
RPM_HASH = "4e526eed4c47c884453a201ffb95d0267b234742af66ca07b8b184b8c9029e1df080c16384d1100520596bf115482bd884a44543e8da7a1f5ab120f4309dc463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wakeonlan \
python3.13dist-wakeonlan \
python313-wakeonlan \
python3dist-wakeonlan"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
