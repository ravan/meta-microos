SUMMARY = "File-roller extension for Nautilus"
DESCRIPTION = "File Roller is an archive manager for GNOME. With it, you can create \
and modify archives, view the contents of an archive, view a file \
contained in the archive, and extract files from the archive."
LICENSE = "GPL-2.0-or-later"

PV = "44.7"

RPM_NAME = "nautilus-file-roller-44.7-1.2.aarch64.rpm"
RPM_HASH = "abbe5ddca857193a8b47d53955d507bb7b81322260973fbf883c0cbce723716f8057c074aac84f4bdb12c5cd2fcc2dba84ecf6159e908383870abcd6ef019e13"

RPROVIDES:${PN} += "libnautilus-fileroller.so \
nautilus-file-roller"

RDEPENDS:${PN} += "file-roller \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
nautilus"

inherit rpm
