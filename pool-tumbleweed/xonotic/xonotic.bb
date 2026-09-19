SUMMARY = "Fast-paced first person shooter"
DESCRIPTION = "Fast-paced first-person shooter. It provides arena shooter gameplay \
and is a direct successor of the Nexuiz project."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "xonotic-0.8.6-6.8.aarch64.rpm"
RPM_HASH = "c45010878fd87257f927b0bcb9d66cb615ca80dd8023901e5f2ad30d9762ce6756641b7842df94709946199222be833806fac069758d0d2138878da22adcc8bd"

RPROVIDES:${PN} += "group-xonotic \
user-xonotic \
xonotic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libXxf86vm.so.1 \
libasound.so.2 \
libc.so.6 \
libd0-blind-id.so.0 \
libjpeg.so.8 \
libm.so.6 \
libz.so.1 \
logrotate \
xonotic-data"

inherit rpm
