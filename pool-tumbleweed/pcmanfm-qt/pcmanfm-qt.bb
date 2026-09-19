SUMMARY = "File manager and desktop icon manager"
DESCRIPTION = "PCManFM-Qt is the Qt port of the LXDE file manager PCManFM"
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "pcmanfm-qt-2.4.1-1.1.aarch64.rpm"
RPM_HASH = "e463b8917794e30a530070592bea47a490ac874edad683c54c29fb780a8bca54bd7b63864eee543a909ba20249116523995bed4e6673d87c0214097022b0d428"

RPROVIDES:${PN} += "config-pcmanfm-qt \
pcmanfm-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLayerShellQtInterface.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Svg6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfm-qt6.so.17 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
libxcb.so.1 \
menu-cache \
wallpaper-branding-openSUSE"

inherit rpm
