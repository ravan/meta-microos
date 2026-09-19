SUMMARY = "Header files for the GNUstep Objective-C runtime"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications with the GNUstep Objective-C runtime."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "libobjc2-devel-2.3-1.4.aarch64.rpm"
RPM_HASH = "2749fa23a3c49ba250ebf20e2aa4c0236f26eebaa22c1848ee6ae6daad314c1c4c38d6e46b8e473b4da813bc595ea8d8e98f9c2ba05ce878940c92c410d62b0a"

RPROVIDES:${PN} += "cmake-libobjc \
libobjc2-devel \
pkgconfig-libobjc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libobjc4-6"

inherit rpm
