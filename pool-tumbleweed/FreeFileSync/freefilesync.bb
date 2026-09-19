SUMMARY = "Backup software to synchronize files and folders"
DESCRIPTION = "FreeFileSync is a software that helps synchronizing files \
and folders. It runs backup jobs while having visual \
feedback along the way."
LICENSE = "GPL-3.0-or-later"

PV = "14.11"

RPM_NAME = "FreeFileSync-14.11-1.1.aarch64.rpm"
RPM_HASH = "e3c8e34ef795bc9a53be43a6c3ca6a9a8b0bf08b43d7b5199ebc788139868c633e61c3c469b92504c25154571e800b3a4fba3fc7f16b2ba1a535af82281e3c5c"

RPROVIDES:${PN} += "FreeFileSync"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libidn2.so.0 \
libm.so.6 \
libselinux.so.1 \
libssh2.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-aui-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-richtext-suse.so.16.0.0 \
libz.so.1"

inherit rpm
