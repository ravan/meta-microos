SUMMARY = "Testing tools for Samba servers and clients"
DESCRIPTION = "samba-test provides testing tools for both the server and client \
packages of Samba."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-test-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "2bdf23c8acb9608a4d9eee3032c2a2f4ef6f2e5f446e03be35e5050a6a0c630c5700d526c3a33a64147733f750f005d52b707419e52cea935a20a451ecd822f4"

RPROVIDES:${PN} += "samba-test"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLIBWBCLIENT-OLD-private-samba.so \
libMESSAGING-SEND-private-samba.so \
libMESSAGING-private-samba.so \
libRPC-SERVER-LOOP-private-samba.so \
libaddns-private-samba.so \
libads-private-samba.so \
libasn1util-private-samba.so \
libauth-private-samba.so \
libauthkrb5-private-samba.so \
libc.so.6 \
libcli-cldap-private-samba.so \
libcli-ldap-common-private-samba.so \
libcli-ldap-private-samba.so \
libcli-nbt-private-samba.so \
libcli-smb-common-private-samba.so \
libcliauth-private-samba.so \
libcluster-private-samba.so \
libcmdline-contexts-private-samba.so \
libcmdline-private-samba.so \
libcom-err.so.2 \
libcommon-auth-private-samba.so \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-private-samba.so \
libdcerpc-samba4-private-samba.so \
libdcerpc-server-core.so.0 \
libdcerpc.so.0 \
libdlz-bind9-for-torture-private-samba.so \
libdnsserver-common-private-samba.so \
libdsdb-module-private-samba.so \
libevents-private-samba.so \
libflag-mapping-private-samba.so \
libgenrand-private-samba.so \
libgensec-private-samba.so \
libgnutls.so.30 \
libgse-private-samba.so \
libidmap-private-samba.so \
libk5crypto.so.3 \
libkrb5.so.3 \
libkrb5samba-private-samba.so \
libldb.so.2 \
libldbsamba-private-samba.so \
liblibcli-lsa3-private-samba.so \
liblibcli-netlogon3-private-samba.so \
liblibsmb-private-samba.so \
libmsrpc3-private-samba.so \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr-samba-private-samba.so \
libndr-samba4-private-samba.so \
libndr-standard.so.0 \
libndr.so.6 \
libnetapi.so.1 \
libnetif-private-samba.so \
libnss-info-private-samba.so \
libpopt.so.0 \
libprinter-driver-private-samba.so \
libreadline.so.8 \
libregistry-private-samba.so \
libreplace-private-samba.so \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-modules-private-samba.so \
libsamba-net-join.cpython-313-aarch64-linux-gnu-private-samba.so \
libsamba-net-private-samba.so \
libsamba-passdb.so.0 \
libsamba-security-private-samba.so \
libsamba-security-trusts-private-samba.so \
libsamba-sockets-private-samba.so \
libsamba-util.so.0 \
libsamba3-util-private-samba.so \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libsecrets3-private-samba.so \
libserver-id-db-private-samba.so \
libshares-private-samba.so \
libsmbclient-raw-private-samba.so \
libsmbclient.so.0 \
libsmbconf.so.0 \
libsmbd-shim-private-samba.so \
libsmbpasswdparser-private-samba.so \
libsocket-blocking-private-samba.so \
libsys-rw-private-samba.so \
libtalloc.so.2 \
libtdb-wrap-private-samba.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-private-samba.so \
libtorture-private-samba.so \
libutil-reg-private-samba.so \
libutil-tdb-private-samba.so \
libwbclient.so.0 \
samba \
samba-winbind"

inherit rpm
