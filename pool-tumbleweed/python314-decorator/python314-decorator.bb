SUMMARY = "Decorators for Humans"
DESCRIPTION = "Typical implementations of Python decorators involve nested \
functions, and do not preserve the signature of decorated functions, \
thus can be confusing to both developers and documentation tools. \
 \
This module changes the usage of decorators for the average \
programmer so as to make decorators such as memoize, tracing, \
redirecting_stdout, locked, etc. more accessible."
LICENSE = "BSD-2-Clause"

PV = "5.3.1"

RPM_NAME = "python314-decorator-5.3.1-1.2.noarch.rpm"
RPM_HASH = "214cae3945244a84d04fa253f5b6404c55b843043306babaefb9f46a8c7a021005923628d5efaf75c04348060fd8ee29a7abf99626425812886e8f333ba46689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-decorator \
python314-decorator \
python3dist-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
