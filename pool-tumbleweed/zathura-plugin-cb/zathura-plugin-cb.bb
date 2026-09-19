SUMMARY = "Comic book support for zathura"
DESCRIPTION = "The zathura-cb plugin adds comic book support to zathura."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-plugin-cb-2026.07.18-1.1.aarch64.rpm"
RPM_HASH = "113b39a8775c466d969f95dec7efb79d65908d4a8dfd57b5d2588d133316b25476696ff221895419a8476594532540050a4ccde37d9009e71cef70d936a7f174"

RPROVIDES:${PN} += "libcb.so \
zathura-cb-plugin \
zathura-plugin-cb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirara.so.5 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
zathura"

inherit rpm
