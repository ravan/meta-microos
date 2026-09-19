SUMMARY = "Development files for the Qt 5 Renderer 3D library"
DESCRIPTION = "Development files for the Qt 5 Renderer 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DRender-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "d8db71d1c2409dc49f9ad95b7605055c7f99646f3cca835c286516ec4195ce5225a5ee2246a7b55964b6e5f5dae39e99b8a8808c6f4da2df179dfd41c7ba8899"

RPROVIDES:${PN} += "cmake-Qt53DRender \
libQt53DRender-devel \
libQt53DRenderer-devel \
pkgconfig-Qt53DRender"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickScene2D5 \
libQt53DRender5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt5Core"

inherit rpm
