SUMMARY = "Documentation files for the uriparser URI parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
 \
This package contains the documentation for uriparser."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "uriparser-doc-1.0.2-2.1.aarch64.rpm"
RPM_HASH = "e440e48be505250b80f8e75d3c5cc4b266b23209a111e22c61fdfac7c5c160409de5ed98178767aaa551f25ae79466f6bb9798b835b6315fb4e94d7af404780d"

RPROVIDES:${PN} += "uriparser-doc"

RDEPENDS:${PN} += ""

inherit rpm
