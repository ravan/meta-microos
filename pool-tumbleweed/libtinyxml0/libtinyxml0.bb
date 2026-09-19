SUMMARY = "A simple, small, C++ XML parser"
DESCRIPTION = "TinyXML is a simple, small, C++ XML parser that can be easily integrating \
into other programs. Have you ever found yourself writing a text file parser \
every time you needed to save human readable data or serialize objects? \
TinyXML solves the text I/O file once and for all. \
(Or, as a friend said, ends the Just Another Text File Parser problem.)"
LICENSE = "Zlib"

PV = "2.6.2"

RPM_NAME = "libtinyxml0-2.6.2-14.5.aarch64.rpm"
RPM_HASH = "6519e9bb547cbb335a193a87667c1878cbeb7458b9382e2d905c3213e4dad3e144f849b57388ea7b08c8e876604826c97de787b2f9bb9bd60e050c14237e1908"

RPROVIDES:${PN} += "libtinyxml.so.0 \
libtinyxml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
