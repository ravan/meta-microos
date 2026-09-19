SUMMARY = "Basic XML parser in C++"
DESCRIPTION = "TinyXML is a feature-bounded XML parser in C++ that can be integrated \
into other programs. \
 \
TinyXML-2 does not parse or use DTDs (Document Type Definitions) or \
XSLs (eXtensible Stylesheet Language). There are other parsers (with \
different footprints) to do such."
LICENSE = "Zlib"

PV = "11.0.0"

RPM_NAME = "libtinyxml2-11-11.0.0-1.5.aarch64.rpm"
RPM_HASH = "4ae7b3ced56201cfd42fcf23f7311597963d926fcd35b6f3081e087c5129dc5881e64313270904180394d5af22c69c6167cf72818ed12034aa2e4d80ea96ebd1"

RPROVIDES:${PN} += "libtinyxml2-11 \
libtinyxml2.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
