SUMMARY = "Command line tools for the MathGL library"
DESCRIPTION = "This package contains command line tools for making scientific graphics."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-tools-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "47e2f596bd60de6ecb1bc0125aaa90ad25743fd63de160ea3874ad3492638a37a8bd8fa3b9ae11953bbc5c7ce6798f4fc688356190ac39ea9f5f8259c609f1a7"

RPROVIDES:${PN} += "mathgl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl-fltk.so.8 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
