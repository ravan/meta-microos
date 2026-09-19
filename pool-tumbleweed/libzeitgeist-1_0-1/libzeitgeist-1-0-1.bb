SUMMARY = "Client library for interacting with the Zeitgeist daemon"
DESCRIPTION = "Libzeitgeist is a client library for interacting with the Zeitgeist \
daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.18"

RPM_NAME = "libzeitgeist-1_0-1-0.3.18-13.12.aarch64.rpm"
RPM_HASH = "a8457e08e3e25cdf7eafd74e28038132295f2533fae628f828c4a7aa5d05a71a9b225dc23de93906bcf56c014371c79b5642c784f777413475a2034592042da9"

RPROVIDES:${PN} += "libzeitgeist-1-0-1 \
libzeitgeist-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
