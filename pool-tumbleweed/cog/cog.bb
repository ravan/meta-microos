SUMMARY = "WPE launcher and webapp container"
DESCRIPTION = "Cog is a small single “window” launcher for the WebKit WPE port. It \
provides no user interface, and is suitable to be used as a Web application \
container. The “window” may be fullscreen depending on the WPE backend \
being used."
LICENSE = "MIT"

PV = "0.18.5"

RPM_NAME = "cog-0.18.5-3.5.aarch64.rpm"
RPM_HASH = "40c1465a616dbe5d130c1e82982737c9d9b61a17496eec90a9a308c83e33d2e9f4ee3cd1dd31612f044679c85f7e5ebb7ad7f5e67cc60b3974fa998225d03915"

RPROVIDES:${PN} += "cog \
cogctl-/usr/bin/cogctl \
libcogcore.so.9 \
libcogplatform-drm.so \
libcogplatform-headless.so \
libcogplatform-wl.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libWPEBackend-fdo-1.0.so.1 \
libWPEWebKit-2.0.so.1 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libinput.so.10 \
libmanette-0.2.so.0 \
libsoup-3.0.so.0 \
libudev.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-server.so.0 \
libwpe-1.0.so.1"

inherit rpm
