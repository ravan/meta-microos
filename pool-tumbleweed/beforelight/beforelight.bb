SUMMARY = "Sample implementation of a screen saver for X servers"
DESCRIPTION = "The beforelight program is a sample implementation of a screen saver \
for X servers supporting the MIT-SCREEN-SAVER extension. It is only \
recommended for use as a code sample, as it does not include features \
such as screen locking or configurability, and relies on the legacy Xaw \
toolkit."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "beforelight-1.0.6-1.13.aarch64.rpm"
RPM_HASH = "6a6fd2dbf23a1d3e2222240151844e621a65d4c101f67a507c78632b81b6a4c308d1ead5f8beedaa2ff31afaa4bab02a76570b11e3b2a448dc71c2318097c6b3"

RPROVIDES:${PN} += "beforelight"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXss.so.1 \
libXt.so.6 \
libc.so.6"

inherit rpm
