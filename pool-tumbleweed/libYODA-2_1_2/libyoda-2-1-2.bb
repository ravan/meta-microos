SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the source files for development with YODA."
LICENSE = "GPL-2.0-only"

PV = "2.1.2"

RPM_NAME = "libYODA-2_1_2-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "b177478144caf0c6fb432d17da1b8869018dcd52c656c5b0f9f70e0d1b4d1dc79b5a629e7d663fb3d45e97ca2164f188923538f9fc02e70811f611a173cb4517"

RPROVIDES:${PN} += "libYODA-2-1-2 \
libYODA-2.1.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
