SUMMARY = "MATE disk usage analyser"
DESCRIPTION = "This is the MATE Disk Usage Analyzer as shipped with the MATE utilities. \
mate-disk-usage-analyzer is able to scan either specific directories or \
the wholefilesystem, in order to give the user a graphical tree representation \
including each directory size or percentage in the branch. \
It also auto-detects in real-time any change made to your home \
directory as far as any mounted/unmounted device."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-disk-usage-analyzer-1.28.0-2.6.aarch64.rpm"
RPM_HASH = "7d6c71a41631de6ffda445b0e2f21805ec1fc9a9b160a2238dd2faaffba9ba7376a9491cb228caf9667da57d760c0b2d9906d871426dfb1b43dd338d77deed09"

RPROVIDES:${PN} += "mate-disk-usage-analyzer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libm.so.6 \
libmate-desktop-2.so.17 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
