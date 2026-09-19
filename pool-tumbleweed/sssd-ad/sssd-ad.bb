SUMMARY = "The ActiveDirectory backend plugin for sssd"
DESCRIPTION = "A back-end provider that the SSSD can utilize to fetch identity data \
from, and authenticate with, an Active Directory server."
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-ad-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "819637625765dd097091bc483958bb7ce25349f93036ec341933c75c587a41a5c284249ab99cf8b4e9f84c2e683d5b6698dfd836eda616b6bcffd43cd202d48a"

RPROVIDES:${PN} += "libsss-ad.so \
sssd-ad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libini-config.so.8 \
libldap.so.2 \
libldb.so.2 \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr.so.6 \
libpopt.so.0 \
libsasl2.so.3 \
libselinux.so.1 \
libsmbclient.so.0 \
libsss-child.so \
libsss-debug.so \
libsss-idmap.so.0 \
libsss-iface.so \
libsss-krb5-common.so \
libsss-ldap-common.so \
libsss-sbus.so \
libsss-util.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtdb.so.1 \
libtevent.so.0 \
sssd-krb5-common"

inherit rpm
