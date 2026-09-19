SUMMARY = "Graphical User Interface for GDB"
DESCRIPTION = "KDbg is a graphical user interface for GDB, the GNU debugger. It \
provides an intuitive interface for setting breakpoints, inspecting \
variables, and stepping through code."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "kdbg-3.2.0-1.4.aarch64.rpm"
RPM_HASH = "2fe9950728c8fb85bbb7baa217b02e8ab3a2cb14914730f0005ad612b7f8a211e172ea18fe6ac71dc323db9eecd8990b2b62563de1673e270cc4626387f63528"

RPROVIDES:${PN} += "config-kdbg \
kdbg"

RDEPENDS:${PN} += "gdb \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
