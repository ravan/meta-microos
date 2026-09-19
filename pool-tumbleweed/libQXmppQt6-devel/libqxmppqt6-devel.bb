SUMMARY = "Qxmpp Development Files"
DESCRIPTION = "Development package for qxmpp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.3"

RPM_NAME = "libQXmppQt6-devel-1.16.3-1.3.aarch64.rpm"
RPM_HASH = "d90a9dc60a3e30c77c9bb927276d7a7985aa2961689e0279c4f1ab0555a7e4a372f05cf4a373004c12f0642ee336c7986dd9df1e054547781fb58c8773fe6699"

RPROVIDES:${PN} += "cmake-QXmppOmemoQt6 \
cmake-QXmppQt6 \
libQXmppQt6-devel \
pkgconfig-QXmppQt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQXmppQt6-10 \
pkgconfig-gstreamer-1.0"

inherit rpm
