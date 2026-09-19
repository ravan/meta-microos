SUMMARY = "Header Files and C API Documentation for Tcl"
DESCRIPTION = "This package contains header files and documentation needed for writing \
Tcl extensions in compiled languages like C, C++, etc., or for \
embedding the Tcl interpreter in programs written in such languages. \
 \
This package is not needed for writing extensions or applications in \
the Tcl language itself."
LICENSE = "TCL"

PV = "8.6.18"

RPM_NAME = "tcl-devel-8.6.18-2.1.aarch64.rpm"
RPM_HASH = "20d086e7db8b405726d315ee55c179e3f3949bc94fccd9e6216f72c700e687c2997e3ac2868afcde2e8e95abdfbca5a88795076f39072f421362d74f500c144c"

RPROVIDES:${PN} += "itcl-devel \
pkgconfig-tcl \
tcl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-zlib \
tcl"

inherit rpm
