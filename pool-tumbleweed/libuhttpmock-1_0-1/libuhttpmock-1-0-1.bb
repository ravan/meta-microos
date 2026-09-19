SUMMARY = "HTTP web service mocking library"
DESCRIPTION = "uhttpmock is a project for mocking web service APIs which use HTTP or HTTPS. \
It provides a library, libuhttpmock, which implements recording and \
playback of HTTP request/response traces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.0"

RPM_NAME = "libuhttpmock-1_0-1-0.11.0-2.4.aarch64.rpm"
RPM_HASH = "cc9d166cb07811cb59b3dbea5e970b5763826150f8791fa55fc91f343cc8de6c0780d1f05d75dd6c3e0c3832628025cb6fd5e904b56831fdd8b3c615729b15c7"

RPROVIDES:${PN} += "libuhttpmock-1-0-1 \
libuhttpmock-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
