SUMMARY = "JSON-C shared library"
DESCRIPTION = "JSON-C implements a reference counting object model that allows you to \
easily construct JSON objects in C, output them as JSON formatted \
strings and parse JSON formatted strings back into the C \
representation of JSON objects. \
 \
This package includes the JSON library."
LICENSE = "MIT"

PV = "0.19"

RPM_NAME = "libjson-c5-0.19-1.2.aarch64.rpm"
RPM_HASH = "882b0dbe740966ef693db796da05f14556f4084bf0793d002e34cf4099bf6b5bb19fdef6959d6608ee2fad929f5da2f8fe0d3ddbce63f3407297b66399b28bbb"

RPROVIDES:${PN} += "libjson-c.so.5 \
libjson-c5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
