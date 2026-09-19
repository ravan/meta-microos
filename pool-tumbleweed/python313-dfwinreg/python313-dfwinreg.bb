SUMMARY = "Digital Forensics Windows Registry"
DESCRIPTION = "dfwinreg, or Digital Forensics Windows Registry, is a Python module that provides read-only access to Windows Registry objects."
LICENSE = "Apache-2.0"

PV = "0~20260411"

RPM_NAME = "python313-dfwinreg-0~20260411-1.2.noarch.rpm"
RPM_HASH = "abb2fe5910e2f761011f5e76fd7839e3d92d7668ffd4a0a5a3cff6f79fdfaf36b6f4a37909af1e0c84bc07f3e158b8530b3abd6bd9a302a562ac55612082faf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfwinreg \
python3.13dist-dfwinreg \
python313-dfwinreg \
python3dist-dfwinreg"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-dfdatetime \
python313-dtfabric \
python313-libcreg \
python313-libregf"

inherit rpm
