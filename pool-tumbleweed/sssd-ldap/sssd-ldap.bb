SUMMARY = "The LDAP backend plugin for sssd"
DESCRIPTION = "A back-end provider that the SSSD can utilize to fetch identity data \
from, and authenticate with, an LDAP server."
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-ldap-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "4e24072b3ea8f4a4765481723ccea13a9520252e8658b461b9620f521bc7afa3b465c54cb7ec68bde52edb1fa8fe7666d87a043ee89022ba418cd51048a5c17b"

RPROVIDES:${PN} += "libsss-ldap-common.so \
libsss-ldap.so \
sssd-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libldb.so.2 \
libsss-certmap.so.0 \
libsss-child.so \
libsss-crypt.so \
libsss-debug.so \
libsss-idmap.so.0 \
libsss-krb5-common.so \
libsss-util.so \
libtalloc.so.2 \
libtevent.so.0 \
sssd-krb5-common"

inherit rpm
