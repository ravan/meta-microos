SUMMARY = "AppStream Abstraction Library"
DESCRIPTION = "This library provides GObjects and helper methods to read and write \
AppStream metadata. It also provides a DOM implementation to edit \
nodes and convert to and from the standardized XML representation. \
 \
This library allows to: \
 \
* Read and write compressed AppStream XML files \
* Add and search for applications in an application store \
* Get screenshot image data and release announcements \
* Easily retrieve the best application data for the current locale \
* Efficiently interface with more heavy-weight parsers like expat"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "appstream-glib-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "8259f7455420d9a55472b096c4bbb0712b9ecb14cb20a5f95a23969c9fecdeb523eac9cfcececf0bf81f0dcc2660be4dced7e79e403397e46da9dcc05837a7d7"

RPROVIDES:${PN} += "appstream-glib \
asglib-swcatalog \
libasb-plugin-appdata.so \
libasb-plugin-desktop.so \
libasb-plugin-gettext.so \
libasb-plugin-hardcoded.so \
libasb-plugin-icon.so \
libasb-plugin-shell-extension.so"

RDEPENDS:${PN} += "gcab \
ld-linux-aarch64.so.1 \
libappstream-glib.so.8 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
librpm.so.10 \
librpmio.so.10 \
pngquant"

inherit rpm
