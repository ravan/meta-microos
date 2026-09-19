SUMMARY = "Bound Book Format container for comics and manga"
DESCRIPTION = "Bound Book Format (.bbf) is a high-performance binary container designed \
specifically for digital comic books and manga. Unlike CBR/CBZ, BBF is built \
for DirectSotrage/mmap, easy integrity checks, and mixed-codec \
containerization. \
 \
This package contains the shared library"
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "libbbf3-3.0.1-1.3.aarch64.rpm"
RPM_HASH = "a7d577ee045c7e52f9508fcdce2bcd0ab4fb4ca1c4e44e3cc00aa6b4b0a853ae84d87a1dc5dfbf632375047f120f1ef621ede9bcfaa21631d3a822a1fdffe294"

RPROVIDES:${PN} += "libbbf3 \
liblibbbf-shared.so.3 \
liblibbbf.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
