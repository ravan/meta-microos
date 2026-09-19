SUMMARY = "Shared library for Clipper2"
DESCRIPTION = "The Clipper2 library performs intersection, union, difference and XOR boolean \
operations on both simple and complex polygons. It also performs polygon \
offsetting. This is a major update of my original Clipper library that was \
written over 10 years ago. That library I'm now calling Clipper1, and while it \
still works very well, Clipper2 is better in just about every way."
LICENSE = "BSL-1.0"

PV = "2.0.1"

RPM_NAME = "libClipper2-2-2.0.1-1.4.aarch64.rpm"
RPM_HASH = "9d9ad9bafde64b9f0ebef69c2c49bf5a62df7595435b488cc27379bdf73e8703df56976700edeab8663b2a231b71bc4f0fbf4c149fff4c6d0d5dd346a7594739"

RPROVIDES:${PN} += "libClipper2-2 \
libClipper2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
