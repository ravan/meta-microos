SUMMARY = "Core utilities for legacy Python packages"
DESCRIPTION = "Core utilities for legacy Python packages"
LICENSE = "Apache-2.0 | BSD-2-Clause"

PV = "23.0.post0"

RPM_NAME = "python314-packaging-legacy-23.0.post0-1.2.noarch.rpm"
RPM_HASH = "013d328a2e6e7d6b91572d11d8c5f740d3af1add6c40e3eed25026527433390c7f104325bade3de0f2889ab4bd64abf24f8a9f760d59826fcaad34f3e612b531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-packaging-legacy \
python314-packaging-legacy \
python3dist-packaging-legacy"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
