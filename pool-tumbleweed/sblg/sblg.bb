SUMMARY = "Static blog utility"
DESCRIPTION = "sblg is a utility for creating static blogs. It merges articles into templates, generating static HTML files, Atom feeds, and JSON files. It's built for use with make-style build environments."
LICENSE = "ISC"

PV = "0.6.1"

RPM_NAME = "sblg-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "20d3067dbd9c33633a469611a51c8ccd393b756609931d234d8c9ed562510a8c7a14de1a01543aef82c8edd573a273f724d71c29b358f2460c3339ff7f494e48"

RPROVIDES:${PN} += "sblg"

RDEPENDS:${PN} += "libc.so.6 \
libexpat.so.1"

inherit rpm
