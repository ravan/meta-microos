SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.11"

RPM_NAME = "guile-devel-3.0.11-1.1.aarch64.rpm"
RPM_HASH = "586a2ebfc2d7c4a8a7dd525cb8907cb40a34037ca49f72490a356faa6775ddfbcfb2be584f1cba5cf02e1bfc05f3a5d81f8191a37c206840b2daa9447e518ce7"

RPROVIDES:${PN} += "guile-devel \
pkgconfig-guile-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gmp-devel \
guile \
libffi-devel \
libguile-3-0-1 \
libunistring-devel \
ncurses-devel \
pkgconfig-bdw-gc \
readline-devel"

inherit rpm
