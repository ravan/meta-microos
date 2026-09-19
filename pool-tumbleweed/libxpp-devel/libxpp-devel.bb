SUMMARY = "A library providing a modern C++ API for the Linux operating system"
DESCRIPTION = "A library providing an object oriented C++ API wrapper for parts of the X11 \
API. \
 \
Header and development files for libxpp."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "libxpp-devel-0.3.3-1.3.aarch64.rpm"
RPM_HASH = "8d942b180e6cf64546fca88fc3d68fc7243e8054452d621aef40953cdebef8d6a9229356bd1f160447634320d90cbc46bcccfde5b48a74c5c6f931e866489571"

RPROVIDES:${PN} += "libxpp-devel \
pkgconfig-libxpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel \
libxpp-3 \
pkgconfig-libcosmos \
pkgconfig-x11"

inherit rpm
