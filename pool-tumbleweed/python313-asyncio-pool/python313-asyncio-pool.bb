SUMMARY = "Pool of asyncio coroutines with familiar interface"
DESCRIPTION = "Pool of asyncio coroutines with familiar interface. Supports python 3.5+ (including PyPy 6+, which is also 3.5 atm) \
 \
AioPool makes sure _no more_ and _no less_ (if possible) than `size` spawned coroutines are active at the same time. _spawned_ means created and scheduled with one of the pool interface methods, _active_ means coroutine function started executing it's code, as opposed to _waiting_ -- which waits for pool space without entering coroutine function."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-asyncio-pool-0.6.0-1.5.noarch.rpm"
RPM_HASH = "5ab8de64a4f3287cd85bd24ed90d29773be09250af8a64315e275ccea1c1d60e5ed8fb82d6bb6ee1d47ce74ada290e28e31c5e1fe4fe8944ed22c3cce97c8342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asyncio-pool \
python3.13dist-asyncio-pool \
python313-asyncio-pool \
python3dist-asyncio-pool"

RDEPENDS:${PN} += "python-abi"

inherit rpm
