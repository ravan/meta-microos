SUMMARY = "Static libraries, header files and documentation for libwmf"
DESCRIPTION = "The libwmf-devel package contains the header files and static libraries \
necessary for developing programs using libwmf."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.15"

RPM_NAME = "libwmf-devel-0.2.15-1.3.aarch64.rpm"
RPM_HASH = "05a9306a25ad5c9165a7f9bba598ca2d149e57e264abc39115244e2a9d8f01501c9867bb504f97b97be46525501fe6ef3da8bb0df6e194f70f45d5e3c4911507"

RPROVIDES:${PN} += "libwmf-devel \
mswordvd-/usr/lib/libwmf.a \
pkgconfig-libwmf \
wv-devel-/usr/lib/libwmf.a"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libwmf-0-2-7 \
libwmf-gnome \
pkgconfig-freetype2 \
pkgconfig-x11 \
pkgconfig-xproto \
pkgconfig-zlib"

inherit rpm
