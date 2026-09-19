SUMMARY = "Header files for the liblo OSC implementation"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of liblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.36"

RPM_NAME = "liblo-devel-0.36-1.3.aarch64.rpm"
RPM_HASH = "d99da963e6621314dc87ab3320982faf1d687b2fade63303b1d0cc3f8df578b90b3c5b7c144144a6bd37f7b26589935884e4d762a52dc7b6f76ba3f692171e45"

RPROVIDES:${PN} += "liblo-devel \
pkgconfig-liblo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblo.so.7 \
liblo7"

inherit rpm
