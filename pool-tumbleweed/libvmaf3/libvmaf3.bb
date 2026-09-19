SUMMARY = "Perceptual video quality assessment algorithm"
DESCRIPTION = "VMAF is a perceptual video quality assessment algorithm."
LICENSE = "BSD-2-Clause-Patent & BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "libvmaf3-3.2.0-1.3.aarch64.rpm"
RPM_HASH = "0ada981457f07528b6d0cc1521e8338d3dd45a2e6460a6f5b8fac018ab1f85f85942656f986cc7ad76334dfdafa7ebcb7ba36e21d81be1ebae520738ce3a43a6"

RPROVIDES:${PN} += "libvmaf.so.3 \
libvmaf3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
