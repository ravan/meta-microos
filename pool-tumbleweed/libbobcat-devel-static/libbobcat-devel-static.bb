SUMMARY = "Bobcat static library"
DESCRIPTION = "Bobcat static library"
LICENSE = "GPL-3.0-only"

PV = "6.15.01"

RPM_NAME = "libbobcat-devel-static-6.15.01-1.1.aarch64.rpm"
RPM_HASH = "fa3a77503f66d3fc2bc790795e4d302fc8b013b7ac7bbab47559cd2de04948384360308491605dba48e08d86dd97b7dfb7efe03cbebf141b444b81af35c4ab33"

RPROVIDES:${PN} += "libbobcat-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
