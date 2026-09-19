SUMMARY = "Documentation for the cfitsio library"
DESCRIPTION = "This package contains documentation for the cfitsio library."
LICENSE = "NASA-1.3"

PV = "4.7.0"

RPM_NAME = "cfitsio-devel-doc-4.7.0-1.1.noarch.rpm"
RPM_HASH = "365ffea239f21f481840a67715763298d6d1bb295f656e65d46709733f9aa29ddc397c3f54ac9fa1c34a912d134643e49bbb69c07aeffb4ffe57d49997bc0060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfitsio-devel-doc \
libcfitsio-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
