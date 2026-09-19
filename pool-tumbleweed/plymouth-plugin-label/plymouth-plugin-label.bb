SUMMARY = "Plymouth label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using pango and cairo."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "2fe47cf117336c2a38dad7a0f2c72874a5d399532e784e981c74911d5ef25a40a095c34722e5126ce00bcf427cf6222acd06f4f9cd2d20f6f968d8960b753525"

RPROVIDES:${PN} += "plymouth-plugin-label"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libply-splash-core.so.5 \
libply-splash-graphics5"

inherit rpm
