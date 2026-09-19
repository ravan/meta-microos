SUMMARY = "A plugin which takes care of displaying actions in Caja context menus"
DESCRIPTION = "caja-extension-actions-menu is a plugin which takes care of displaying actions \
in Caja context menus"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-actions-menu-1.28.0-1.10.aarch64.rpm"
RPM_HASH = "63ab73d02e215bd04850b8238ff567c281e98db6b17fa2d582d2beea682bbad32358d9db311dc19b0723d1a122909272192f6fcb5140134bd08337dcdd62b071"

RPROVIDES:${PN} += "caja-extension-actions-menu \
libcaja-actions-menu.so"

RDEPENDS:${PN} += "caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libna-core.so"

inherit rpm
