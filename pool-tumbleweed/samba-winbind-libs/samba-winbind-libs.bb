SUMMARY = "Winbind Daemon libraries"
DESCRIPTION = "This package contains the libraries required by the Winbind daemon."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-winbind-libs-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "6464d3c96d7ffd39c54bb614e9111cf86d6da996113c010f8a0572bd7d773e5ca82e532c51d9ace46675a9813cc3f60d7cc78fea09943f20a7ebee71f18a2ccf"

RPROVIDES:${PN} += "libidmap-private-samba.so \
libnss-info-private-samba.so \
libnss-winbind.so.2 \
samba-winbind-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libads-private-samba.so \
libauthkrb5-private-samba.so \
libc.so.6 \
libcli-ldap-common-private-samba.so \
libcom-err.so.2 \
libdbwrap-private-samba.so \
libgenrand-private-samba.so \
libgse-private-samba.so \
libkrb5.so.3 \
libldap.so.2 \
libldb.so.2 \
libpam.so.0 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-modules-private-samba.so \
libsamba-passdb.so.0 \
libsamba-security-private-samba.so \
libsamba-util.so.0 \
libsamba3-util-private-samba.so \
libsecrets3-private-samba.so \
libsmbconf.so.0 \
libsmbldap.so.2 \
libsmbldaphelper-private-samba.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libutil-tdb-private-samba.so \
samba-client-libs"

inherit rpm
