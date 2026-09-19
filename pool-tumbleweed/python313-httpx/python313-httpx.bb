SUMMARY = "Python HTTP client with async support"
DESCRIPTION = "Python HTTP client with async support."
LICENSE = "BSD-3-Clause"

PV = "0.28.1"

RPM_NAME = "python313-httpx-0.28.1-4.4.noarch.rpm"
RPM_HASH = "143d99a34bafc90970d76c5cfec726b6091553ba96396b41a926a836be18e0f8c5dd85270970fbfa1baa7442dedec374b08df4ded85cf38a4f3b4077f3c47ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpx \
python3.13dist-httpx \
python313-httpx \
python3dist-httpx"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-anyio \
python313-certifi \
python313-httpcore \
python313-idna"

inherit rpm
