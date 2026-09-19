SUMMARY = "Development files for libverto"
DESCRIPTION = "The libverto-devel package contains libraries and header files \
for developing applications that use libverto."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-devel-0.3.2-3.11.aarch64.rpm"
RPM_HASH = "af7a0d189a271a5ca8b89ddf1d6e4c3db3f1ef92e6b2665d1cbe2db01ca3ee9de46c5be0c982df8386a372259ec341895b87d8eea38e9ee973be97560de01e5d"

RPROVIDES:${PN} += "libverto-devel \
pkgconfig-libverto"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libverto1"

inherit rpm
