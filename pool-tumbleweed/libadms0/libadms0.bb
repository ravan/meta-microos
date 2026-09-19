SUMMARY = "An automatic device model synthesizer"
DESCRIPTION = "ADMS is a code generator that converts electrical compact device models \
specified in high-level description language into ready-to-compile C code \
for the API of SPICE simulators. Based on transformations specified in XML \
language, ADMS transforms Verilog-AMS code into other target languages. \
 \
This package contains the libadms shared libraries."
LICENSE = "GPL-3.0-only"

PV = "2.3.7"

RPM_NAME = "libadms0-2.3.7-3.5.aarch64.rpm"
RPM_HASH = "bcbea7b37e69d7f627d721beb7abcb2ba691a6b5a25f403b349a220632565f3cbf7feee1c29eb29290a4bba1bf063748ab62968b504a60d2e44003ebfc6770aa"

RPROVIDES:${PN} += "libadms0 \
libadmsAdmstpath.so.0 \
libadmsElement.so.0 \
libadmsPreprocessor.so.0 \
libadmsVeriloga.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
