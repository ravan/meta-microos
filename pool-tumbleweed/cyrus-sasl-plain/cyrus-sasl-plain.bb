SUMMARY = "Plugin for the PLAIN SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-plain-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "52a6c2504814d14b79eefdcb6777e5ccfea5eda0cfb846a56b8515e877fe15bd4169c98411b74113fd82c977efad4f59b6a8b7e11952f393d596c3144e778089"

RPROVIDES:${PN} += "cyrus-sasl-plain \
libplain.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
