SUMMARY = "An AST unparser for Python"
DESCRIPTION = "This is a factored out version of ``unparse`` found in the Python \
source distribution; under Demo/parser in Python 2 and under \
Tools/parser in Python 3. \
 \
This library is single-source compatible with Python 2.6 through \
Python 3.5. It is authored by the Python core developers; I have \
simply merged the Python 2.7 and the Python 3.5 source and test \
suites, and added a wrapper. This factoring out is to provide a \
library implementation that supports both versions. \
 \
Added to this is a pretty-printing dump utility function."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.6.3"

RPM_NAME = "python314-astunparse-1.6.3-8.8.aarch64.rpm"
RPM_HASH = "d2609aa0f18940cc7577ede0aa5a7bef93ce81f821263ddf16c65b8c283723aa6dc43573114b0129778da320918439d5b85b1a44f8b9d7bb68acc4a94a0e1022"

RPROVIDES:${PN} += "python3.14dist-astunparse \
python314-astunparse \
python3dist-astunparse"

RDEPENDS:${PN} += "python-abi \
python314-six \
python314-wheel"

inherit rpm
