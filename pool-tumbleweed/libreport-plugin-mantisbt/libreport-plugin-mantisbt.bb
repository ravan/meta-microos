SUMMARY = "libreport's mantisbt plugin"
DESCRIPTION = "Plugin to report bugs into the mantisbt."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-plugin-mantisbt-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "f15ed1e37541b884a74f811a335fa48426ca0d028febe027f50ddeea9e1fe022ec0544ed58efb2b0c8fbd8a2a1b270985ad160d7fa7575afe645c5796d82c48e"

RPROVIDES:${PN} += "config-libreport-plugin-mantisbt \
libreport-plugin-mantisbt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreport-2 \
libreport-web-2 \
libreport-web.so.2 \
libreport.so.2 \
libxml2.so.16"

inherit rpm
