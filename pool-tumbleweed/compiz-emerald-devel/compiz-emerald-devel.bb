SUMMARY = "Development files for compiz-emerald"
DESCRIPTION = "Emerald is a themeable window decorator for Compiz. \
 \
This package holds the development files for compiz-emerald."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-devel-0.8.18-2.25.aarch64.rpm"
RPM_HASH = "96ba60a5dc1bc0d5382514e2438408e0df0ceaf6562381123776cf18105031c4be4b8b09970a456731d8306e80244dc75e6123b6c0cd0ccd90730df6b46836ce"

RPROVIDES:${PN} += "compiz-emerald-devel \
pkgconfig-emeraldengine"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
compiz-emerald \
gcc-c++ \
pkgconfig-cairo \
pkgconfig-gtk+-3.0 \
pkgconfig-libdecoration \
pkgconfig-libwnck-3.0 \
pkgconfig-pangocairo \
pkgconfig-xi \
pkgconfig-xrender"

inherit rpm
