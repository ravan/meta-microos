SUMMARY = "PostScript document support for Evince"
DESCRIPTION = "A plugin for Evince to read PostScript documents."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-plugin-psdocument-48.4-2.1.aarch64.rpm"
RPM_HASH = "fbdc58d705e4228e9aa30b8930d5d0d701a5141872538ef7c4f692809d084e4e9b4eda575188cb0e3ab027de03754620a4340e48bc75b327e16ca805d4326af0"

RPROVIDES:${PN} += "evince-plugin-psdocument \
libpsdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libspectre.so.1"

inherit rpm
