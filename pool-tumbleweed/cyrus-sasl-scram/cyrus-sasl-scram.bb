SUMMARY = "Plugin for the SCRAM SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 5802 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-scram-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "266e1cabce4f844ca35a0e3ce6589fd5e36435d672245992029cab35126ab7080687812915ec18e4f705ce921e823f754b323170705ef986879ed8fd48ee85e7"

RPROVIDES:${PN} += "cyrus-sasl-scram \
libscram.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
