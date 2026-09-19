SUMMARY = "A library for parsing Embedded OpenType font files"
DESCRIPTION = "libeot is a library for parsing Embedded OpenType files (Microsoft \
embedded font 'standard') and converting them to other formats."
LICENSE = "MPL-2.0"

PV = "0.01"

RPM_NAME = "libeot0-0.01-1.38.aarch64.rpm"
RPM_HASH = "cdfce519d2e838e9bdc5c8c41526296a6a8ffc873f8b246161af2ec3787f4a2270cd0e66cae711717f0c4be50cd913d8d81a79fced0dedd222aecef048c947e8"

RPROVIDES:${PN} += "libeot.so.0 \
libeot0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
