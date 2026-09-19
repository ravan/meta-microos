SUMMARY = "Tools for libwbxml2"
DESCRIPTION = "wbxml2 is a library that includes a WBXML (Wireless Binary XML) \
parser and a WBXML compiler. Unlike wbxml, it uses expat instead of \
libxml2. WBXML contains a library and its associated tools to parse, \
ecode and handle WBXML documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.10"

RPM_NAME = "wbxml2-tools-0.11.10-1.9.aarch64.rpm"
RPM_HASH = "c4a73cb4c88de0ba10128bee6ad7bcaf63b6cf2a5c3a22c1d2e804a491035510fc73f0773bdd3a9dc62eb1e4729d40d586c2cd692a086e2bcd4d83836cf02b95"

RPROVIDES:${PN} += "wbxml2 \
wbxml2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwbxml2-1 \
libwbxml2.so.1"

inherit rpm
