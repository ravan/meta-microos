SUMMARY = "The external identity provider (IdP) backend plugin for sssd"
DESCRIPTION = "A back-end provider that the SSSD can utilize to authenticate against an \
external OpenID Connect identity provider, such as Keycloak. Also provides \
the Kerberos pre-authentication plugin and the oidc_child helper for the \
OAuth 2.0 device authorization grant."
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-idp-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "0e532bf764ef94beebb9aaf9033660601a4386a23708bc62b72a58f98330ca8f2eb3bcff2fc319ae0a48fbe3bd3f9d5d52ba94c7189d9c72fa1f5d27e5b64a2d"

RPROVIDES:${PN} += "config-sssd-idp \
libsss-idp.so \
sssd-idp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libjansson.so.4 \
libjose.so.0 \
libkrad.so.0 \
libkrb5.so.3 \
libpopt.so.0 \
libsss-child.so \
libsss-debug.so \
libsss-idmap.so.0 \
libsss-util.so \
libtalloc.so.2 \
libuuid.so.1 \
sssd-krb5-common"

inherit rpm
