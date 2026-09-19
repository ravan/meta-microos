SUMMARY = "Keyboard LEDs plugin for the Xfce panel"
DESCRIPTION = "This plugin allows to display the keyboard LED state in the Xfce panel"
LICENSE = "GPL-2.0-only"

PV = "0.3.0"

RPM_NAME = "xfce4-kbdleds-plugin-0.3.0-1.9.aarch64.rpm"
RPM_HASH = "9413c5712d6c97c06a062e9979fab3479c59e012aa506ac1c8cb096f46486ee2fec4cf6aac126aabd625e5aad774773f7d6aad0648fc4bb0f771a3d7831d7e07"

RPROVIDES:${PN} += "libkbdleds.so \
xfce4-kbdleds-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
