SUMMARY = "Early experimental virtual file system plugin for nextcloud client"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
This package provides the files needed to enable virtual file system on \
nextcloud-desktop. Note that virtual file system support on Linux is very \
experimental, so use at your own risk."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "nextcloud-desktop-vfs-plugin-34.0.3-1.1.aarch64.rpm"
RPM_HASH = "4de5d976c855d75a717c703b2ed7fc599c42d68e3612aaa0c757670a6c583d989883d0be5bd7ae2c3179a5dafe4e891e41b0179a1cd9f1c3162e3f00ac808ca8"

RPROVIDES:${PN} += "nextcloud-desktop-vfs-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libnextcloud-csync.so.0 \
libnextcloudsync.so.0 \
libstdc++.so.6 \
nextcloud-desktop"

inherit rpm
