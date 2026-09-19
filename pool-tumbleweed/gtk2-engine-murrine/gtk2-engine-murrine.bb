SUMMARY = "Murrine GTK Theme Engine"
DESCRIPTION = "Murrine is a GTK+ 2 theme engine, that uses the Cairo vector drawing \
library to render widgets. It features a modern glassy look, is elegant \
and clean on the eyes, and is extremely customizable."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "0.98.2"

RPM_NAME = "gtk2-engine-murrine-0.98.2-12.9.aarch64.rpm"
RPM_HASH = "ed448cdd0f65a348657bd177b7bb92b7f5b140ead32523d30d59d78ae3ab163093eef0e11a2b677872b93de4f855439860cc36c7158715c0d328ccb5f46c42e2"

RPROVIDES:${PN} += "gtk2-engine-murrine \
libmurrine.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpangocairo-1.0.so.0 \
libpixman-1.so.0"

inherit rpm
