SUMMARY = "Development files for the X11 keyboard UI presentation library"
DESCRIPTION = "libxkbui provides an interface to easily present XKB layouts as \
graphical widgets. \
 \
This package contains the development headers for the library found \
in libxkbui1."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libxkbui-devel-1.0.2-13.11.aarch64.rpm"
RPM_HASH = "bfe53a21ab378b87356084ad878faf3cbd00dd34685ba292ad12b9081cfa735cf79c7889be56c91534ec6d8643a9f6bd80815e7d6f746153bf104279dda6dce4"

RPROVIDES:${PN} += "libxkbui-devel \
pkgconfig-xkbui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbui1 \
pkgconfig-kbproto \
pkgconfig-x11 \
pkgconfig-xt"

inherit rpm
