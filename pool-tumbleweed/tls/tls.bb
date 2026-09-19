SUMMARY = "Tcl Binding for the OpenSSL Library"
DESCRIPTION = "This Tcl extension provides a generic binding to OpenSSL, utilizing \
the Tcl_StackChannel API for Tcl 8.2 and higher. The sockets behave \
exactly the same as channels created using Tcl's built-in socket \
command with additional options for controlling the SSL session."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "tls-2.0-1.3.aarch64.rpm"
RPM_HASH = "ae9995184c09a54251b53070f834626997495cf77daa649aac0e375271e2ed91c2f661d6fa03760a35a1112a2400768290f532c535df998bc07df727b75431b3"

RPROVIDES:${PN} += "libtls2.0.so \
tls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
