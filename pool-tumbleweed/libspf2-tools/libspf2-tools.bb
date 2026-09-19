SUMMARY = "Programs for making SPF queries using libspf2"
DESCRIPTION = "Programs for making SPF queries and checking their results using libspf2."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-tools-1.2.11-8.13.aarch64.rpm"
RPM_HASH = "9a1d3b134b3bc742f6fdd22bc8826c12dff1bc7867cdc21533b58baaf01c4189108701aa67215da0d2cec5a3ae14d612ba245e485f8a3e576313639c4c19656a"

RPROVIDES:${PN} += "libspf2-tools \
spf2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspf2.so.2"

inherit rpm
