SUMMARY = "Port of node-semver"
DESCRIPTION = "python version of node-semver (https://github.com/isaacs/node-semver)"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python313-node-semver-0.9.1-1.2.noarch.rpm"
RPM_HASH = "4aefd8a70af29c42d7de711fdafda4861becd5206e0bcda078feb7df4908bddf869c6af7c6a84503b71e349e5e66e48ffabede36a2868c0a8a285712cee1200f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-node-semver \
python3.13dist-node-semver \
python313-node-semver \
python3dist-node-semver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
