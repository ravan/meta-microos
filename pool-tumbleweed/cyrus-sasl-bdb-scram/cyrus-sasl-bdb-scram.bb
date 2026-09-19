SUMMARY = "Plugin for the SCRAM SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 5802 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-scram-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "1c0e89affd0107f6652148a91d2a9e1d08d399d0a0bb73699bd3a3a731f3064c30136db143660106dcb86e645902152e9281bac5c02675dc6bfce706edc74b0c"

RPROVIDES:${PN} += "cyrus-sasl-bdb-scram \
libscram.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
