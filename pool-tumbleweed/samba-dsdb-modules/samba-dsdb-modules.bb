SUMMARY = "Samba LDB modules"
DESCRIPTION = "This package contains plugins which add Active Directory features to the \
LDB library."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-dsdb-modules-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "063cad5d348d79fceb27b0311e08acb4a16dcc46f41e54c32518338a5c0e6b7fa8116ae13b71763a30574e46e2b184f28d178bcbde2ae9238d135acfa7763414"

RPROVIDES:${PN} += "samba-dsdb-modules"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libMESSAGING-private-samba.so \
libauthkrb5-private-samba.so \
libc.so.6 \
libcli-cldap-private-samba.so \
libcli-ldap-common-private-samba.so \
libcom-err.so.2 \
libcommon-auth-private-samba.so \
libdb-glue-private-samba.so \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdsdb-module-private-samba.so \
libevents-private-samba.so \
libflag-mapping-private-samba.so \
libgenrand-private-samba.so \
libgnutls.so.30 \
libgpgme.so.45 \
libkrb5.so.3 \
libkrb5samba-private-samba.so \
libldb.so.2 \
libldb2 \
libldbsamba-private-samba.so \
libndr-samba-private-samba.so \
libndr-samba4-private-samba.so \
libndr.so.6 \
libnetif-private-samba.so \
libreplace-private-samba.so \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-security-private-samba.so \
libsamba-sockets-private-samba.so \
libsamba-util.so.0 \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libsecrets3-private-samba.so \
libsmbpasswdparser-private-samba.so \
libtalloc.so.2 \
libtdb-wrap-private-samba.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libutil-crypt-private-samba.so \
libutil-tdb-private-samba.so \
samba-ldb-ldap"

inherit rpm
