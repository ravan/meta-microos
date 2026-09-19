SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.6.0"

RPM_NAME = "python314-rt-3.6.0-1.4.noarch.rpm"
RPM_HASH = "5b0c3061535e2c05463de940bf5f1023c65e98cd8c69d0fc7d78632aa228bdb6515baa36741db4e31319818e23ef6d2c86a1a976d843dc8d449fc11808bb54be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rt \
python314-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python314-httpx \
python314-requests"

inherit rpm
