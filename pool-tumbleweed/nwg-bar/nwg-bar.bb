SUMMARY = "Golang replacement to the nwgbar"
DESCRIPTION = "Golang replacement to the nwgbar command (a part of nwg-launchers), with some improvements. Originally aimed at sway, works with wlroots-based compositors only."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "nwg-bar-0.1.6-1.14.aarch64.rpm"
RPM_HASH = "ba46eaefae86b04d56aad483960316c10dfe10e096ba2fc50602cf472caec1ba2f5543fd06bd49ed25e4f3264348e21312436a9227170d09d0604f7900f617fc"

RPROVIDES:${PN} += "nwg-bar"

RDEPENDS:${PN} += "libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
