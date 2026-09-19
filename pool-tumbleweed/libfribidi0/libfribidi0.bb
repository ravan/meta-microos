SUMMARY = "An implementation of the Unicode BiDi algorithm"
DESCRIPTION = "This library implements the algorithm as described in 'Unicode \
Standard Annex #9, the Bidirectional Algorithm, \
http://www.unicode.org/unicode/reports/tr9/'. FriBidi is \
tested against the Bidi Reference Code and, to the best of the \
developers' knowledge, does not contain any conformance bugs. \
 \
The API was inspired by the document 'Bi-Di languages support - BiDi \
API proposal' by Franck Portaneri, which he wrote as a proposal for \
adding BiDi support to Mozilla."
LICENSE = "LGPL-2.1-only"

PV = "1.0.16"

RPM_NAME = "libfribidi0-1.0.16-1.3.aarch64.rpm"
RPM_HASH = "34c4facb249f266c2e290b4908925ab6070ee7dec5a384cac56ffc28909de9e0ece0f35741b8d25930260bbec1e7f7ca0820b9b57ca8f2830ba6c67f478c17f5"

RPROVIDES:${PN} += "libfribidi.so.0 \
libfribidi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
