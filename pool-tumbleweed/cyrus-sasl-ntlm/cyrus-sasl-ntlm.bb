SUMMARY = "Plugin for the NTLM SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-ntlm-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "a00cbf43984d5d387b614af5162483ce2f7f0f9c7a57f55146cfd1a45b65e77240578c8e8e29bd4d2a2634acced8ec662afac906df616575e8626519ec55f31c"

RPROVIDES:${PN} += "cyrus-sasl-ntlm \
libntlm.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
