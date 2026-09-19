SUMMARY = "Shared library for LAL Pulsar"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Pulsar library."
LICENSE = "GPL-2.0-or-later"

PV = "7.1.1"

RPM_NAME = "liblalpulsar30-7.1.1-2.1.aarch64.rpm"
RPM_HASH = "6044c4a1768811166eb7f9c57b1f471735bb2f1ba1d08472568fae3bc0cd343985eeaabcf21add97e141abf26bfdb7191d0a5091bc34e41b5666dbc99aa54d78"

RPROVIDES:${PN} += "liblalpulsar.so.30 \
liblalpulsar30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgsl.so.28 \
liblal.so.20 \
liblalframe.so.14 \
liblalinference.so.23 \
liblalsimulation.so.37 \
liblalsupport.so.14 \
libm.so.6"

inherit rpm
