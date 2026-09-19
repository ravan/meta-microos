SUMMARY = "A CSS parser and selection engine"
DESCRIPTION = "LibCSS is a CSS (Cascading Style Sheet) parser and selection engine, \
written in C. It was developed as part of the NetSurf project. \
 \
Features: \
* Parses CSS, good and bad \
* Simple C API \
* Low memory usage \
* Fast selection engine \
* Portable"
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "libcss0-0.9.2-2.1.aarch64.rpm"
RPM_HASH = "f49039cf7b980b04b8c9917991e99f6ece000cd76bb54982d989c64a05d92b0b3a5ff7969529782b90cf510beb34668b98dcb6ce549d7797868db83611c7f392"

RPROVIDES:${PN} += "libcss.so.0 \
libcss0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libparserutils.so.0 \
libwapcaplet.so.0"

inherit rpm
