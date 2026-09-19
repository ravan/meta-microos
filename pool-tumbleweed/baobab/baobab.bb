SUMMARY = "Disk Usage Analyzer"
DESCRIPTION = "Disk Usage Analyzer is a graphical, menu-driven application to analyse \
disk usage in any GNOME environment. Disk Usage Analyzer can easily \
scan either the whole filesystem tree, or a specific user-requested \
directory branch (local or remote). \
 \
It also auto-detects in real-time any changes made to your home \
directory as far as any mounted/unmounted device. Disk Usage Analyzer \
also provides a full graphical treemap window for each selected folder."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "baobab-50.0-1.3.aarch64.rpm"
RPM_HASH = "17d1ab71ceee4eee46bad1557631d0cc181e59aa71491fcc5edd48cc506e4d0e8c7acc68ac78fcebb39b95f3125b5dd8703eaad26dc0adf6d9fd24d1e2199973"

RPROVIDES:${PN} += "baobab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
