SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.23.0"

RPM_NAME = "python313-matrix-nio-0.23.0-1.11.noarch.rpm"
RPM_HASH = "b18304f015dfdc1273c04a5bfc3828fc3b646c92b863e56303187f0a2580ed0f276a14c5b5c3162f02d60a257d01db14a20225561cf93ace43f10144697cac6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matrix-nio \
python3.13dist-matrix-nio \
python313-matrix-nio \
python3dist-matrix-nio"

RDEPENDS:${PN} += "python-abi \
python313-aiofiles \
python313-aiohttp \
python313-aiohttp-socks \
python313-h11 \
python313-h2 \
python313-jsonschema \
python313-pycryptodome \
python313-unpaddedbase64"

inherit rpm
