SUMMARY = "A Library to Manipulate XML Files"
DESCRIPTION = "The XML C library was initially developed for the GNOME project. It is \
now used by many programs to load and save extensible data structures \
or manipulate any kind of XML files. \
 \
This library implements a number of existing standards related to \
markup languages, including the XML standard, name spaces in XML, XML \
Base, RFC 2396, XPath, XPointer, HTML4, XInclude, SGML catalogs, and \
XML catalogs. In most cases, libxml tries to implement the \
specification in a rather strict way. To some extent, it provides \
support for the following specifications, but does not claim to \
implement them: DOM, FTP client, HTTP client, and SAX. \
 \
The library also supports RelaxNG. Support for W3C XML Schemas is in \
progress."
LICENSE = "MIT"

PV = "2.15.4"

RPM_NAME = "libxml2-16-2.15.4-1.1.aarch64.rpm"
RPM_HASH = "d76aa3c9b239a5b11c8396fd0cf42525fd10a6ff6615ed62e7539f09f34b18e0f15af15e0bd7bcfc1f1c80198306b90b0c8ea10140c45121e26cbe1f90de00b2"

RPROVIDES:${PN} += "libxml2-16 \
libxml2.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
