SUMMARY = "A Validating XML Parser"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. Xerces-C is \
faithful to the XML 1.0 recommendation and associated standards ( DOM \
1.0, DOM 2.0. SAX 1.0, SAX 2.0, Namespaces)."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "xerces-c-3.3.0-1.9.aarch64.rpm"
RPM_HASH = "dc9b704de4b5d78c7b676a27b8210e1bbdcdf7627ad2366a961c05898d2feceb6bd93ce4f1521f4ea17325760654537c5823e6f918933f7fc29e33548f936d9d"

RPROVIDES:${PN} += "xerces-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxerces-c-3.3.so"

inherit rpm
