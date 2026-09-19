SUMMARY = "Theora video decompression library"
DESCRIPTION = "Theora is a free and open video compression format. It is designed to scale \
well from postage stamp to HD resolution, and is considered particularly \
competitive at low bitrates. \
 \
This subpackage contains the decoder library."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "libtheoradec2-1.2.0-2.6.aarch64.rpm"
RPM_HASH = "a1484c85d21045c0d373c995dbc96c2a90e3b711eb8dc35afdda56b02ac3d2e6d73d3a5e7b45a9078d141dfa5e91628c6a54ddb1b9fa97429aba7ca1daab9e87"

RPROVIDES:${PN} += "libtheoradec.so.2 \
libtheoradec2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
