SUMMARY = "Development files for Ne10, a math/DSP library for ARM NEON"
DESCRIPTION = "The library provides some of the fastest implementations of key \
operations available for the ARM v7-A and v8-A architectures, \
particularly focusing on math, signal processing, image processing, \
and physics functions. \
 \
This package contains the development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "Ne10-devel-1.2.1-4.3.aarch64.rpm"
RPM_HASH = "cafbc7e6c87b86316e63ac52d5bd2b1f9d3fc70f78de988f391aba69847883b2411c8244e2259df4a692cf5bce7ef67edc904832301aef4724397e2dda7c803a"

RPROVIDES:${PN} += "Ne10-devel"

RDEPENDS:${PN} += "libNE10-10 \
libNE10-test10"

inherit rpm
