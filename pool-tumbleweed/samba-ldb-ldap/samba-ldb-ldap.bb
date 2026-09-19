SUMMARY = "Samba Ldb Ldap Modules"
DESCRIPTION = "samba-ldb-ldap contains the ldb ldap module required by samba-tool and \
samba-gpupdate."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-ldb-ldap-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "c8b44518ee8acf5d85988ebec0557a6c15d84366fed21a3a6f8f0a8801519aa1c9abe41c1e8c9a2ddcde9dd583f908420c0eb842e465e507c32c113961efc8f8"

RPROVIDES:${PN} += "samba-ldb-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMESSAGING-SEND-private-samba.so \
libMESSAGING-private-samba.so \
libc.so.6 \
libcli-ldap-common-private-samba.so \
libcli-ldap-private-samba.so \
libcmdline-private-samba.so \
libdcerpc-binding.so.0 \
libdsdb-module-private-samba.so \
libgensec-private-samba.so \
liblber.so.2 \
libldap.so.2 \
libldb.so.2 \
libldbsamba-private-samba.so \
libndr-samba4-private-samba.so \
libndr.so.6 \
libreplace-private-samba.so \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-hostconfig.so.0 \
libsamba-util.so.0 \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libsmbconf.so.0 \
libtalloc.so.2 \
libtevent-util.so.0 \
libtevent.so.0"

inherit rpm
