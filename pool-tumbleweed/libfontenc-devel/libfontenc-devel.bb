SUMMARY = "Development files for the X11 font encoding library"
DESCRIPTION = "The libfontenc library is used by the Xorg server and other X font \
tools for handling fonts with different character set encodings. \
 \
This package contains the development headers for the library found \
in libfontenc1."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "libfontenc-devel-1.1.9-1.4.aarch64.rpm"
RPM_HASH = "4be92f7bec902c9396592900e30f03ab6111503acba58bfd20cbef42baf86853aa8636d0384889cd4743723a186b470e04fa6c4be59ca0c038883255f505c200"

RPROVIDES:${PN} += "libfontenc-devel \
pkgconfig-fontenc \
xorg-x11-libfontenc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfontenc1 \
pkgconfig-xproto \
pkgconfig-zlib"

inherit rpm
