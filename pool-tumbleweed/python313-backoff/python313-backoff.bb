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

RPM_NAME = "python313-backoff-2.2.1-4.5.noarch.rpm"
RPM_HASH = "21a9e838e14f83972b412f3e32c7064005cf65123d8f7d6a0dc595e5bca3fabd928cba858237f95839bb119fa49b1f05584bf77f9117937505d2f5d14a528f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backoff \
python3.13dist-backoff \
python313-backoff \
python3dist-backoff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
