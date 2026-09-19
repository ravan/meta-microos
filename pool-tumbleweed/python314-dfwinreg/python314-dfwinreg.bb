SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20260411"

RPM_NAME = "python314-dfwinreg-0~20260411-1.2.noarch.rpm"
RPM_HASH = "3a8333c4d4f068aa341e9c286386e98ca668961849b4002afbb877a7e4492f3cd4d6fe07fe7892eb8e904f879baec1540f269156685000f18e9d5c1e0e68caf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dfwinreg \
python314-dfwinreg \
python3dist-dfwinreg"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-dfdatetime \
python314-dtfabric \
python314-libcreg \
python314-libregf"

inherit rpm
