SUMMARY = "Generic Spell Checking Library - Zemberek Plugin"
DESCRIPTION = "Zemberek plugin (Azeri, Turkmen, Turkish, Tatar) for enchant, a library \
providing an efficient extensible abstraction for dealing with \
different spell checking libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backend-zemberek-1.6.1-8.10.aarch64.rpm"
RPM_HASH = "e8c6d565e89d89addc1d723303336183065ed7ed8e0b7754cd6190bef013bb195e41c9d6998e78eba852060fcc2c6b55c3ab18286bbd9f23bf4e78c887927af1"

RPROVIDES:${PN} += "enchant-1-backend \
enchant-1-backend-zemberek \
libenchant-zemberek.so \
locale-enchant-1-az \
locale-enchant-1-tk \
locale-enchant-1-tr \
locale-enchant-1-tt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
