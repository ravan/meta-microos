SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.36.2"

RPM_NAME = "python314-pytest-httpx-0.36.2-1.2.noarch.rpm"
RPM_HASH = "c8c45f8aed1a77333668151f808ab7fa53d2d04ae4ed16d4ce334c7014bc9591f3bdcc186bb660054b2e24b9d5291a09d89ab2d686ead793136528fa9bca2c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-httpx \
python314-pytest-httpx \
python3dist-pytest-httpx"

RDEPENDS:${PN} += "-python314-httpx >= 0.28.0 with python314-httpx < 0.29 \
python-abi \
python314-pytest"

inherit rpm
