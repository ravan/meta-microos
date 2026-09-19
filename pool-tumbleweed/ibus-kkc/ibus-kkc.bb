SUMMARY = "Japanese Kana Kanji input engine for IBus"
DESCRIPTION = "ibus-kkc is a Japanese Kana Kanji input engine for IBus IMF."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.22"

RPM_NAME = "ibus-kkc-1.5.22-3.7.aarch64.rpm"
RPM_HASH = "aeb82eb9039f66deca13ddfb22f6bd0a113b710df60992e6b9081c631da243bafd5ad420bda6f00ca07c8e9503abb8825be25bfd0ddd3a98664fa17744f542db"

RPROVIDES:${PN} += "ibus-kkc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libjson-glib-1.0.so.0 \
libkkc.so.2"

inherit rpm
