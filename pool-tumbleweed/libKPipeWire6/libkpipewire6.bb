SUMMARY = "PipeWire integration for KDE Plasma - main library"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the main KPipeWire library."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "libKPipeWire6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "9184d9c56856eac09caa8f29e32091f410caa5c1f3b5c72343be0022f6474851c244229d70d6279d14a184ce27f7ae93399d1e782e3365872d635da3cb239924"

RPROVIDES:${PN} += "libKPipeWire.so.6 \
libKPipeWire6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libpipewire-0.3.so.0 \
libstdc++.so.6 \
libva-drm.so.2 \
libva.so.2"

inherit rpm
