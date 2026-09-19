SUMMARY = "Lightweight and modern Terminal for the Pantheon Desktop"
DESCRIPTION = "A super lightweight, beautiful, and simple terminal. It is designed to be \
setup with sane defaults and little to no configuration. It is just a \
terminal, nothing more, nothing less."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-terminal-8.1.0-1.1.aarch64.rpm"
RPM_HASH = "083fb98afbc292c0f5874555e3bdac5a63a722c461e29ff3506fadcaef8fb7f8f9602f4ebe70f5b8adca126d383623d2853f579d5c89703495153546caa471d7"

RPROVIDES:${PN} += "elementary-terminal \
pantheon-terminal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libvte-2.91-gtk4.so.0"

inherit rpm
