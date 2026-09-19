SUMMARY = "Perceptual video quality assessment algorithm"
DESCRIPTION = "VMAF is a perceptual video quality assessment algorithm."
LICENSE = "BSD-2-Clause-Patent & BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "vmaf-3.2.0-1.3.aarch64.rpm"
RPM_HASH = "e7a737184417af577281ba38e9b97262790db8027b91eb63eb1399e5fd7c3f396ae259e96bc287398396d60e1f7ad8c79e46d8909a1625de21c5dc140038158b"

RPROVIDES:${PN} += "bundled-libsvm \
vmaf \
vmaf-devel-/usr/bin/vmaf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
