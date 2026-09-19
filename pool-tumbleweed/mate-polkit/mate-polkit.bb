SUMMARY = "MATE authentification agent for polkit"
DESCRIPTION = "mate-polkit provides a D-Bus session bus service that is used to bring \
up authentication dialogues used for obtaining privileges."
LICENSE = "LGPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "mate-polkit-1.28.1-1.10.aarch64.rpm"
RPM_HASH = "990926c58e4e2c26745050d3636310dff30bef2ccd5b18e8676f85fd9b6a7b1ed2d11798aa8cbc00f73d2ace6712f25a67187dd092673dbcccd3f4bc60c635e7"

RPROVIDES:${PN} += "config-mate-polkit \
mate-polkit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
