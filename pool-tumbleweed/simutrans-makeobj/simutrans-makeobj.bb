SUMMARY = "Tool for compiling simutrans data packages"
DESCRIPTION = "Makeobj is a easy to use software used to compile .dat files and .png pictures \
to simutrans .pak files."
LICENSE = "Artistic-1.0"

PV = "124.4.1"

RPM_NAME = "simutrans-makeobj-124.4.1-1.2.aarch64.rpm"
RPM_HASH = "c1644e68b758318fcff3c39405cf7427d87475168a22990c00ce957503e79f243ab543b4081303fd4f993e0f8383c4092873d6f802ceb3dd539e50d4c61b0110"

RPROVIDES:${PN} += "simutrans-makeobj"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
