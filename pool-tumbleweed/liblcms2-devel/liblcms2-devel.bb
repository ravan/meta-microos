SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "MIT"

PV = "2.19.1"

RPM_NAME = "liblcms2-devel-2.19.1-1.3.aarch64.rpm"
RPM_HASH = "37f45f6069ccde4132fba92e21dbe4ff4b18cbfcd53982cdce3cc346b7a8b9cb8cea03a1fcc6060c617378e6633425ab776ff2a69855b709ad33bfdb8dd86ba0"

RPROVIDES:${PN} += "liblcms2-devel \
pkgconfig-lcms2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liblcms2-2"

inherit rpm
