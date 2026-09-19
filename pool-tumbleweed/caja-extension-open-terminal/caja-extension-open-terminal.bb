SUMMARY = "Caja terminal plugin"
DESCRIPTION = "This extension allows to open a Terminal in arbitrary directories \
through Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-open-terminal-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "e1e7dc858e7d71f14390aceec999ba1938db2f64ad1db45bc1c4962a8338f3638dd32dc11e9520ca83722d4c2ae30035024fc9b8d21be9415e80e77a8c285f55"

RPROVIDES:${PN} += "caja-extension-open-terminal \
caja-open-terminal \
libcaja-open-terminal.so \
mate-file-manager-open-terminal"

RDEPENDS:${PN} += "caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-desktop-2.so.17"

inherit rpm
