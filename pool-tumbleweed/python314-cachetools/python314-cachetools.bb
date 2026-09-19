SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "7.1.7"

RPM_NAME = "python314-cachetools-7.1.7-1.1.noarch.rpm"
RPM_HASH = "6e760625aa15747a1003517f364d86983619467be291a63bad91e0894e059a149129a3a842742685124868f655cf6dc15a48c2a28da3206ad6a79dca93c9b31d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cachetools \
python314-cachetools \
python3dist-cachetools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
