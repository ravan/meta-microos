SUMMARY = "Complex Textlayout Library"
DESCRIPTION = "Library that encapsulates the logic for complex \
text layout and provides a convenient API."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "libraqm0-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "ecf318cb197ead714486ea31cd026e2210338f2b162e9d4d7c859fb88dcd3277e1c91b8a56db975e2b5d9e09d136c1b10f22f62cc52547467eef592e349068b5"

RPROVIDES:${PN} += "libraqm.so.0 \
libraqm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libfribidi.so.0 \
libharfbuzz.so.0"

inherit rpm
