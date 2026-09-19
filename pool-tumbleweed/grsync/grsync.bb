SUMMARY = "GUI for rsync"
DESCRIPTION = "Grsync is a GUI (Graphical User Interface) for rsync, the commandline directory \
and file synchronization tool. It can be effectively used to synchronize local \
directories and it supports remote targets as well (even though it doesn't \
support browsing the remote folder). Sample uses of grsync include: synchronize \
a music collection with removable devices, backup personal files to a networked \
drive, replication of a partition to another one, mirroring of files, etc."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "grsync-1.3.1-1.14.aarch64.rpm"
RPM_HASH = "83127f38148deaf1b786aa398f3d49030c13aae1676209ba8ad4494befeadcc3ddb4ddd3dde4261a63103598959ba2394c15e17fe3f76243ef98aea7dc293796"

RPROVIDES:${PN} += "grsync"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
rsync"

inherit rpm
