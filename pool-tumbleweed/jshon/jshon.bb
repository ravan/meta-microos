SUMMARY = "A JSON parser for the shell"
DESCRIPTION = "Jshon parses, reads and creates JSON. It is usable from within the \
shell and can replace adhoc parsers made from grep/sed/awk as well as \
one-line parsers made from perl/python."
LICENSE = "MIT"

PV = "20131105"

RPM_NAME = "jshon-20131105-2.25.aarch64.rpm"
RPM_HASH = "75f5e9357c22a938add57f11d415739abf64b66da56ba140e7c6f54c8f317a5f543cc9af120ae4d8cc98dd8dbe9f20db3b959b79f7ebb175c70191997ada82bd"

RPROVIDES:${PN} += "jshon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4"

inherit rpm
