SUMMARY = "Optimized kernels for gnss-sdr"
DESCRIPTION = "Set of optimized kernels targeted at gnss-sdr, but also usable \
standalone."
LICENSE = "GPL-3.0-or-later & BSD-3-Clause & Zlib"

PV = "0.0.21"

RPM_NAME = "libvolk_gnsssdr0_0_21-0.0.21-1.1.aarch64.rpm"
RPM_HASH = "6d22471fc23c337928dc40a6af633095d579329904e716b5f9236556869ed310dd62819c9429c78a6310abda64e90232f6164d2a8c36be855c598ce1057aeeee"

RPROVIDES:${PN} += "libvolk-gnsssdr.so.0.0.21 \
libvolk-gnsssdr0-0-21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
liborc-0.4.so.0"

inherit rpm
