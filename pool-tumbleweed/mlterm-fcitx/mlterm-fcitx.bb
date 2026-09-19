SUMMARY = "A fcitx plugin for mlterm"
DESCRIPTION = "A plugin to use the fcitx input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.5"

RPM_NAME = "mlterm-fcitx-3.9.5-1.1.aarch64.rpm"
RPM_HASH = "d07fc3d7a6d4ace156aa1055e5f441885d29071695bb54962337c9be20ff6127fdaec6fc77af14145e2fc1e6a28be2cb89dcfba0dfb5fb636d35d0b478e1a008"

RPROVIDES:${PN} += "libim-fcitx-sdl2.so \
libim-fcitx-wl.so \
libim-fcitx.so \
locale-fcitx-ja;ko;ar;he \
mlterm-fcitx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5GClient.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpobl.so.3"

inherit rpm
