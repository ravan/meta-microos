SUMMARY = "PS support for zathura via libspectre"
DESCRIPTION = "The zathura-ps plugin adds PostScript support to zathura by using the \
libspectre library."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-plugin-ps-2026.07.18-1.1.aarch64.rpm"
RPM_HASH = "1191971c04811294b8e47c4c86e0401b3a16a5babc6dde91fc806f45a95c4fa90f14fbdb1633976342eece5f1dd2dca11014f5f2cca273bb1638b5b671f5ea22"

RPROVIDES:${PN} += "libps.so \
zathura-plugin-ps \
zathura-ps-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgirara.so.5 \
libspectre.so.1 \
zathura"

inherit rpm
