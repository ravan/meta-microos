SUMMARY = "Qt GUI binary for NekoBox"
DESCRIPTION = "Qt GUI binary for NekoBox"
LICENSE = "GPL-3.0-only"

PV = "5.11.28.2"

RPM_NAME = "nekobox-qt-5.11.28.2-1.1.aarch64.rpm"
RPM_HASH = "99c01fdce83855a24d71eef65e1311f2f51b1a2d5713b42ffce2f80723546c39b37696212fa639834d42403eb0247ca3d18b9d8c8f71b189c662207b51c3b2fa"

RPROVIDES:${PN} += "nekobox-qt \
nekoray"

RDEPENDS:${PN} += "/usr/bin/sh \
google-noto-coloremoji-fonts \
google-noto-sans-fonts \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libacl.so.1 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libleveldb.so.1 \
libm.so.6 \
libstdc++.so.6 \
libthrift-0.24.0.so \
libyaml-cpp.so.0.9"

inherit rpm
