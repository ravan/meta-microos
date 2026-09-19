SUMMARY = "SASL authentication in lighttpd"
DESCRIPTION = "A module to provide SASL authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_authn_sasl-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "3fa7a2462acf0680750e68a353589132499238b93bcebc679d789c50f91eb3b767fc030718a6abf36e5713c9484c0f44b1c33369bcce6509e44c5dfab746942d"

RPROVIDES:${PN} += "lighttpd-mod-authn-sasl"

RDEPENDS:${PN} += "libc.so.6 \
libsasl2.so.3 \
lighttpd"

inherit rpm
