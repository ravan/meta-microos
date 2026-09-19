SUMMARY = "C Markdown parser"
DESCRIPTION = "MD4C is Markdown parser implementation in C, with the following features: \
- Compliance: Generally, MD4C aims to be compliant to the latest version of CommonMark specification. \
- Extensions: MD4C supports some commonly requested and accepted extensions. \
- Compactness: MD4C parser is implemented in one source file and one header \
file. \
- Embedding: MD4C parser is easy to reuse in other projects. \
- Push model: MD4C parses the complete document and calls few callback \
functions provided by the application to inform it about a start/end of every block, a start/end of every span, and with any textual contents. \
- Encoding: MD4C by default expects UTF-8 encoding of the input document. \
 \
This package provides the md2html utility."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "md4c-0.5.3-1.3.aarch64.rpm"
RPM_HASH = "b71aa080cdb8f243a2da2ffbb9392f5a066884bc93af2d3fd5050618366783fd95be70063a4f48ff8c6c7ed4d5930c90a2f8d80dc19c9069e057ce1604468f62"

RPROVIDES:${PN} += "md4c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmd4c-html.so.0"

inherit rpm
