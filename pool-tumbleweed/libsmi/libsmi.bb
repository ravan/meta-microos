SUMMARY = "A Library to Access SMI MIB Information"
DESCRIPTION = "The purpose of libsmi is to \
 \
* Give network management applications a concise programmer-friendly \
   interface to access MIB module information \
 \
* Separate the knowledge on SMI from the main parts of management \
   applications \
 \
* Allow addition of new kinds of MIB repositories without the need to \
adapt applications that make use of libsmi"
LICENSE = "MIT"

PV = "0.4.8"

RPM_NAME = "libsmi-0.4.8-29.6.aarch64.rpm"
RPM_HASH = "d8044597164664f7326c83acb2cc71dcaf78cab95cc74d31058d5ca632aaf86bb2fa1cf8759072e81056ed3ded37297fee6a97be5050797a063fedffde4ce28d"

RPROVIDES:${PN} += "libsmi"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsmi.so.2"

inherit rpm
