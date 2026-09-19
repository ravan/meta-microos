SUMMARY = "HTML and CSS APIs for C++"
DESCRIPTION = "This is a simple non-validating css1 and html parser for C++. Although there are several other html parsers available, htmlcxx has some characteristics that make it unique: \
 \
- STL like navigation of DOM tree, using excelent's tree.hh library from Kasper Peeters \
- It is possible to reproduce exactly, character by character, the original document from the parse tree \
- Bundled css parser \
- Optional parsing of attributes \
- C++ code that looks like C++ (not so true anymore) \
- Offsets of tags/elements in the original document are stored in the nodes of the DOM tree"
LICENSE = "Apache-2.0 & LGPL-2.0-only"

PV = "0.87"

RPM_NAME = "htmlcxx-0.87-3.1.aarch64.rpm"
RPM_HASH = "0c62424ce0ce9fcc443bc0760a3a4fe0ea6b5fc9f7af951b61ae2fd3551405e909ca257f095813e088d670bd29399c0b46adf720096ef0d9e63a268a11762b6e"

RPROVIDES:${PN} += "htmlcxx \
libcss-parser-pp.so.0 \
libcss-parser.so.0 \
libhtmlcxx.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
