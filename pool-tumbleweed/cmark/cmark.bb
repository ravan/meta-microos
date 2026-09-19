SUMMARY = "CommonMark parsing and rendering library and program in C"
DESCRIPTION = "`cmark` is the C reference implementation of CommonMark, \
a rationalized version of Markdown syntax with a spec. \
 \
It provides a shared library (`libcmark`) with functions for parsing \
CommonMark documents to an abstract syntax tree (AST), manipulating \
the AST, and rendering the document to HTML, groff man, LaTeX, \
CommonMark, or an XML representation of the AST.  It also provides a \
command-line program (`cmark`) for parsing and rendering CommonMark \
documents."
LICENSE = "BSD-2-Clause & MIT & CC-BY-SA-4.0"

PV = "0.31.1"

RPM_NAME = "cmark-0.31.1-1.4.aarch64.rpm"
RPM_HASH = "412fcc6c8602660c2daf48dcba5b3e2d44d6df03e75053a0795355a3c9a2a73de8aa0e694953f32c5e79ea6890b82235276c9730a3a46290b16aa896762eb36f"

RPROVIDES:${PN} += "cmark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcmark.so.0.31.1"

inherit rpm
