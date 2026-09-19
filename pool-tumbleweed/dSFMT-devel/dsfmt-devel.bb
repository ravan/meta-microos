SUMMARY = "Double precision SIMD-oriented Fast Mersenne Twister"
DESCRIPTION = "Double precision SIMD-oriented Fast Mersenne Twister (dSFMT) \
 \
The purpose of dSFMT is to speed up the generation by avoiding the expensive \
conversion of integer to double (floating point). dSFMT directly generates \
double precision floating point pseudorandom numbers which have the IEEE \
Standard for Binary Floating-Point Arithmetic (ANSI/IEEE Std 754-1985) format. \
dSFMT is only available on the CPUs which use IEEE 754 format double \
precision floating point numbers. \
 \
This package provides libraries and header files for developing applications \
that use dSFMT."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "dSFMT-devel-2.2.5-2.9.aarch64.rpm"
RPM_HASH = "33aaf3b4ea8325600300e557a3e79d56ec4c133f5b61c7245ebd679a70a34db7adfbfcb364306d7197bdecf2dcd8f1325e298ec3b6385ad0e9970038491991b6"

RPROVIDES:${PN} += "dSFMT-devel"

RDEPENDS:${PN} += "libdSFMT2-2"

inherit rpm
