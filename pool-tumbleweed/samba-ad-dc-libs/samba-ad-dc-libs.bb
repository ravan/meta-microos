SUMMARY = "Samba Active Directory Domain Controller libraries"
DESCRIPTION = "This package contains the Active Directory-compatible Domain Controller \
libraries."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-ad-dc-libs-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "574eb98841b7f7b5e6a22e42ea7945d47079b52c351568a59fb66187b4eeecf429f795f6b96a8d34d1cfef4a2bf56d7ea2bf388923c923ccf7919a30ec2e5a2c"

RPROVIDES:${PN} += "libad-claims-private-samba.so \
libdb-glue-private-samba.so \
libdcerpc-server.so.0 \
libdlz-bind9-for-torture-private-samba.so \
libdsdb-garbage-collect-tombstones-private-samba.so \
libpac-private-samba.so \
libprocess-model-private-samba.so \
libscavenge-dns-records-private-samba.so \
libservice-private-samba.so \
samba-ad-dc-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLIBWBCLIENT-OLD-private-samba.so \
libMESSAGING-SEND-private-samba.so \
libMESSAGING-private-samba.so \
libasn1util-private-samba.so \
libauth4-private-samba.so \
libauthkrb5-private-samba.so \
libauthn-policy-util-private-samba.so \
libc.so.6 \
libcli-cldap-private-samba.so \
libcli-ldap-common-private-samba.so \
libcli-ldap-private-samba.so \
libcli-nbt-private-samba.so \
libcliauth-private-samba.so \
libclidns-private-samba.so \
libcluster-private-samba.so \
libcom-err.so.2 \
libcommon-auth-private-samba.so \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-private-samba.so \
libdcerpc-samba4-private-samba.so \
libdcerpc-server-core.so.0 \
libdcerpc.so.0 \
libdnsserver-common-private-samba.so \
libdsdb-module-private-samba.so \
libevents-private-samba.so \
libflag-mapping-private-samba.so \
libgenrand-private-samba.so \
libgensec-private-samba.so \
libgnutls.so.30 \
libgse-private-samba.so \
libk5crypto.so.3 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrb5.so.3 \
libkrb5samba-private-samba.so \
libldb.so.2 \
libldbsamba-private-samba.so \
libmessages-dgm-private-samba.so \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr-samba-private-samba.so \
libndr-samba4-private-samba.so \
libndr-standard.so.0 \
libndr.so.6 \
libnetif-private-samba.so \
libnpa-tstream-private-samba.so \
libpopt.so.0 \
libreplace-private-samba.so \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-modules-private-samba.so \
libsamba-passdb.so.0 \
libsamba-security-private-samba.so \
libsamba-security-trusts-private-samba.so \
libsamba-sockets-private-samba.so \
libsamba-util.so.0 \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libsecrets3-private-samba.so \
libserver-id-db-private-samba.so \
libsmbconf.so.0 \
libsocket-blocking-private-samba.so \
libtalloc.so.2 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-private-samba.so \
samba-client-libs \
samba-libs"

inherit rpm
