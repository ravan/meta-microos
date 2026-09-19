SUMMARY = "Utilities for Constrained Application Protocol (CoAP)"
DESCRIPTION = "libcoap implements a lightweight application protocol for devices that are \
constrained their resources such as computing power, RF range, memory, \
bandwith, or network packet sizes. \
 \
This package contains command line utilities."
LICENSE = "BSD-2-Clause"

PV = "4.3.5b"

RPM_NAME = "libcoap-utils-4.3.5b-1.4.aarch64.rpm"
RPM_HASH = "86598798ec49d32fbeda8185d9be6c6daab902facd3f1046f09e5b8707e8ce29bc77fde40e09d7f48ce943c5bc462a273d8c88ae24745b405f6008a95cba459e"

RPROVIDES:${PN} += "libcoap-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcoap-3-openssl.so.3"

inherit rpm
