SUMMARY = "Development files for the VLC media player system"
DESCRIPTION = "These development headers are required if you plan on coding against VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.23"

RPM_NAME = "vlc-devel-3.0.23-7.12.aarch64.rpm"
RPM_HASH = "379712f757ab645176246f6f69928532f12bf683bada1939af2d2a4258e2af8252c393406d2d7f090caf096b0321132d1a467d57548ba84f1624148c10df5b0e"

RPROVIDES:${PN} += "pkgconfig-libvlc \
pkgconfig-vlc-plugin \
vlc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
vlc \
vlc-jack \
vlc-noX"

inherit rpm
