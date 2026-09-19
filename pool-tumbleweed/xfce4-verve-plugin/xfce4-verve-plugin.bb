SUMMARY = "Command Line Plugin for the Xfce Panel"
DESCRIPTION = "The Verve panel plugin is a command line plugin for the Xfce panel which \
supports a command history, auto-completion, keyboard-shortcut focus grabbing and \
opening URLs."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "xfce4-verve-plugin-2.1.0-1.4.aarch64.rpm"
RPM_HASH = "8b3c202b0e683fd16eb048206cb3bfee5181059dd5c4d1c1413ee5c7e77b5cf329c67e4a68384385f7691bfda2ad71995e699b6fca3581bb5823df91ffe6920a"

RPROVIDES:${PN} += "libverve.so \
xfce4-panel-plugin-verve \
xfce4-verve-plugin"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpcre2-8.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
