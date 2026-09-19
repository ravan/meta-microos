SUMMARY = "Tools for converting the Microsoft Works text and spreadsheet formats"
DESCRIPTION = "Tools to work with the Microsoft Works word processor and spreadsheet \
file format, based on libwps."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.14"

RPM_NAME = "libwps-tools-0.4.14-1.12.aarch64.rpm"
RPM_HASH = "0d17d7b168d53821be37cae57f50ce0a6cc2ad110bc915f6a402542a57c85222364ab694131597538937f9cb664f327de6e1ada1cb344e3bf1027c9e32d2368c"

RPROVIDES:${PN} += "libwps-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libwps-0.4.so.4"

inherit rpm
