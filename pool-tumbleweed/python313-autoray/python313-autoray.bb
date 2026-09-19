SUMMARY = "A lightweight python automatic-array library"
DESCRIPTION = "Write backend agnostic numeric code compatible with any numpy-ish array library."
LICENSE = "Apache-2.0"

PV = "0.8.11"

RPM_NAME = "python313-autoray-0.8.11-1.3.noarch.rpm"
RPM_HASH = "d0892f0ec7c80e4437cadb21a54f7757662ea4261375a1e212a4b1e1d3bef71bffceb82bef981d2544e2b48dd1a323019330131e002bb926e7fb5ec66a1c6abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoray \
python3.13dist-autoray \
python313-autoray \
python3dist-autoray"

RDEPENDS:${PN} += "python-abi"

inherit rpm
