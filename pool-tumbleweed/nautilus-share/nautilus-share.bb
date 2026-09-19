SUMMARY = "Nautilus plugin for sharing directories over SMB"
DESCRIPTION = "An application for the GNOME desktop integrated into Nautilus \
which allows use of Nautilus shares without signing in as root. \
 \
Features: \
 \
* A new command in the Nautilus context menu \
  (Menu key or right click). \
 \
* A dialog to share a directory, which allows choosing a \
  name and decide on read-only/read-write status. \
 \
* Possibility to access the share settings from the Properties \
  tab of a directory. \
 \
* Possibility to examine whether a share name already exists by \
  typing it. \
 \
* Nautilus displays a palm icon to visually show which \
  directories are shared."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.5"

RPM_NAME = "nautilus-share-0.7.5-5.3.aarch64.rpm"
RPM_HASH = "68dd41cc5d00e6d419d7486a4a4c9c4a63dd7e2db3dd0ed07a558ec7717cbca6444600080809593e632d285c5df0cd756e615445605018d18c6fa94cb4ca18d7"

RPROVIDES:${PN} += "libnautilus-share.so \
nautilus-share"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libnautilus-extension.so.4 \
samba-client"

inherit rpm
