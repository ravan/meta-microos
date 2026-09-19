SUMMARY = "Plymouth FreeType label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using FreeType"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-ft-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "5f40e9f67f62bbdaa6f959ec7ce47f749629c847a1a9265ba0b67de3601b358af92f098fb47092379ed051c1b8d52a6dee892dd1f37af0d6752ab0c726af9b4f"

RPROVIDES:${PN} += "plymouth-plugin-label-ft"

RDEPENDS:${PN} += "fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libply-splash-core.so.5 \
libply-splash-graphics5"

inherit rpm
