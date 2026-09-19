SUMMARY = "WBXML parser and compiler library"
DESCRIPTION = "wbxml2 is a library that includes a WBXML (Wireless Binary XML) \
parser and a WBXML compiler. Unlike wbxml, it uses expat instead of \
libxml2. WBXML contains a library and its associated tools to parse, \
ecode and handle WBXML documents. The WBXML format is a binary \
representation of XML defined by the Wap Forum."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.10"

RPM_NAME = "libwbxml2-1-0.11.10-1.9.aarch64.rpm"
RPM_HASH = "8dbdcdaf5a63490b98836297ae02ab0a249b78c0afd91bbe4aea6312692efc6c3a2407a886ff4cef95be6f755815f2514966626325c88ea0872089f491cf5bbc"

RPROVIDES:${PN} += "libwbxml2-1 \
libwbxml2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
