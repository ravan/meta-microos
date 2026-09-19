SUMMARY = "Samba client libraries"
DESCRIPTION = "The samba-libs package contains the libraries needed by samba client \
programs."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-client-libs-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "cdf7966f1bebde7f2df36fc2eb8c2fd30f3d03beb5678b3bb85412b7dac34a8060c0ee933d81dd6d2e394fd0f799f50f752a5a73aceb79c44bcbb2fd19f280a0"

RPROVIDES:${PN} += "libCHARSET3-private-samba.so \
libMESSAGING-SEND-private-samba.so \
libMESSAGING-private-samba.so \
libaddns-private-samba.so \
libads-private-samba.so \
libasn1util-private-samba.so \
libauth-private-samba.so \
libauthkrb5-private-samba.so \
libauthn-policy-util-private-samba.so \
libcli-cldap-private-samba.so \
libcli-ldap-common-private-samba.so \
libcli-ldap-private-samba.so \
libcli-nbt-private-samba.so \
libcli-smb-common-private-samba.so \
libcli-spoolss-private-samba.so \
libcliauth-private-samba.so \
libclidns-private-samba.so \
libcluster-private-samba.so \
libcmdline-contexts-private-samba.so \
libcmdline-private-samba.so \
libcommon-auth-private-samba.so \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdcerpc-binding0 \
libdcerpc-pkt-auth-private-samba.so \
libdcerpc-samba-private-samba.so \
libdcerpc-samba4-private-samba.so \
libdcerpc-server-core.so.0 \
libdcerpc.so.0 \
libdcerpc0 \
libdfs-server-ad-private-samba.so \
libevents-private-samba.so \
libflag-mapping-private-samba.so \
libgenrand-private-samba.so \
libgensec-private-samba.so \
libgpo-private-samba.so \
libgse-private-samba.so \
libhttp-private-samba.so \
libinterfaces-private-samba.so \
libiov-buf-private-samba.so \
libkrb5samba-private-samba.so \
libldbsamba-private-samba.so \
liblibcli-lsa3-private-samba.so \
liblibcli-netlogon3-private-samba.so \
liblibsmb-private-samba.so \
libmessages-dgm-private-samba.so \
libmessages-util-private-samba.so \
libmscat-private-samba.so \
libmsghdr-private-samba.so \
libmsrpc3-private-samba.so \
libndr-krb5pac.so.0 \
libndr-krb5pac0 \
libndr-nbt.so.0 \
libndr-nbt0 \
libndr-samba-private-samba.so \
libndr-samba4-private-samba.so \
libndr-standard.so.0 \
libndr-standard0 \
libndr.so.6 \
libndr2 \
libnet-keytab-private-samba.so \
libnetapi.so.1 \
libnetapi0 \
libnetif-private-samba.so \
libnpa-tstream-private-samba.so \
libprinting-migrate-private-samba.so \
libquic-private-samba.so \
libregistry-private-samba.so \
libreplace-private-samba.so \
libsamba-cluster-support-private-samba.so \
libsamba-credentials.so.1 \
libsamba-credentials1 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-errors0 \
libsamba-hostconfig.so.0 \
libsamba-hostconfig0 \
libsamba-modules-private-samba.so \
libsamba-passdb.so.0 \
libsamba-passdb0 \
libsamba-security-private-samba.so \
libsamba-security-trusts-private-samba.so \
libsamba-sockets-private-samba.so \
libsamba-util.so.0 \
libsamba-util0 \
libsamba3-util-private-samba.so \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libsamdb0 \
libsecrets3-private-samba.so \
libserver-id-db-private-samba.so \
libserver-role-private-samba.so \
libsmbclient-raw-private-samba.so \
libsmbclient.so.0 \
libsmbclient0 \
libsmbconf.so.0 \
libsmbconf0 \
libsmbd-base-private-samba.so \
libsmbd-shim-private-samba.so \
libsmbldap.so.2 \
libsmbldap2 \
libsmbldaphelper-private-samba.so \
libsocket-blocking-private-samba.so \
libstable-sort-private-samba.so \
libsys-rw-private-samba.so \
libtalloc-report-printf-private-samba.so \
libtdb-wrap-private-samba.so \
libtevent-util.so.0 \
libtevent-util0 \
libtime-basic-private-samba.so \
libutil-crypt-private-samba.so \
libutil-reg-private-samba.so \
libutil-setid-private-samba.so \
libutil-tdb-private-samba.so \
libwbclient.so.0 \
libwbclient0 \
samba-client-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libjansson.so.4 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libldb.so.2 \
libngtcp2-crypto-gnutls.so.8 \
libngtcp2.so.16 \
libpam.so.0 \
libpopt.so.0 \
libservice-private-samba.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtasn1.so.6 \
libtdb.so.1 \
libtevent.so.0 \
libz.so.1"

inherit rpm
