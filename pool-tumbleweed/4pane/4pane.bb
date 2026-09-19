SUMMARY = "A multi-pane detailed-list file manager"
DESCRIPTION = "4Pane is a multi-pane detailed-list file manager. \
It favors speed over visual effects. \
In addition to standard file manager features, it offers multiple undo and redo \
of most operations (including deletions), archive management including 'virtual \
browsing' inside archives, multiple renaming/duplication of files, a terminal \
emulator and user-defined tools."
LICENSE = "GPL-3.0-only"

PV = "8.0"

RPM_NAME = "4pane-8.0-2.6.aarch64.rpm"
RPM_HASH = "64389efac3c5dceaee363b96bf12bb2286bd3bae73a431c8bb722777e673da79c6825d9aab90e756db897bdbd667c3786d2d40be1e44d6c516489f7c178a4e0c"

RPROVIDES:${PN} += "4pane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0 \
libwx-gtk2u-xrc-suse.so.16.0.0"

inherit rpm
