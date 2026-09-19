SUMMARY = "A Wayland Tiling Compositor Inspired by Ratpoison"
DESCRIPTION = "Cagebreak provides a ratpoison-inspired, cage-based, tiling Wayland \
compositor."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "cagebreak-2.3.1-1.9.aarch64.rpm"
RPM_HASH = "0d3aa9fa81b94657aff70dcb2ab1c2832429edcf8c6f52759f79376fc70f4cb2550d5854b14c114c8a6934a70a3ffd7a7684ea54d2a357bc59ca12605b9cff0a"

RPROVIDES:${PN} += "cagebreak \
config-cagebreak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libfontconfig.so.1 \
libgobject-2.0.so.0 \
libinput.so.10 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-server.so.0 \
libwlroots.so.12 \
libxkbcommon.so.0"

inherit rpm
