SUMMARY = "Python client for Valkey forked from redis-py"
DESCRIPTION = "Python client for Valkey forked from redis-py"
LICENSE = "MIT"

PV = "6.1.1"

RPM_NAME = "python313-valkey-6.1.1-4.1.noarch.rpm"
RPM_HASH = "645ea1e55be7f33a43dcd246684e92d272f41dd08aa98f8aae4f48635e43b59414566802610dc7f9bd2597c9ffd441ce65596166cddec1549c7caa8125323995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-valkey \
python3.13dist-valkey \
python313-valkey \
python3dist-valkey"

RDEPENDS:${PN} += "python-abi"

inherit rpm
