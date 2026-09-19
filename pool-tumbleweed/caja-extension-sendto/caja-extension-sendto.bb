SUMMARY = "A collection of 'sendto' plugins for Caja"
DESCRIPTION = "This package provides extra functionality to the Caja file manager. \
The core package includes CD burner, archiving, email client links \
and devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-sendto-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "84cf7fa54a6680c7907de3397dcee3c87d95e5449867eda7b52b97997ef382c03b331fcac637b820e824e2f4bf244badad0174154854676886fbe62a273f8867"

RPROVIDES:${PN} += "caja-extension-sendto \
caja-sendto \
libcaja-sendto.so \
libnstburn.so \
libnstemailclient.so \
libnstremovable-devices.so \
mate-file-manager-sendto"

RDEPENDS:${PN} += "caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
