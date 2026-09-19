SUMMARY = "Yet Another JSON Library"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl2-2.1.0-9.6.aarch64.rpm"
RPM_HASH = "7b48ff1a916f63087456ab82fdfa968ba3fb906daddfa460a2214ac4cd876b9ba2af5e3fa8ec1874d2937bf833a145885be237999e2ea2ce0a9ab1c3ba792e37"

RPROVIDES:${PN} += "libyajl.so.2 \
libyajl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
