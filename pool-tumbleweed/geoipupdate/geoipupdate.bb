SUMMARY = "GeoIP update client code"
DESCRIPTION = "The GeoIP Update program performs automatic updates of GeoIP2 and GeoIP Legacy \
binary databases. Currently the program only supports Linux and other \
Unix-like systems."
LICENSE = "Apache-2.0 | MIT"

PV = "8.0.0"

RPM_NAME = "geoipupdate-8.0.0-1.2.aarch64.rpm"
RPM_HASH = "56da57c5a6d0b39315d51d6865ba57b68a0abe1260636c7e936af9ea6626b10dfcd41b497148df646de7b4d92474f57e45108b4dfbb92b6ceb0d9231cd8894a0"

RPROVIDES:${PN} += "config-geoipupdate \
geoipupdate"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
