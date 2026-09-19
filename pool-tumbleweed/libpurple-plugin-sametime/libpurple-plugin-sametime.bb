SUMMARY = "Sametime Plugin for Pidgin using the Meanwhile Library"
DESCRIPTION = "IBM Sametime plugin for Pidgin using the Meanwhile library."
LICENSE = "GPL-2.0-only"

PV = "2.14.14"

RPM_NAME = "libpurple-plugin-sametime-2.14.14-2.3.aarch64.rpm"
RPM_HASH = "b685f4d6ab2b35a9472425aecd1f64996ceea43b04158ff320d93b117706449d611edea3970c1944652779563b5a819f018f71db97ad8506e41eef559919bb48"

RPROVIDES:${PN} += "libpurple-meanwhile \
libpurple-plugin-sametime \
libsametime.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmeanwhile.so.1 \
libpurple"

inherit rpm
