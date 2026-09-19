SUMMARY = "Library for parsing Concise Binary Object Representation (CBOR)"
DESCRIPTION = "libcbor is a C99 library for parsing and generating CBOR (RFC 7049), \
a general-purpose schema-less binary data format. \
 \
It supports flexible memory management, UTF-8, streams & incremental \
processing, and has a layered architecture."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "libcbor-doc-0.14.0-1.2.aarch64.rpm"
RPM_HASH = "1f708b4628b50afde65e62ec884d326473e02aa66e896695c42eb7ec4b46603784d53e82197be8933f6f5f5d178ed7155b59d3f1ca42fb86e3aa6228b9e96520"

RPROVIDES:${PN} += "libcbor-doc"

RDEPENDS:${PN} += ""

inherit rpm
