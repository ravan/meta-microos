SUMMARY = "The X11 Protocol: Fontcache extension"
DESCRIPTION = "The Fontcache protocol headers for X11 development."
LICENSE = "BSD-2-Clause"

PV = "0.1.3"

RPM_NAME = "fontcacheproto-devel-0.1.3-4.27.aarch64.rpm"
RPM_HASH = "f0ea7600c9d5511c7c814e5a05199522c26cf7cadf0454eda755813bd3644ac3c837f10338c7d122248128844a046d9dc39271defca78adfa513c4ae7bdfab04"

RPROVIDES:${PN} += "fontcacheproto-devel \
pkgconfig-fontcacheproto \
xorg-x11-proto-devel-/usr/lib64/pkgconfig/fontcacheproto.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
