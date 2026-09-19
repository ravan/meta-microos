SUMMARY = "System Information viewer"
DESCRIPTION = "A system information viewer for the COSMIC Desktop"
LICENSE = "GPL-3.0-only"

PV = "2.0.0+2"

RPM_NAME = "examine-2.0.0+2-1.6.aarch64.rpm"
RPM_HASH = "093651786982fa8e8dc84348ddb93dc4c88ae2b31adca9ca61c3c5170863a74f5c2f73c8530ae9f065bb05ef243840f502ba6fa3248d91810874a7d2dce4a8d7"

RPROVIDES:${PN} += "examine"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
