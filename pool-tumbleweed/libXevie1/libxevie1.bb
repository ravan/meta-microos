SUMMARY = "X Event Interception Extension library"
DESCRIPTION = "libXevie provides an X Window System client interface to the EvIE \
extension to the X protocol. The EvIE (Event Interception Extension) \
allows for clients to be able to intercept all events coming through \
the server and then decide what to do with them, including being able \
to modify or discard events."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libXevie1-1.0.3-13.11.aarch64.rpm"
RPM_HASH = "5bca563bb1dfa96d49116bc7c0f56b683ccf898c78e2c9ff008fd60027fae9631f1622dd17160bfd6c7575016e81dbeb2964c2899d99d29e975dd8df58aedbe7"

RPROVIDES:${PN} += "libXevie.so.1 \
libXevie1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
