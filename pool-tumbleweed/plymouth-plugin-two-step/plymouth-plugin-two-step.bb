SUMMARY = "Plymouth 'two-step' plugin"
DESCRIPTION = "This package contains the 'two-step' boot splash plugin for \
Plymouth. It features a two phased boot process that starts with \
a progressing animation synced to boot time and finishes with a \
short, fast one-shot animation."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-two-step-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "231411fb426523157cc47a09f99ab5700635417bba601ccae6c3b55d1facc22c03100a798057622bc96e3ccbb16772e47bd9ae6aaacf754c90c2b591d4821c36"

RPROVIDES:${PN} += "plymouth-plugin-two-step"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply-splash-core5 \
libply-splash-graphics.so.5 \
libply-splash-graphics5 \
libply.so.5 \
libply5 \
plymouth-plugin-label"

inherit rpm
