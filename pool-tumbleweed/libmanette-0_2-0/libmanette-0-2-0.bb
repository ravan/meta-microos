SUMMARY = "A simple GObject game controller library"
DESCRIPTION = "libmanette allows easy access to game controllers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "libmanette-0_2-0-0.2.13-2.3.aarch64.rpm"
RPM_HASH = "17ddb61ed27a81dcd55d2dc47be2d030d473d3f4c3b8760f97f2e4f7ff18706f188b525b1021b7876ad2bbcb12d03d5aa1c4750e70801d258cd3502f50bf26d1"

RPROVIDES:${PN} += "libmanette-0-2-0 \
libmanette-0.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libhidapi-hidraw.so.0"

inherit rpm
