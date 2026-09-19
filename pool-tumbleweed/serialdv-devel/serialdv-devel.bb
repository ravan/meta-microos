SUMMARY = "Development files for libserialdv"
DESCRIPTION = "A library that provides an interface for audio encoding and decoding with \
AMBE3000 based devices in packet mode over a serial link. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libserialdv."
LICENSE = "GPL-3.0-only"

PV = "1.1.5"

RPM_NAME = "serialdv-devel-1.1.5-1.6.aarch64.rpm"
RPM_HASH = "4d92f51f5fbec91f6583eb8477e7e247e5e4063584122871e490d4849a7af51eba8d1b6425f4bfa7512f9c7ac39dff51fd161146558424624be6c6e579da387a"

RPROVIDES:${PN} += "serialdv-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libserialdv.so.1 \
libserialdv1 \
libstdc++.so.6"

inherit rpm
