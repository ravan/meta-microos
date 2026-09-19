SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "14.4.0+git12698"

RPM_NAME = "libgdruntime5-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "1f88853e726154e62382bcc21c40f962a0af8e50931277fbde08167512d0d5868dc0ebe17c67d4dcecf84da9b85f62a4eaf4e1909148b5f973032441abee47e6"

RPROVIDES:${PN} += "libgdruntime.so.5 \
libgdruntime5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
