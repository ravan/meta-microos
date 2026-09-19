SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python314-async-lru-2.3.0-1.2.noarch.rpm"
RPM_HASH = "96e756964aa8d324e855085e9b2f55ce3309e06896ec6bbc1090639e8e1b7dd84930db6105e6f456ca766b7ea2a73b5958811137bfea32d76e9c7ee806229e66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-async-lru \
python314-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
