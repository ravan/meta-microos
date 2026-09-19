SUMMARY = "Development files for wpewebkit"
DESCRIPTION = "WPE allows embedders to create simple and performant systems based on \
Web platform technologies. It is designed with hardware acceleration \
in mind, leveraging common 3D graphics APIs for best performance."
LICENSE = "BSD-3-Clause & LGPL-2.1-only"

PV = "2.52.6"

RPM_NAME = "wpewebkit-devel-2.52.6-1.1.aarch64.rpm"
RPM_HASH = "ccc006fc64af57d3a2280a394c2e79f0cbb380fa6a56b3ac61e6b04449274de7997063ab24d4cdef7a39b103d06dd26c88f1dcef0e29ed18eb757cb3317e9b31"

RPROVIDES:${PN} += "pkgconfig-wpe-web-process-extension-2.0 \
pkgconfig-wpe-webkit-2.0 \
wpewebkit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libWPEWebKit-2-0-1 \
pkgconfig-glib-2.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-wpe-1.0"

inherit rpm
