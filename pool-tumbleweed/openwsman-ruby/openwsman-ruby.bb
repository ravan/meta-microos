SUMMARY = "Ruby bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Ruby bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "openwsman-ruby-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "cd31412f691b57876a88b76dadd8ba40a78a6be747161178353f516b44cece0050a8cc3d89eb10982f091a55ec72e33b0607642243895c200da3caa4d853d842"

RPROVIDES:${PN} += "openwsman-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-client.so.5 \
libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
ruby \
ruby-abi"

inherit rpm
