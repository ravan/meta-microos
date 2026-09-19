SUMMARY = "LV2 port of the Airwindows plugins"
DESCRIPTION = " \
This is an LV2 port (by Hannes Braun) of the Airwindows plugins \
originally developed by Chris Johnson. \
 \
Right now, only 187 plugins (out of 525) have been ported to LV2."
LICENSE = "MIT"

PV = "40.0"

RPM_NAME = "lv2-airwindows-40.0-1.1.aarch64.rpm"
RPM_HASH = "d5c61e45ce8093ea1c2fd6065a9606daae9a808581da448b94499b40a457f1aa28daa95386e054339b2bdabb9ef98d2749c2cbc4eb0346f2e71c82fae3920975"

RPROVIDES:${PN} += "lv2-airwindows"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
