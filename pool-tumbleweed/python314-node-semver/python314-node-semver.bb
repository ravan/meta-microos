SUMMARY = "Port of node-semver"
DESCRIPTION = "python version of node-semver (https://github.com/isaacs/node-semver)"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python314-node-semver-0.9.1-1.2.noarch.rpm"
RPM_HASH = "02340f02584cef57f2ae3d4e61092212adbba5a994cd32ac64633c8a0e3e128adf19e79a4be73f6ed3706826cf7f131b516837928da326c847a146d6b8490cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-node-semver \
python314-node-semver \
python3dist-node-semver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
