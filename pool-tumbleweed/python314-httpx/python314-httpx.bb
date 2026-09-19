SUMMARY = "Python HTTP client with async support"
DESCRIPTION = "Python HTTP client with async support."
LICENSE = "BSD-3-Clause"

PV = "0.28.1"

RPM_NAME = "python314-httpx-0.28.1-4.4.noarch.rpm"
RPM_HASH = "8b931caa2711fcfdd0a0d0e678fd0b4d50026cd76287689a2a00c467a499af5d085d23f2d69ac36d3be15bd387a9def1e93ae9196a174c6b7431612d235fe9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpx \
python314-httpx \
python3dist-httpx"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-anyio \
python314-certifi \
python314-httpcore \
python314-idna"

inherit rpm
