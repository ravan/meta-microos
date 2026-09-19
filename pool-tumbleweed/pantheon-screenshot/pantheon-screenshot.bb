SUMMARY = "A simple screen capture tool"
DESCRIPTION = "A simple screen capture tool made for the Pantheon Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.4"

RPM_NAME = "pantheon-screenshot-8.0.4-1.4.aarch64.rpm"
RPM_HASH = "e82182cf89722c291e385991e59dfa14b8c0934b7dcbd14a1659b684aa92d48ada7d68a4955836574b253887b3177a201713cea76504354c84c87435f1554582"

RPROVIDES:${PN} += "elementary-screenshot \
elementary-screenshot-tool \
pantheon-screenshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libportal.so.1"

inherit rpm
