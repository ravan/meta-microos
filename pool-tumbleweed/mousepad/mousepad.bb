SUMMARY = "Simple Text Editor for Xfce"
DESCRIPTION = "Mousepad is a simple text editor for Xfce."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "mousepad-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "7783d43ba26d5525f4bfbbf84a63275fcc7a726393df0e184cb077b6e460cdf96a797b88d0d2c51fd1c21bd56300b01a81da1e269aacf5b7e9b807e000e9aa75"

RPROVIDES:${PN} += "libmousepad-plugin-gspell.so \
libmousepad-plugin-shortcuts.so \
mousepad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.3 \
libgtk-3.so.0 \
libmousepad.so.0 \
libxfce4kbd-private-3.so.0"

inherit rpm
