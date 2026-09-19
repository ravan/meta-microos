SUMMARY = "Development files for libfmos"
DESCRIPTION = "libfmos is a library for MacOS data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfmos."
LICENSE = "LGPL-3.0-or-later"

PV = "20260520"

RPM_NAME = "libfmos-devel-20260520-1.8.aarch64.rpm"
RPM_HASH = "f1ea170774e3f3da95d060a9d1b088a6ba04cbb448e25058f22dc4d74832d73a00dfa2ec8764e257bf6b969d06d31c13c306adb7325057d2ef977b68dc8aa4b8"

RPROVIDES:${PN} += "libfmos-devel \
pkgconfig-libfmos"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmos1"

inherit rpm
