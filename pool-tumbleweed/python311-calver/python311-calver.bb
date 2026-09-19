SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2025.10.20"

RPM_NAME = "python311-calver-2025.10.20-2.6.noarch.rpm"
RPM_HASH = "e4ba796b3a0d8ef0510c824a7c9c655ff69b5b056c5f1b68abaf86eb49de87edaca487d56e20ac84f191096d3d17c9cabec30661c8893ee70453b34621166b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-calver \
python311-calver \
python3dist-calver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
