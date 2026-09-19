SUMMARY = "API documentation for FFLAS-FFPACK"
DESCRIPTION = "The FFLAS-FFPACK library provides functionalities for dense linear \
algebra over word size prime finite field. \
 \
This subpackage contains the Doxygen-generated HTML documentation for \
the FFLAS-FFPACK API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "fflas-ffpack-doc-2.5.0-1.15.noarch.rpm"
RPM_HASH = "8bdbe045ba05cb9e973c4c274607f6513fdf4bcf0bdebf969f452e82f89065a5fdbda4c75b317cd1fdc6a44cea3d119404d6f46df772e36e8c261261a1601734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fflas-ffpack-doc"

RDEPENDS:${PN} += ""

inherit rpm
