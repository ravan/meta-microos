SUMMARY = "Development files for the XFree86-DGA extension library"
DESCRIPTION = "libXxf86dga provides the XFree86-DGA extension, which allows direct \
graphics access to a framebuffer-like region, and also allows \
relative mouse reporting, et al. It is mainly used by games and \
emulators for games. \
 \
This package contains the development headers for the library found \
in libXxf86dga1."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libXxf86dga-devel-1.1.7-1.4.aarch64.rpm"
RPM_HASH = "37340def51cd2fec3ace4535b3ba6964f23c4be985fb97f07fb857a2d30072150e4b9403d38cdc80642b6ebbd3aa61d73c97c606d39ba7853e32db2f48621700"

RPROVIDES:${PN} += "libXxf86dga-devel \
pkgconfig-xxf86dga"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXxf86dga1 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xf86dgaproto"

inherit rpm
