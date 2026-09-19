SUMMARY = "Utilities for AV/C 1394"
DESCRIPTION = "Command-line utilities to inspect and control AV/C hardware."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "libavc1394-tools-0.5.4-20.9.aarch64.rpm"
RPM_HASH = "b2e80b06a925fb8ef45e13ae990756eef7726d9a210e7572385fe15fc19d6a405a40f1ccd7d3e845d10c1d00c8de7280deac0f99bdf0308940fb2002c73e5d9c"

RPROVIDES:${PN} += "libavc1394 \
libavc1394-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavc1394.so.0 \
libc.so.6 \
libraw1394.so.11 \
librom1394.so.0"

inherit rpm
