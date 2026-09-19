SUMMARY = "Multithreaded Click apps made easy"
DESCRIPTION = "Utilities for multithreading in click <http://click.pocoo.org/>. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-click-threading-0.5.0-2.5.noarch.rpm"
RPM_HASH = "ea40b9b2213a40197caea5f660623e565cf1eb001c29cf72e1d0a66ef51c5ffa88daed50e66f714b9c70bb6d53b7047f7d32e021b0532ee3a90d9b5894b9ab39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-threading \
python3.13dist-click-threading \
python313-click-threading \
python3dist-click-threading"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
