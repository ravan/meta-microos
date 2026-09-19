SUMMARY = "A library for parsing Embedded OpenType font files"
DESCRIPTION = "libeot is a library for parsing Embedded OpenType files (Microsoft \
embedded font 'standard') and converting them to other formats."
LICENSE = "MPL-2.0"

PV = "0.01"

RPM_NAME = "libeot-devel-0.01-1.38.aarch64.rpm"
RPM_HASH = "ddd25ea86c10aa6f5fc02a32b01f6b1aa75e9cec6cf864be663eb81cfdd101e6b0c573029eb5a483d600243a58e4866a1e2ca588ec3d8709b5cb55e0553c8c91"

RPROVIDES:${PN} += "libeot-devel \
pkgconfig-libeot"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libeot0"

inherit rpm
