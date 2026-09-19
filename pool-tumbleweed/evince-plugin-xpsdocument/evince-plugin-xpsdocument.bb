SUMMARY = "XPS document support for Evince"
DESCRIPTION = "A plugin for Evince to read XPS documents."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-plugin-xpsdocument-48.4-2.1.aarch64.rpm"
RPM_HASH = "2d1dca2be1f6ca7ec0ff44d58bbd1acff4ec952fd553dd44a973e2e530ee8a7ed7d15bdec2f8cfddc3935534816fead01d756a5139eb87ed3dc7364f579a3a95"

RPROVIDES:${PN} += "evince-plugin-xpsdocument \
libxpsdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgxps.so.2"

inherit rpm
