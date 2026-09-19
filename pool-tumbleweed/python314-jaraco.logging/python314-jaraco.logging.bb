SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python314-jaraco.logging-3.4.0-1.3.noarch.rpm"
RPM_HASH = "926bb8003f73dca50ba8b89c46fc405d11e7b748e4ff65dd28e946025111e714c78d51ae66d2ec7c9a77f7b25d8747f5effcd4d1e2e065a10a5f43b25b7e5efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.logging \
python314-jaraco.logging \
python3dist-jaraco.logging"

RDEPENDS:${PN} += "python-abi \
python314-tempora"

inherit rpm
