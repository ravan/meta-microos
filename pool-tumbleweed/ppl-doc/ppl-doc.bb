SUMMARY = "Documentation for the Parma Polyhedra Library"
DESCRIPTION = "This package contains all the documentations required by programmers \
using the Parma Polyhedra Library (PPL). Install this package if you \
want to program with the PPL."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-doc-1.2-3.12.noarch.rpm"
RPM_HASH = "c70d0ea84857ca023056fde2e327fd82eb06c7b89f05555858a9b447119ecc3f78ad6fc04df56896781975f35798ab8c4feb8257b55375fd465126ac2d7bc496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ppl-doc"

RDEPENDS:${PN} += ""

inherit rpm
