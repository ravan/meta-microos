SUMMARY = "Shared library for Clipper2"
DESCRIPTION = "The Clipper2 library performs intersection, union, difference and XOR boolean \
operations on both simple and complex polygons. It also performs polygon \
offsetting. This is a major update of my original Clipper library that was \
written over 10 years ago. That library I'm now calling Clipper1, and while it \
still works very well, Clipper2 is better in just about every way."
LICENSE = "BSL-1.0"

PV = "2.0.1"

RPM_NAME = "libClipper2Z2-2.0.1-1.4.aarch64.rpm"
RPM_HASH = "1bdc1edc628b3c615a107f4d3cb0e0535806938ad3cf52104716e6f16dc4b9d2d96440ef07b8401589eca59200df653ae39a3c615b10d5d20f1a3f2d29660829"

RPROVIDES:${PN} += "libClipper2Z.so.2 \
libClipper2Z2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
