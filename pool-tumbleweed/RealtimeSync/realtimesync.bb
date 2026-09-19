SUMMARY = "Backup software to synchronize files and folders"
DESCRIPTION = "RealtimeSync executes a command each time it detects changes \
in one of the monitored directories, or when a directory becomes \
available (e.g. insertion of a USB drive). \
This command will usually trigger a FreeFileSync batch job."
LICENSE = "GPL-3.0-or-later"

PV = "14.11"

RPM_NAME = "RealtimeSync-14.11-1.1.aarch64.rpm"
RPM_HASH = "859b12dba8ed6cd06abe0ff307ff3df57bd5879699e1928b5482bfb6ccd3f35bfc42d4cf911afc0c856d9530ea55533637377dbd564e1c4a0c51962fe40dd97f"

RPROVIDES:${PN} += "RealtimeSync"

RDEPENDS:${PN} += "FreeFileSync \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-richtext-suse.so.16.0.0"

inherit rpm
