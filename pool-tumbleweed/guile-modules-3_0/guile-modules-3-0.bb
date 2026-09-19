SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains guile modules."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.11"

RPM_NAME = "guile-modules-3_0-3.0.11-1.1.aarch64.rpm"
RPM_HASH = "402bed799330c67db20552d44176fb5ab84ff62e409d9bf61c5bcf67f2473a131e4f24cb3fccaffd0b5eb0f160835cc05456a3481cb5fb177e5bb87f4f5f5aa8"

RPROVIDES:${PN} += "guile-modules-3-0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libm.so.6 \
libreadline.so.8 \
libunistring.so.5"

inherit rpm
