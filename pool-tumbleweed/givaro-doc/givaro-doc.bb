SUMMARY = "API documentation for the Givaro library, in HTML"
DESCRIPTION = "Givaro is a C++ library for arithmetic and algebraic computations. \
 \
This subpackage contains the Doxygen-generated HTML documentation for \
the Givaro API."
LICENSE = "CECILL-B"

PV = "4.2.2"

RPM_NAME = "givaro-doc-4.2.2-1.3.noarch.rpm"
RPM_HASH = "9ec7e92a0a9fdb5c3c371f4ddb0e20ee648e95d1dda9d4aa810f20da954b121ce195953f7ec60b38595650f72a6910a0ba3b787ae498adbc6a94ea132392b2d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "givaro-doc"

RDEPENDS:${PN} += ""

inherit rpm
