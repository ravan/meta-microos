SUMMARY = "Terminal Emulator for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-terminal is a lightweight and easy to use terminal emulator for the Xfce \
desktop environment. Its major features include a simple configuration \
interface, the ability to use multiple tabs with terminals within a single \
window, the possibility to have a pseudo-transparent terminal background, and a \
compact mode where both the menubar and the window decorations are hidden which \
helps to save space on the desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "xfce4-terminal-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "76b76c4c5fff11c100016768f6db8e284069a763fc84885e4c3d13356d7fc92ae7271db45bbc8056d112ce1e9652ba31f3eb24140f0b5a97671a0fb7aeff1042"

RPROVIDES:${PN} += "xfce4-terminal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpango-1.0.so.0 \
libpcre2-8.so.0 \
libvte-2.91.so.0 \
libxfce4kbd-private-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
