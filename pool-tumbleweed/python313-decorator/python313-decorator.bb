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

RPM_NAME = "python313-decorator-5.3.1-1.2.noarch.rpm"
RPM_HASH = "537175215e315a5f94968a5e970bd480a01c74efb8ed7fff2600c120e1d29dda6daee5fd4189c2f42f70d850b4592cacd8beab2829d1b4415516946ecb412891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-decorator \
python3.13dist-decorator \
python313-decorator \
python3dist-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
