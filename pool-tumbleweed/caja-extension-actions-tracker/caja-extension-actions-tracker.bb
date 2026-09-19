SUMMARY = "A plugin which tracks the current Caja selection"
DESCRIPTION = "caja-extension-actions-tracker is a plugin which tracks the current Caja \
selection, and sends it in response to a DBus request."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-actions-tracker-1.28.0-1.10.aarch64.rpm"
RPM_HASH = "ffa3333cbc4098e606e024c0dde3271df11345dfb6281ed8446d8135d568fdf0c0832735907b6322159c059b5d2f568aff6d8f01e677f578c7f98029b7ec3310"

RPROVIDES:${PN} += "caja-extension-actions-tracker \
libcaja-actions-tracker.so"

RDEPENDS:${PN} += "caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
