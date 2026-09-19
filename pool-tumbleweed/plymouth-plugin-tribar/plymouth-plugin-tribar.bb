SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'tribar' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-tribar-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "b0c494729296382cc361a1005c5bd0db2a1bc5e4d6712d5dfd6666c6a4c886300f129331c0d7063cafb4500b9f07382fc47b882f29cdb33c25b39eeb961ad784"

RPROVIDES:${PN} += "plymouth-plugin-tribar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply-splash-core5 \
libply-splash-graphics5 \
libply.so.5 \
libply5"

inherit rpm
