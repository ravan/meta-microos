SUMMARY = "PAM interface using ctypes"
DESCRIPTION = "PAM interface using ctypes."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-pamela-1.2.0-2.5.noarch.rpm"
RPM_HASH = "014e8b9d7d59fb348e1126630f34c8de9de6bc160205c249eb52b2c11d6380abfbd4e4665063cf702bcc43e446ba191c4b5fa13c7d2eeab43f394018ff06d774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pamela \
python314-pamela \
python3dist-pamela"

RDEPENDS:${PN} += "python-abi"

inherit rpm
