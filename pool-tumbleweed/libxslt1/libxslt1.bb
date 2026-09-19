SUMMARY = "XSL Transformation Library"
DESCRIPTION = "This C library allows you to transform XML files into other XML files \
(or HTML, text, and more) using the standard XSLT stylesheet \
transformation mechanism. \
 \
It is based on libxml (version 2) for XML parsing, tree manipulation, \
and XPath support. It is written in plain C, making as few assumptions \
as possible and sticks closely to ANSI C/POSIX for easy embedding. \
It includes support for the EXSLT set of extension functions as well \
as some common extensions present in other XSLT engines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.45"

RPM_NAME = "libxslt1-1.1.45-1.4.aarch64.rpm"
RPM_HASH = "d8633770e718284749309edd2228742f5a3886dcd001c0648a7ed954e38d3d2df09bc4e10d699b0a9d348e369ef8ed804fe88b90d9b4eb84a4e29c29c3c09e0a"

RPROVIDES:${PN} += "libxslt.so.1 \
libxslt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libxml2.so.16"

inherit rpm
