SUMMARY = "XML Parser Toolkit"
DESCRIPTION = "Expat is an XML parser library written in C. It is a stream-oriented \
parser in which an application registers handlers for things the \
parser might find in the XML document (like start tags)."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "libexpat1-2.8.4-1.1.aarch64.rpm"
RPM_HASH = "28810460c7c5d76747aab585b4f3c936557cc3eac12512a3080fcdd27fa44e6657261868b59d8a5ba718859b0c2dbc285a29984034fc8bbfebb503246dd07cb0"

RPROVIDES:${PN} += "libexpat.so.1 \
libexpat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
