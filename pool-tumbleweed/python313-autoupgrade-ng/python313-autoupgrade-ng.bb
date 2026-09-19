SUMMARY = "Automatic upgrade of PyPI packages"
DESCRIPTION = "Automatic upgrade of PyPI packages from within Python scripts \
 \
The upgrade will be unattended and the python script will be restarted. \
 \
Old methods are still supported."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-autoupgrade-ng-0.3.0-4.5.noarch.rpm"
RPM_HASH = "37f7d11cdc4e60fe72bfb5f25911276e99911387576f3f6a4a444fbd27ec49c8c6e50f29ca8dc1a00a54b7a391f88fa8d197f41c8404f39064b89b2cf0f1c889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoupgrade-ng \
python3.13dist-autoupgrade-ng \
python313-autoupgrade-ng \
python3dist-autoupgrade-ng"

RDEPENDS:${PN} += "python-abi \
python313-pip"

inherit rpm
