SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2025.10.20"

RPM_NAME = "python314-calver-2025.10.20-2.6.noarch.rpm"
RPM_HASH = "b129ebc8d2c36b5620785241476d523bc438bd1b32d175fc3babedf417ff439f793c1d8203688e9444cfcb04337f7dd5b37d9396d48a8ab70ce1e5096f240f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-calver \
python314-calver \
python3dist-calver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
