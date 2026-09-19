SUMMARY = "System restore utility"
DESCRIPTION = "A system restore utility which takes snapshots of the system at regular \
intervals. These snapshots can be restored at a later date to undo system \
changes. Creates incremental snapshots using rsync or BTRFS snapshots \
using BTRFS tools."
LICENSE = "GPL-3.0-only"

PV = "25.12.4"

RPM_NAME = "timeshift-25.12.4-1.3.aarch64.rpm"
RPM_HASH = "25ebefe9ca0412a2d4c9e6835b51c96a033fe2c6d58551c4a031683ff83cbfd6a2bfc20f9e620ff85ebcf0612c3d8bd4ff166ea2e049e4be67c4391e0eef712d"

RPROVIDES:${PN} += "config-timeshift \
timeshift"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libvte-2.91.so.0 \
rsync"

inherit rpm
