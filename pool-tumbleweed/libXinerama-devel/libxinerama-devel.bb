SUMMARY = "Development files for the X11 Xinerama extension"
DESCRIPTION = "Xinerama is an extension to the X Window System which enables \
multi-headed X applications and window managers to use two or more \
physical displays as one large virtual display. \
 \
This package contains the development headers for the library found \
in libXinerama1."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libXinerama-devel-1.1.6-1.4.aarch64.rpm"
RPM_HASH = "d18697eb7776ef4b2331d9a251e8e2b711ea0079b5b51ce9abcbf8398d5027e3ed3929c9384dd455fbf48a70b1802f17ea2fd9b4592cccb2bab6b1e3844d1627"

RPROVIDES:${PN} += "libXinerama-devel \
pkgconfig-xinerama"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXinerama1 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xextproto \
pkgconfig-xineramaproto"

inherit rpm
