SUMMARY = "Development package for libdbusmenu-lxqt"
DESCRIPTION = "This package contains development files for libdbusmenu-lxqt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "libdbusmenu-lxqt-devel-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "8a166864e415cc71ceb93f7a499ba8159a19dba76f2084d855e00f580b07277e1452563f85cc64584af9cf93e8c2a1f6506a079375173b7dd58ff6d63c48bf93"

RPROVIDES:${PN} += "cmake-dbusmenu-lxqt \
libdbusmenu-lxqt-devel \
pkgconfig-dbusmenu-lxqt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-lxqt0"

inherit rpm
