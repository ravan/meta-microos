SUMMARY = "CmmonMark parsing and rendering library"
DESCRIPTION = "It provides a shared library (`libcmark`) with functions for parsing \
CommonMark documents to an abstract syntax tree (AST), manipulating \
the AST, and rendering the document to HTML, groff man, LaTeX, \
CommonMark, or an XML representation of the AST.  It also provides a \
command-line program (`cmark`) for parsing and rendering CommonMark \
documents."
LICENSE = "BSD-2-Clause & MIT & CC-BY-SA-4.0"

PV = "0.31.1"

RPM_NAME = "libcmark0_31_1-0.31.1-1.4.aarch64.rpm"
RPM_HASH = "640fa2918abbc114dfc58b5916049aa1fa524612ec7f99a88f56644441d618bea9ddfc055da92926610091215db44e65ae71d1aae67112ae2aeef0d1897567f6"

RPROVIDES:${PN} += "libcmark.so.0.31.1 \
libcmark0-31-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
