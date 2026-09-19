SUMMARY = "Ibus plugin for mlterm"
DESCRIPTION = "A plugin to use the ibus input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.5"

RPM_NAME = "mlterm-ibus-3.9.5-1.1.aarch64.rpm"
RPM_HASH = "0de3b07363a1ac9a7e0e73e48858fc216a598b946df1ea5bc33c286104385f8dbb451a21f1f770abcc059c18c954fb08e898fea3516e8ecae5cff4bec81e5007"

RPROVIDES:${PN} += "libim-ibus-sdl2.so \
libim-ibus-wl.so \
libim-ibus.so \
locale-ibus-ja;ko;ar;he \
mlterm-ibus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libpobl.so.3"

inherit rpm
