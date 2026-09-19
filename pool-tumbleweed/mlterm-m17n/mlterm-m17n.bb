SUMMARY = "A m17n plugin for mlterm"
DESCRIPTION = "A plugin to use the m17n input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.5"

RPM_NAME = "mlterm-m17n-3.9.5-1.1.aarch64.rpm"
RPM_HASH = "110c7b2769db817057ff8f904c52924d5f9398897203d4a67e7b8ebaf3048871d9898d7b47dcbc6a565b5b3dfe0fc651b05befd1c533f2cb08789c87d2cd3bfc"

RPROVIDES:${PN} += "libim-m17nlib-sdl2.so \
libim-m17nlib-wl.so \
libim-m17nlib.so \
locale-m17n-ja;ko;zh;ar;he \
mlterm-m17n"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm17n-core.so.0 \
libm17n.so.0 \
libpobl.so.3"

inherit rpm
