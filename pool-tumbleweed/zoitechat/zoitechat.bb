SUMMARY = "A graphical IRC (chat) client, fork of HexChat"
DESCRIPTION = "ZoiteChat is a graphical IRC chat client, a fork of HexChat. \
It allows joining multiple IRC channels (chat rooms) at the same time, \
talking publicly, private one-on-one conversations, etc. File transfers \
are possible."
LICENSE = "GPL-2.0-or-later"

PV = "2.19.0"

RPM_NAME = "zoitechat-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "215582d78b6237c857823c81313f4cc8a488644506655c5a2e8c37414b7622f4c2c58ab1a22d60b4d6e3bf5a4df014b35999e07c9d2b51c172cedd5a77a662bb"

RPROVIDES:${PN} += "zoitechat"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libcrypto.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpci.so.3 \
libsecret-1.so.0 \
libssl.so.3"

inherit rpm
