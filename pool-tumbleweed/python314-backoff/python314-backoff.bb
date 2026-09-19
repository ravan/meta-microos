SUMMARY = "Function decoration for backoff and retry"
DESCRIPTION = "This module provides function decorators which can be used to wrap a \
function such that it will be retried until some condition is met. It \
is meant to be of use when accessing unreliable resources with the \
potential for intermittent failures i.e. network resources and external \
APIs. Somewhat more generally, it may also be of use for dynamically \
polling resources for externally generated content. \
 \
Decorators support both regular functions for synchronous code and \
`asyncio <https://docs.python.org/3/library/asyncio.html>`_'s coroutines \
for asynchronous code."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python314-backoff-2.2.1-4.5.noarch.rpm"
RPM_HASH = "7e52b4a3ec7bf00fa41628b4e6ac6e3580d711d9163c448ebe5dcaa6e79c816aea8cd08fb0f6bc36197b08424430efbda11e4bee0ab0bf41b94a74db296c4387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-backoff \
python314-backoff \
python3dist-backoff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
