SUMMARY = "Gcin gtk3 immodule"
DESCRIPTION = "gcin gtk3 immodule, support gtk3-based applications"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-gtk3-2.9.0-7.9.aarch64.rpm"
RPM_HASH = "8fa851d2279b4d251d4597eaf7b0e27457682fe3b52d6d0407c4c46a737003510e62f5afae07be243389b923390ede046530e3de0da5430e255e69658f7d58ae"

RPROVIDES:${PN} += "gcin-gtk3 \
gcin-gtk3-immodule"

RDEPENDS:${PN} += "/usr/bin/sh \
gcin \
libc.so.6 \
libgcin-im-client.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
