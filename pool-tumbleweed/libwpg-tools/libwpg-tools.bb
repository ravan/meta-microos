SUMMARY = "Tools for converting WordPerfect Graphics files"
DESCRIPTION = "Tools to work with graphics in WPG (WordPerfect Graphics) format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-tools-0.3.4-2.12.aarch64.rpm"
RPM_HASH = "9a37d66d9ee9a710983be53c103e4ffd8535c0445088241033d64b789d2c94e00973e98286aa1da86e9762953ef209f35fd32c790e7b710c48d53f8dd07b44c9"

RPROVIDES:${PN} += "libwpg-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libwpg-0.3.so.3"

inherit rpm
