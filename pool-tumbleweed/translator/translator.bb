SUMMARY = "Translation program"
DESCRIPTION = "This is a translator. It is suited only for small messages, not \
big text. Google Translate is used as the backend."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "translator-1.4.1-2.9.aarch64.rpm"
RPM_HASH = "28d131d2a2872c9b6465033d9d6ef53d006fb78899064b550b48ed5ee105dc2aea2d239191288de60f7abb35faa34a61a744fe24d41244c5f09a0fba9004defc"

RPROVIDES:${PN} += "translator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm
