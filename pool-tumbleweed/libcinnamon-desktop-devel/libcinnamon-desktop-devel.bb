SUMMARY = "Libcinnamon-desktop API -- Development Files"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
This package contains development files for libcinnamon-desktop."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "libcinnamon-desktop-devel-6.4.1-1.8.aarch64.rpm"
RPM_HASH = "c82a916bbab78da35390c93aa5371ce656c9c16af4a30a6aa686b1978b6c8b6179dd84d16f4136183870378f2d60d8a0dd8ff063f2235fe7c2b265c2f8d8f4bf"

RPROVIDES:${PN} += "cinnamon-desktop-devel \
libcinnamon-desktop-devel \
pkgconfig-cinnamon-desktop"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcinnamon-desktop4 \
pkgconfig \
pkgconfig-gtk+-3.0 \
pkgconfig-xkbfile \
typelib-1-0-CinnamonDesktop-3-0"

inherit rpm
