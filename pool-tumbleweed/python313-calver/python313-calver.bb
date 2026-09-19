SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2025.10.20"

RPM_NAME = "python313-calver-2025.10.20-2.6.noarch.rpm"
RPM_HASH = "1343c58c56c88a78c08325b8f1afa9af36cf354f7cfb537f990e50069d79d9e32ec78b5c910bb29a8ade3688c4625cbbd874f86b0865e769d462c0cd04e96699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calver \
python3.13dist-calver \
python313-calver \
python3dist-calver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
