SUMMARY = "Development files for the Xpresent library"
DESCRIPTION = "This package contains header files and documentation for the Xpresent library."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libXpresent-devel-1.0.2-1.5.aarch64.rpm"
RPM_HASH = "3057fdb1d564a1f8a700788510c4e101b32a4f4430a79e2e3bb1e41464b60fa8516f10d035220942ae9c245522a78ca9bb54ebc57840f54aff9074d65fe597f3"

RPROVIDES:${PN} += "libXpresent-devel \
pkgconfig-xpresent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXpresent1 \
pkgconfig-presentproto \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xextproto \
pkgconfig-xfixes \
pkgconfig-xproto \
pkgconfig-xrandr"

inherit rpm
