SUMMARY = "Pool of asyncio coroutines with familiar interface"
DESCRIPTION = "Pool of asyncio coroutines with familiar interface. Supports python 3.5+ (including PyPy 6+, which is also 3.5 atm) \
 \
AioPool makes sure _no more_ and _no less_ (if possible) than `size` spawned coroutines are active at the same time. _spawned_ means created and scheduled with one of the pool interface methods, _active_ means coroutine function started executing it's code, as opposed to _waiting_ -- which waits for pool space without entering coroutine function."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-asyncio-pool-0.6.0-1.5.noarch.rpm"
RPM_HASH = "a53d0d94f0af74682c4f73f9a6e38bfed59d7d9516ca5bcf86487ad5552cc8b7be38442d3564606ef27e4437b51b4929006b5e1c38c5e53332add6f0ebe24660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asyncio-pool \
python314-asyncio-pool \
python3dist-asyncio-pool"

RDEPENDS:${PN} += "python-abi"

inherit rpm
