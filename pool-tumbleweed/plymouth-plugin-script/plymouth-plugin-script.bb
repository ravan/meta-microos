SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'script' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-script-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "0050162b74870a6998b04de9c025d53b15abb98916050008957b04a226960a0fcd363931d4595d227bdb715cb860828188d7fd57bfc5e20beff23a4cd863478b"

RPROVIDES:${PN} += "plymouth-plugin-script"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply-splash-core5 \
libply-splash-graphics.so.5 \
libply-splash-graphics5 \
libply.so.5 \
libply5"

inherit rpm
