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
This package provides the md4c library."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "libmd4c0-0.5.3-1.3.aarch64.rpm"
RPM_HASH = "7534d8c2aae857360cd132948e859d7441d1773fe3525444e0f7b1d4be64764deff4dd664b46b3f00ce64ae16617b763a3c548a18b0382260e30606b93dcd265"

RPROVIDES:${PN} += "libmd4c-html.so.0 \
libmd4c.so.0 \
libmd4c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
