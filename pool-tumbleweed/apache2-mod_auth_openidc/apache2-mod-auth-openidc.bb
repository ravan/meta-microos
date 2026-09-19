SUMMARY = "Apache2.x module for an OpenID Connect enabled Identity Provider"
DESCRIPTION = "This module enables an Apache 2.x web server to operate as an OpenID Connect Relying Party and/or OAuth 2.0 Resource Server."
LICENSE = "Apache-2.0"

PV = "2.4.20.2"

RPM_NAME = "apache2-mod_auth_openidc-2.4.20.2-1.1.aarch64.rpm"
RPM_HASH = "3cf0a2cbcb1c5957baaebb60a4b76338dbd7af83bc40fb5aa9bb8e34f14d61170d2b43d717fc237a8a231e2a755dff06523c542025c6dbc545f2a6ab2704f51d"

RPROVIDES:${PN} += "apache2-mod-auth-openidc"

RDEPENDS:${PN} += "apache-mmn-20120211 \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libcjose.so.0 \
libcrypto.so.3 \
libcurl.so.4 \
libhiredis.so.1.3.0 \
libjansson.so.4 \
libpcre2-8.so.0 \
libz.so.1 \
suse-maintenance-mmn-0"

inherit rpm
