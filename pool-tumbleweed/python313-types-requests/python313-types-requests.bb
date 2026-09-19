SUMMARY = "Typing stubs for requests"
DESCRIPTION = "Typing stubs for requests \
This is a PEP 561 type stub package for the requests package. It can be used by \
type-checking tools like mypy, PyCharm, pytype etc. to check code that uses \
requests. The source for this package can be found at \
https://github.com/python/typeshed/tree/master/stubs/requests. All fixes for \
types and metadata should be contributed there. \
 \
See https://github.com/python/typeshed/blob/master/README.md for more details."
LICENSE = "Apache-2.0"

PV = "2.32.0.20241016"

RPM_NAME = "python313-types-requests-2.32.0.20241016-1.8.noarch.rpm"
RPM_HASH = "90bd9e42c005e6aa435739231a6d872bba296b949885623e9f23d7979709faba5c34479b249e3a2e2fb81bd464c3fae5ba660f2839917f70124a53d74b591212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-types-requests \
python3.13dist-types-requests \
python313-types-requests \
python3dist-types-requests"

RDEPENDS:${PN} += "python313-urllib3"

inherit rpm
