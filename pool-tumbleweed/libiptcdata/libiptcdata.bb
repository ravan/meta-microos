SUMMARY = "IPTC Metadata Tag Manipulation Library"
DESCRIPTION = "libiptcdata is a library for parsing, editing, and saving IPTC \
(International Press Telecommunications Council) data. stored within \
multimedia files such as images."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata-1.0.5-1.20.aarch64.rpm"
RPM_HASH = "048db58de177a213fc5efbdc89ff89c017441f8be4fb0165237033e6a6d9e606420b16a61319274706a545fb97ea006e9a10ef6f3abbc574f3c7cd4532854d09"

RPROVIDES:${PN} += "libiptcdata"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiptcdata.so.0 \
libiptcdata0"

inherit rpm
