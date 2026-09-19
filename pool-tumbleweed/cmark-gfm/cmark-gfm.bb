SUMMARY = "GitHub's fork of cmark, a CommonMark parsing and rendering library"
DESCRIPTION = "cmark-gfm is an extended version of the C reference implementation of \
CommonMark, a rationalized version of Markdown syntax with a spec. It \
adds GitHub Flavored Markdown extensions (tables, strikethrough, \
autolinks, task lists and more). \
 \
It provides shared libraries with functions for parsing CommonMark \
documents to an abstract syntax tree (AST), manipulating the AST, and \
rendering the document to HTML, groff man, LaTeX, CommonMark, or an XML \
representation of the AST. It also provides a command-line program \
(cmark-gfm) for parsing and rendering CommonMark documents."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.29.0.gfm.13"

RPM_NAME = "cmark-gfm-0.29.0.gfm.13-1.3.aarch64.rpm"
RPM_HASH = "9a72058338fd7322b9abfca50c03198b8a16d2f8d24f6805d3831a7dde502db88849d9e1daf5d49969260fcc900f84aec60de22e13547ce341fe4b9022fd64db"

RPROVIDES:${PN} += "cmark-gfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcmark-gfm-extensions.so.0.29.0.gfm.13 \
libcmark-gfm.so.0.29.0.gfm.13"

inherit rpm
