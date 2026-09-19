SUMMARY = "Plugin for the GS2 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-gs2-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "68d6ebfca6443f869cd7fcc41ff5f86d3dcd6336aca5d25e9913113b990bda10b95391f5c0f3b64acc8b21a95b2bd7ac9b228bca95f613c6ff37d7c7c8acd98b"

RPROVIDES:${PN} += "cyrus-sasl-gs2 \
libgs2.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm
