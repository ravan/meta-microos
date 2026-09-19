SUMMARY = "Spell checker library for GTK+"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the shared libraries for gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "libgspell-1-3-1.14.4-2.1.aarch64.rpm"
RPM_HASH = "1aa33580c8daa363352f2ecc9c5fe0ed0683b3c46b0f5312fa5fed320c5345efbc2e92adb5840d98ca02882cf65b79764c461b15231931a21e22aa55ae347209"

RPROVIDES:${PN} += "gspell \
libgspell-1-3 \
libgspell-1.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libicuuc.so.78 \
libpango-1.0.so.0"

inherit rpm
