SUMMARY = "Header Files and C API Documentation for Tk"
DESCRIPTION = "This package contains header files and documentation needed for writing \
Tk extensions in compiled languages like C, C++, etc., or for embedding \
Tk in programs written in such languages. \
 \
This package is not needed for writing extensions or applications for \
Tk in the Tcl language itself. \
 \
 \
 \
Authors: \
-------- \
    The Tcl Core Team <tcl-core@lists.sourceforge.net>"
LICENSE = "TCL"

PV = "8.6.18"

RPM_NAME = "tk-devel-8.6.18-1.3.aarch64.rpm"
RPM_HASH = "6deaf75e6de4b2b2d50a337c12883251ba038d2e32bcd24f240c1c8503b86b43414e934d9a2b2df0b8cee2cdb67bf785e998540ec09438d8a253241ae697857f"

RPROVIDES:${PN} += "pkgconfig-tk \
tk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-tcl \
tcl-devel \
tk \
xorg-x11-libX11-devel"

inherit rpm
