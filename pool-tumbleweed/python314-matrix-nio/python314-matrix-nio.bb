SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.23.0"

RPM_NAME = "python314-matrix-nio-0.23.0-1.11.noarch.rpm"
RPM_HASH = "6f919f2e917baff9fdc0dfbe6f5def1d0c6d5a76a1763e84e5558aea2b2c7619dd81f0015c34d5b7999e9e902d8038c8b88b361ba4c4c30c62fdd00897ab25e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-matrix-nio \
python314-matrix-nio \
python3dist-matrix-nio"

RDEPENDS:${PN} += "python-abi \
python314-aiofiles \
python314-aiohttp \
python314-aiohttp-socks \
python314-h11 \
python314-h2 \
python314-jsonschema \
python314-pycryptodome \
python314-unpaddedbase64"

inherit rpm
