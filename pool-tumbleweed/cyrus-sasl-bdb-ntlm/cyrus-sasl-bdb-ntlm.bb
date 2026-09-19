SUMMARY = "Plugin for the NTLM SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-ntlm-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "e6393719701b20d6617f43660fd916f485de6015765c2a638ce25d07758e01cf1e052c8786ec43997adefdbff9b1e4910d2feb0e8c80ca99dbfcf40e3d61964b"

RPROVIDES:${PN} += "cyrus-sasl-bdb-ntlm \
libntlm.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
