SUMMARY = "GUI part of seafile drive"
DESCRIPTION = "This package provides a graphical user interface for seadrive-fuse"
LICENSE = "GPL-3.0-only"

PV = "3.0.24"

RPM_NAME = "seadrive-gui-3.0.24-1.1.aarch64.rpm"
RPM_HASH = "dc2037eb7fbe680c8d6f6ebd5edf64a896210676cc9e9b949370f0c9ec5d9cae5a16d62e36ae7065f9ace0ccd320df89abde0353f6524b73929c88926e8085b0"

RPROVIDES:${PN} += "seadrive-gui"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libsearpc.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
seadrive-fuse"

inherit rpm
