SUMMARY = "A small and simple sound and music player that is well integrated with GNOME"
DESCRIPTION = "A small and simple sound and music player that is well integrated with GNOME. \
Amberol aspires to be as small, unintrusive, and simple as possible. It does \
not manage your music collection; it does not let you manage playlists, smart \
or otherwise; it does not let you edit the metadata for your songs; it does \
not show you lyrics for your songs, or the Wikipedia page for your bands. \
Amberol plays music, and nothing else."
LICENSE = "CC-BY-SA-3.0 & CC0-1.0 & GPL-3.0-or-later"

PV = "2026.1"

RPM_NAME = "amberol-2026.1-1.4.aarch64.rpm"
RPM_HASH = "d87394d29623b2446e49bc1debf0e7080dc45afd97d318d9b72a7261528c2a9e59d37f22cf3ed88fc5065bd90fec19bb26e6a181de9995dff368b9b50f6a6084"

RPROVIDES:${PN} += "amberol"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
