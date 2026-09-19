SUMMARY = "Recast Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the recast library of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.6.0"

RPM_NAME = "libRecast1-1.6.0-1.9.aarch64.rpm"
RPM_HASH = "222ed8a2dedaf97c40c420ec19865359b82e440015fb185dc5b780c916e6356c21aa62db7d9cd48a09d746f4487304ddfa903bffbb2406528b14ee5baf8375cc"

RPROVIDES:${PN} += "libRecast.so.1 \
libRecast1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
