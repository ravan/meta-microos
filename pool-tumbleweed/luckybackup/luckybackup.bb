SUMMARY = "A backup and sync tool"
DESCRIPTION = "luckyBackup is an application that backs-up and/or synchronizes any directories \
with rsync. \
 \
It checks all declared directories before proceeding with any data \
manipulation, and, by way of rsync, transfers only changes and not \
all data."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "luckybackup-0.5.0-2.8.aarch64.rpm"
RPM_HASH = "a69c211ea570405630258de61fb348fe64a8e9b5e91000e97bd7953fb7b819db7793d4a35e47b0d54d460d026bb522a3bb18d8ab1a54a5e09c49e42c7cc56867"

RPROVIDES:${PN} += "luckybackup"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
polkit \
rsync"

inherit rpm
