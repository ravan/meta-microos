SUMMARY = "OpenGL window and compositing manager community plugins"
DESCRIPTION = "This package contains the community unsupported Compiz compositing \
manager plugins. \
 \
This package contain development files required for developing \
other plugins."
LICENSE = "GPL-2.0-or-later & GPL-2.0-only"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-experimental-devel-0.8.18-1.26.aarch64.rpm"
RPM_HASH = "39e175d7c6dc9aa6dc14317bea211ca205bed931d54428bee3b29f5b14be7279eefeb3430d40af2ce2ae7a465390f8a01e7a450b71e8e6cf053fede99f0fe6ba"

RPROVIDES:${PN} += "compiz-plugins-experimental-devel"

RDEPENDS:${PN} += "compiz-plugins-experimental \
pkgconfig-bcop \
pkgconfig-compiz \
pkgconfig-gl"

inherit rpm
