SUMMARY = "Persistent cache storage python module"
DESCRIPTION = "Python module for simple key-value storage backed up by sqlite3 \
database. The typical use case is a URL to HTTP data cache, but it can \
also be used fo non web resources. It features different cache eviction \
strategies and optional compression."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "python314-web_cache-1.1.0-4.5.noarch.rpm"
RPM_HASH = "f902df67c53b2b2bc253f301912301cbb9abe398022efac463e7c628bfcb0436e24bade4968846a9b140e6daecfb3451ab21a390495599e96d256d9cc03a182d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-web-cache \
python314-web-cache \
python3dist-web-cache"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
