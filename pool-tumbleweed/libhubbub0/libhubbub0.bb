SUMMARY = "An HTML5 compliant parsing library"
DESCRIPTION = "Hubbub is an HTML5 compliant parsing library, written in C. It was \
developed as part of the NetSurf project. \
 \
The HTML5 specification defines a parsing algorithm, based on the \
behaviour of mainstream browsers, which provides instructions for how to \
parse all markup, both valid and invalid. As a result, Hubbub parses web \
content well. \
 \
Features: \
* Parses HTML, good and bad \
* Simple C API \
* Fast \
* Character encoding detection \
* Well-tested (~90% test coverage) \
* Portable"
LICENSE = "MIT"

PV = "0.3.7"

RPM_NAME = "libhubbub0-0.3.7-2.20.aarch64.rpm"
RPM_HASH = "01d938703af3170a537bbd20a9b8c5ce91d84de835552294763ef4cc73ed719a00ca206bbca25bba060f13882bfd36f24d695d94fc372921207c686ea45b40e9"

RPROVIDES:${PN} += "libhubbub.so.0 \
libhubbub0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libparserutils.so.0"

inherit rpm
