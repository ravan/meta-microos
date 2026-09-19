SUMMARY = "Ulfius WebSocket Client"
DESCRIPTION = "A simple command-line websocket client program."
LICENSE = "MIT"

PV = "2.7.15"

RPM_NAME = "uwsc-2.7.15-2.1.aarch64.rpm"
RPM_HASH = "d5b935d4e2980308bc557a61bd97ac3437458c0f6d8e64c7cc4f8f1ba8261ee16e1874a8b8bb4bb89e9594dbce14f3846d0ba45594c8adc7aa23884e56de425b"

RPROVIDES:${PN} += "uwsc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liborcania.so.2.3 \
libulfius.so.2.7 \
libyder.so.1.4"

inherit rpm
