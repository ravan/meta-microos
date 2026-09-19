SUMMARY = "An implementation of JPEG2000 Part-15"
DESCRIPTION = "This package contains libopenjph, a library implementing the JPEG-2000 \
standard Part 15."
LICENSE = "BSD-2-Clause"

PV = "0.31.0"

RPM_NAME = "openjph-0.31.0-1.1.aarch64.rpm"
RPM_HASH = "3f4d7f67a7651598c58183969ddf664a80f64c99a7ab3fea48421c3ec3fb061f46c66c07a4404ffee9afb082dbc83bd78b08c06e52f2972916780cefe132c36f"

RPROVIDES:${PN} += "openjph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenjph.so.0.31 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
