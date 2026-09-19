SUMMARY = "DjVu support for zathura using the djvulibre library"
DESCRIPTION = "The zathura-djvu plugin adds DjVu support to zathura by using the djvulibre \
library."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-plugin-djvu-2026.07.18-1.1.aarch64.rpm"
RPM_HASH = "dc21be51c66ac795e78086e89bb85083d395ce0adcc9fa99808794357a1df5ed80b4e734e6f84fed524b9a75c55f0366b080251a7cd08a31c6240b84fbb0eb49"

RPROVIDES:${PN} += "libdjvu.so \
zathura-djvu-plugin \
zathura-plugin-djvu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdjvulibre.so.21 \
libgirara.so.5 \
libglib-2.0.so.0 \
zathura"

inherit rpm
