SUMMARY = "Development files for the X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library. \
 \
This package contains the development headers for the library found \
in libXaw6/libXaw7/libXaw8."
LICENSE = "MIT"

PV = "1.0.16"

RPM_NAME = "libXaw-devel-1.0.16-1.9.aarch64.rpm"
RPM_HASH = "b4303c71850350aa4cb9160e09e980b125bf739803c1606a9afb1ad4dbdbaa9a444676ab8bb142f4eb7d0237b6bf0496895f6afbb6be9605d75d283d2ef01e31"

RPROVIDES:${PN} += "libXaw-devel \
pkgconfig-xaw6 \
pkgconfig-xaw7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXaw6 \
libXaw7 \
libXaw8 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xmu \
pkgconfig-xpm \
pkgconfig-xproto \
pkgconfig-xt"

inherit rpm
