SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.6.0"

RPM_NAME = "python313-rt-3.6.0-1.4.noarch.rpm"
RPM_HASH = "62f5819131f8448465cc9f133b0d7639741e3c8be9c42d67e8d5e42630df26f6c20753a90f54096a730aa3f3539920ef6e4d420bb8b6f8851a564f175ab577b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rt \
python3.13dist-rt \
python313-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python313-httpx \
python313-requests"

inherit rpm
