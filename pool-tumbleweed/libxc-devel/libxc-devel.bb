SUMMARY = "Development files for libxc"
DESCRIPTION = "Libxc is a library of exchange and correlation functionals. Its \
purpose is to be used in codes that implement density-functional \
theory. The library includes most of the local density \
approximations (LDAs), generalized density approximation (GGAs), and \
meta-GGAs. The library provides values for the energy density and its \
1st, 2nd, and (for the LDAs) 3rd derivatives. \
 \
This package contains development headers and libraries for libxc."
LICENSE = "MPL-2.0"

PV = "6.2.2"

RPM_NAME = "libxc-devel-6.2.2-1.11.aarch64.rpm"
RPM_HASH = "53c9a598cc88d0eea4bbf9b0cfa31caa059b894a227fca5e73d769aeb8598b66b93fac55b04a8fc5af07f66e24fcd5fa28c464ec9537f4cf52789f5b54bbd491"

RPROVIDES:${PN} += "libxc-devel \
pkgconfig-libxc \
pkgconfig-libxcf03 \
pkgconfig-libxcf90"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxc.so.12 \
libxc12"

inherit rpm
