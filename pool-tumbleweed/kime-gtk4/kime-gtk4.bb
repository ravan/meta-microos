SUMMARY = "GTK4 input module for kime"
DESCRIPTION = "GTK4 input module for kime Korean Input Method Engine."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "kime-gtk4-3.1.1-2.12.aarch64.rpm"
RPM_HASH = "45b4cca5a61ea1cc15e400b84a64271a9f2b34e8967d816562493cfe055a937c9501b7c167d4a5372bf5a279824a496f8b3c65c8c0f413f9969dc87deb29fa71"

RPROVIDES:${PN} += "kime-gtk4 \
libkime-gtk4.so"

RDEPENDS:${PN} += "kime \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libkime-engine.so \
libpango-1.0.so.0"

inherit rpm
