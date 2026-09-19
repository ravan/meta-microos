SUMMARY = "Double precision SIMD-oriented Fast Mersenne Twister"
DESCRIPTION = "Double precision SIMD-oriented Fast Mersenne Twister (dSFMT) \
 \
The purpose of dSFMT is to speed up the generation by avoiding the expensive \
conversion of integer to double (floating point). dSFMT directly generates \
double precision floating point pseudorandom numbers which have the IEEE \
Standard for Binary Floating-Point Arithmetic (ANSI/IEEE Std 754-1985) format. \
dSFMT is only available on the CPUs which use IEEE 754 format double \
precision floating point numbers."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "libdSFMT2_2-2.2.5-2.9.aarch64.rpm"
RPM_HASH = "00445a59e11880b4dd1323090de0954cb4b7703dd5de4f41f5c57efd5e02d1c119540efe29366b34453d7f9e64f167ab6296b16d42dec8f2a830839fb664131e"

RPROVIDES:${PN} += "libdSFMT.so.2.2 \
libdSFMT2-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
