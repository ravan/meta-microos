SUMMARY = "Development files for the X Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images. \
 \
This package contains the development headers for the library found \
in libXaw3d6/libXaw3d7/libXaw3d8."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "libXaw3d-devel-1.6.6-1.9.aarch64.rpm"
RPM_HASH = "8c6971e10d9d3f7168140eff5261b801333e6e4c956c0b5927580757757af522ced1f230fa2f9e4bb57a73beeea3db8f17b02bfe7870525f5c316ab45afc8032"

RPROVIDES:${PN} += "libXaw3d-devel \
pkgconfig-xaw3d \
xaw3d-/usr/include/X11/Xaw3d/Xaw3dP.h \
xaw3d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXaw3d6 \
libXaw3d7 \
libXaw3d8 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xmu \
pkgconfig-xproto \
pkgconfig-xt"

inherit rpm
