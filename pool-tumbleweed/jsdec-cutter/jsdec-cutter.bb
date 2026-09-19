SUMMARY = "Jsdec plugin for Cutter"
DESCRIPTION = "Jsdec plugin for Cutter. \
Converts asm to pseudo-C code."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.9.0"

RPM_NAME = "jsdec-cutter-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "c48cb236f1d1c6f6cbe8d69c0161c113ada611e3ecd198488838efbaa1baa96f983d2bb3fab865470503ab73f3c35d5cc164eead7f73ff34fe4199ed34048654"

RPROVIDES:${PN} += "jsdec-cutter \
libjsdec-cutter.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librz-arch.so.0.9 \
librz-config.so.0.9 \
librz-cons.so.0.9 \
librz-core.so.0.9 \
librz-util.so.0.9 \
libstdc++.so.6 \
rz-cutter"

inherit rpm
