SUMMARY = "The official Elementary music player"
DESCRIPTION = "pantheon-music is a Granite audio player with a focus on music and libraries. It \
handles external devices, CDs, and album art."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-music-8.1.0-1.4.aarch64.rpm"
RPM_HASH = "d36244609b6197482e4bb81bc393242e618d19f62fc8fd4cb18f178abb9f96cb0628be348d21ec339c33ebbd5a7f1f6b7f4dbbf100ef2704af68628598932be7"

RPROVIDES:${PN} += "elementary-music \
pantheon-music"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgtk-4.so.1"

inherit rpm
