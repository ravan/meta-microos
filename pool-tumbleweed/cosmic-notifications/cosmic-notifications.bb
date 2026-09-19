SUMMARY = "Layer for COSMIC Notifications"
DESCRIPTION = "Layer Shell notifications daemon which integrates with COSMIC."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-notifications-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "dc5205b41d5ed1d66534f7437a8d5ba8fb292582d9cf0614faa29877972f81cb9c18d14bc710100ebe02f518e2336e92f7e29f35a3c57757bb73cb7e955df0e5"

RPROVIDES:${PN} += "cosmic-notifications"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
