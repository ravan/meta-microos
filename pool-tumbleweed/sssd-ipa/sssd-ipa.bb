SUMMARY = "FreeIPA backend plugin for sssd"
DESCRIPTION = "A back-end provider that the SSSD can utilize to fetch identity data \
from, and authenticate with, an IPA server."
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-ipa-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "38780eeffd43f38447ae1e0ee4436e542bebea1a7b1beebb4c7777c7c116261ba16a5e3fecf9629caaafa6c75d3e7636403c11450035bffad8c2b4572375015d"

RPROVIDES:${PN} += "libsss-ipa.so \
sssd-ipa \
sssd-ipa-provider"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libipa-hbac.so.0 \
liblber.so.2 \
libldap.so.2 \
libldb.so.2 \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr.so.6 \
libsss-child.so \
libsss-crypt.so \
libsss-debug.so \
libsss-idmap.so.0 \
libsss-krb5-common.so \
libsss-ldap-common.so \
libsss-util.so \
libtalloc.so.2 \
libtevent.so.0 \
sssd \
sssd-ad \
sssd-krb5-common"

inherit rpm
