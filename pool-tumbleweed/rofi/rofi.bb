SUMMARY = "A window switcher, run dialog and dmenu replacement"
DESCRIPTION = "rofi is a popup window switcher roughly based on 'superswitcher', \
requiring only xlib and pango. This version started off as a clone of \
simpleswitcher, the version from Sean Pringle. Rofi developed extra \
features, like a run dialog, SSH launcher and can act as a drop-in \
dmenu replacement."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "rofi-2.0.0-1.7.aarch64.rpm"
RPM_HASH = "f69700a5492b58026716bebf8a3a503225105edc66881854d31aea6e652ffd721d63ed91d69be0bdb83d956094f865d1109385b0ac4d475372363f5c04646556"

RPROVIDES:${PN} += "rofi \
rofi-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstartup-notification-1.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxcb-cursor.so.0 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb-xinerama.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
xdg-utils"

inherit rpm
