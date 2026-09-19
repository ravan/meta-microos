SUMMARY = "Graphical user interface to send and read mail with MH"
DESCRIPTION = "The xmh program provides a graphical user interface to the \
MH Message Handling System. To actually do things with your \
mail, it makes calls to the MH package."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "xmh-1.0.5-1.9.aarch64.rpm"
RPM_HASH = "e4f084f50c3e725f8aa5a2121de593cfc19157aa25ecf7b2092645f87325882aa89c01c15d933898dd191f9c390105301063b96ef945de85f4a307a9cf8b89bd"

RPROVIDES:${PN} += "xmh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
nmh"

inherit rpm
