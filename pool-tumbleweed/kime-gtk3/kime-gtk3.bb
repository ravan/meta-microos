SUMMARY = "GTK3 input module for kime"
DESCRIPTION = "GTK3 input module for kime Korean Input Method Engine."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "kime-gtk3-3.1.1-2.12.aarch64.rpm"
RPM_HASH = "84ffb93adf5fb061ddfa645b64b6723dee2c381b6b73cc6ae93d4eddfe756164c1a7f561da3ce868c74b48e06ef70233e7589cec28fd22d589593f235dbc981a"

RPROVIDES:${PN} += "kime-gtk3 \
libkime-gtk3.so"

RDEPENDS:${PN} += "kime \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkime-engine.so \
libpango-1.0.so.0"

inherit rpm
