SUMMARY = "GSSAPI authentication in lighttpd"
DESCRIPTION = "A module to provide GSSAPI authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_authn_gssapi-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "3a4955d41e9a62df047f0cd26b2419bfe91fa2a3600149a0ff5cc911d2e8110f3c75262237d0359d9b9437cb7c38be63f84ddf77584dd1c1558137efc02ebf62"

RPROVIDES:${PN} += "lighttpd-mod-authn-gssapi"

RDEPENDS:${PN} += "libc.so.6 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
lighttpd"

inherit rpm
