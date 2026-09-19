SUMMARY = "Shared libraries for Xerces-c - a validating XML parser"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. Xerces-C is \
faithful to the XML 1.0 recommendation and associated standards ( DOM \
1.0, DOM 2.0. SAX 1.0, SAX 2.0, Namespaces). \
 \
This package contains shared libraries."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "libxerces-c-3_3-3.3.0-1.9.aarch64.rpm"
RPM_HASH = "32162ff2b9d06f27fd56457e9edcfb4dfc2b313abc63a6e2be0acbba340fb5095dc3314eeb619808c49a27a1deff47672628ea1b36a77d96b96dbe31107bd555"

RPROVIDES:${PN} += "Xerces-c \
libxerces-c-3-3 \
libxerces-c-3.3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
