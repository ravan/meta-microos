SUMMARY = "A(Sync) Interface for internal Audible API"
DESCRIPTION = "A(Sync) Interface for internal Audible API written in pure Python."
LICENSE = "AGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python314-audible-0.12.0-1.1.noarch.rpm"
RPM_HASH = "5b0b44f0d05e6924cac83ca45023bdae9be7a20a5418444365090f7da8138c244cf7fc49f10ace9cea34b59782865edd9eac0ab21791b3ee72f913dd63241d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-audible \
python314-audible \
python3dist-audible"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-beautifulsoup4 \
python314-httpx \
python314-pbkdf2 \
python314-pyaes \
python314-rsa"

inherit rpm
