SUMMARY = "Digest algorithm library designed for speed"
DESCRIPTION = "Xdigest is a digest algorithm implementation library designed for speed. It \
uses assembly optimization for performance, is designed to be small and \
lightweight and provides a simple API. \
 \
This package contains the shared library."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "libxdigest0-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "6441f82886ca61e734a7905e3fa9e0f3770d5af809bad289d3370c4ecbfe885810ca753acd8bccda21b193b74ef1b99a473688e62bd007aa8b357daa25367e68"

RPROVIDES:${PN} += "libxdigest.so.0 \
libxdigest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
