SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "7.1.7"

RPM_NAME = "python313-cachetools-7.1.7-1.1.noarch.rpm"
RPM_HASH = "974db1803963f999d52b733bd4e34e8593d39b4c85b2535b39ac56a9bd6585dd4a6e4025226f0267ced98f563fb41fd94b3ca8b00773c67942a1b1f177f43f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachetools \
python3.13dist-cachetools \
python313-cachetools \
python3dist-cachetools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
