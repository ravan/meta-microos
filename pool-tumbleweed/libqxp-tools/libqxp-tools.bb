SUMMARY = "Tools to transform QuarkXPress documents into other formats"
DESCRIPTION = "Tools to transform QuarkXPress documents into other formats. \
Currently supported: SVG, plain text, raw."
LICENSE = "MPL-2.0"

PV = "0.0.3"

RPM_NAME = "libqxp-tools-0.0.3-2.3.aarch64.rpm"
RPM_HASH = "1024ad112cc7d22e732528064a074209a841fe4f988bbb1c8bb6ea379fca7049b2e241937ef6e12be872d067a7110dead65624623ba020ce0980e684e7f70c5c"

RPROVIDES:${PN} += "libqxp-tools"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libqxp-0-0-0 \
libqxp-0.0.so.0 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
