SUMMARY = "Thunar Plugin Providing Integration with Archive Managers"
DESCRIPTION = "The Thunar Archive Plugin allows for creating and extracting archive files \
through the file context menus in the Thunar file manager using an archive \
manager. It provides scripting interface that can be used to adapt it to \
different archive managers."
LICENSE = "LGPL-2.0-only"

PV = "0.6.0"

RPM_NAME = "thunar-archive-plugin-0.6.0-1.6.aarch64.rpm"
RPM_HASH = "11235fdad0e4c87846db4618a7ff8671711a066211023f29f1fc552592df60a268ca89d7b5f96ac9a8b2098edf042e3344fffdfee55eb67ecec85e415f18bbad"

RPROVIDES:${PN} += "thunar-archive-plugin \
thunar-plugin-archive"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libthunarx-3.so.0 \
thunar"

inherit rpm
