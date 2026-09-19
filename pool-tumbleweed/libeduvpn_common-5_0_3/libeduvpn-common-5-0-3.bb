SUMMARY = "Shared library for eduVPN"
DESCRIPTION = "Shared library written in Go with functions that all eduVPN clients can use."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "libeduvpn_common-5_0_3-5.0.3-1.1.aarch64.rpm"
RPM_HASH = "a953000d4d0bf964f4d9b0c09f08a6a7d8303903302da4ab8ea1a234948d5cc20df8f06c9be17b56ed9fcb87146974f84599b60df2846d9f8898ad343ef852fb"

RPROVIDES:${PN} += "eduvpn-common \
libeduvpn-common-5-0-3 \
libeduvpn-common-5.0.3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
