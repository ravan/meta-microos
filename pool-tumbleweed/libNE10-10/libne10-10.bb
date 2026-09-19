SUMMARY = "A library of common math and DSP functions optimized for ARM NEON"
DESCRIPTION = "Ne10 is a library of common functions that have been \
optimised for ARM-based CPUs equipped with NEON SIMD capabilities. \
 \
The library provides some of the fastest implementations of key \
operations available for the ARM v7-A and v8-A architectures, \
particularly focusing on math, signal processing, image processing, \
and physics functions. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libNE10-10-1.2.1-4.3.aarch64.rpm"
RPM_HASH = "ada1d49856f731670d4ed395d6a712fae9b9795797138a887cf2998459d20b09b9ff40a8182c8cef922d65277dfdfd2515bc0c0b96cebee865dbc4260024be2b"

RPROVIDES:${PN} += "libNE10-10 \
libNE10.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
