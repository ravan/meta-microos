SUMMARY = "Launch through the Caja file manager popup menu of selected files"
DESCRIPTION = "Caja-actions is an extension for Caja file manager which allows the user to add \
arbitrary program to be launched through the Caja file manager popup menu of \
selected files."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-actions-1.28.0-1.10.aarch64.rpm"
RPM_HASH = "911444a45b6e246c643c84ffae182232bd9ce2e026df8c89ddf9ac8322e60f8843da10a7bb18ee518b67637573d870b941d889105953954ac49976e688b53eb4"

RPROVIDES:${PN} += "caja-actions \
libna-core.so \
libna-io-desktop.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libc.so.6 \
libcaja-extension.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libuuid.so.1"

inherit rpm
