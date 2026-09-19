SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python314-cachelib-0.13.0-1.3.noarch.rpm"
RPM_HASH = "2372ce284f1962c70a640333b5880afceef8dd2193d79eec5892ec67c36df0bf33ca18d8251a48f0016409e9a423611665192afd395d5cca0a4c42067c14d396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cachelib \
python314-cachelib \
python3dist-cachelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
