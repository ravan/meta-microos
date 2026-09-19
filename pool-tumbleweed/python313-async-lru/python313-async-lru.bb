SUMMARY = "Simple LRU cache for asyncio"
DESCRIPTION = "This package is a port of Python's built-in functools.lru_cache function for asyncio. \
To better handle async behaviour, it also ensures multiple concurrent calls will only \
result in 1 call to the wrapped function, with all awaits receiving the result of that \
call when it completes."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python313-async-lru-2.3.0-1.2.noarch.rpm"
RPM_HASH = "a5714a864cf9083196f0fb8a89e829c70ae5a8e636165754fc58164260478a228990068efe27f457426a026863afe5b2579485081ef6148bc1a950e3cc5a6a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-lru \
python3.13dist-async-lru \
python313-async-lru \
python3dist-async-lru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
