SUMMARY = "Header files for libite"
DESCRIPTION = "Development and header files for libite."
LICENSE = "MIT & X11"

PV = "2.6.2"

RPM_NAME = "libite-devel-2.6.2-1.4.aarch64.rpm"
RPM_HASH = "2e65bd8b8877527e1ce8b62ba51d16b826d4fd6c2cf591aaa6abf9ceff5542cb178819674766ba199ed0b6b49a7bf59c0aefc1237d6d59c8e506212932c6a30c"

RPROVIDES:${PN} += "libite-devel \
pkgconfig-libite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libite5"

inherit rpm
