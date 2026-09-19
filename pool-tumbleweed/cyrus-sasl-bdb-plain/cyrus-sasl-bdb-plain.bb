SUMMARY = "Plugin for the PLAIN SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-plain-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "4fd9efccc132d361b3b0b29c7699cf6dbe62e7229c24c085b2968e98bc6039092489eaa8351a0a0c127e5ef796593318691ab2e646c3e20ca1ab21f0135e4ede"

RPROVIDES:${PN} += "cyrus-sasl-bdb-plain \
libplain.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
