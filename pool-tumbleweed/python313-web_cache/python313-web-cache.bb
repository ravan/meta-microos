SUMMARY = "Persistent cache storage python module"
DESCRIPTION = "Python module for simple key-value storage backed up by sqlite3 \
database. The typical use case is a URL to HTTP data cache, but it can \
also be used fo non web resources. It features different cache eviction \
strategies and optional compression."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "python313-web_cache-1.1.0-4.5.noarch.rpm"
RPM_HASH = "d4cd507b5729f4720ae7947d3ca9cfff09b7573f6443ebcdedface5eba39b9f20ef2646c0ff12416715484e263a3f0a2a877d4d1dc4452eb731412108a7f2f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-web-cache \
python3.13dist-web-cache \
python313-web-cache \
python3dist-web-cache"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
