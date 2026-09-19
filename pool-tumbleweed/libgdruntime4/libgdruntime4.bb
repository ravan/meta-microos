SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.5.0+git10516"

RPM_NAME = "libgdruntime4-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "6f7ca86e6f647f2d301c2f332ca5143670fe9ed166161c7d004120a892e5993d65c46060e68180b1cbf705b34041479e9e1db7fc41a3e905a4eab45e4a97347f"

RPROVIDES:${PN} += "libgdruntime.so.4 \
libgdruntime4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
