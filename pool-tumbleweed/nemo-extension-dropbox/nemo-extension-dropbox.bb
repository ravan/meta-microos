SUMMARY = "DropBox support for the Nemo Filemanager"
DESCRIPTION = "Nemo-dropbox adds DropBox support to the Nemo filemanager."
LICENSE = "GPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-dropbox-6.4.0-6.4.aarch64.rpm"
RPM_HASH = "28f432df499376a4e7c131cf11b4b753c046e0afc4ea1d9a3108553038b8910deb52934cc1a660dcbe34635788d930e55954d69bbda95739d016b25d1b370228"

RPROVIDES:${PN} += "libnemo-dropbox.so \
nemo-dropbox \
nemo-extension-dropbox"

RDEPENDS:${PN} += "/sbin/ldconfig \
dropbox \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
