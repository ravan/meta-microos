SUMMARY = "Cloud storage client"
DESCRIPTION = "Seafile is an open source cloud storage system with features on privacy protection and teamwork. Collections of files are \
called libraries, and each library can be synced separately. A library can also be encrypted with a user chosen password. \
Seafile also allows users to create groups and easily sharing files into groups."
LICENSE = "GPL-3.0-only"

PV = "9.0.21"

RPM_NAME = "seafile-client-9.0.21-1.1.aarch64.rpm"
RPM_HASH = "41638bbf90d7933ac0eb39108ee4719a87e79cad530e5dcec15dbc21f15f2543ac61a2d3ae3fead9a7f7b7430abcf3b58e5b1c0958055ef63d76fc6dcc4174d6"

RPROVIDES:${PN} += "seafile-client"

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
libseafile.so.0 \
libsearpc.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
python3-pysearpc \
seafile"

inherit rpm
