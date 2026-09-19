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

RPM_NAME = "python314-types-requests-2.32.0.20241016-1.8.noarch.rpm"
RPM_HASH = "22d96a982900a695fd603c49279508f35bbfcabd0cb6c26e3f528cf1c4f6e51a2109b77970aabeb72ed6af0d363e59b9537e5e57cf918bea27d171bc24bcfe24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-types-requests \
python314-types-requests \
python3dist-types-requests"

RDEPENDS:${PN} += "python314-urllib3"

inherit rpm
