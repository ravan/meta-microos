SUMMARY = "SSSD helpers needed for Kerberos and GSSAPI authentication"
DESCRIPTION = "Provides helper processes that the LDAP and Kerberos back ends can \
use for Kerberos user or host authentication."
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-krb5-common-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "16fbfe2fe622bacd41229354ce64219407aab89fac205496b4537698297bcdb21b46eb697d8ac5ed0d883084a9b1e77b3ad13abe978002b4f2d91db1ea7b3f59"

RPROVIDES:${PN} += "config-sssd-krb5-common \
libsss-krb5-common.so \
sssd-krb5-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cyrus-sasl-gssapi \
group-sssd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libdhash.so.1 \
libjansson.so.4 \
libkeyutils.so.1 \
libkrb5.so.3 \
libldb.so.2 \
libpopt.so.0 \
libsss-child.so \
libsss-debug.so \
libsss-util.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtevent.so.0 \
permissions \
sssd \
user-sssd"

inherit rpm
