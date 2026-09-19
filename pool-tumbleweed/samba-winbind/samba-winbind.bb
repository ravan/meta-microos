SUMMARY = "Winbind Daemon and Tool"
DESCRIPTION = "This is the winbind-daemon and the wbinfo-tool."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-winbind-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "7e5384d693d252fe12460307560f444834c48a4de982bf2fb852a639ed5d3c158450a1e3445c52f2b2fc10c528bde5f166e6f073dc14faa151a593d3d8c2d97d"

RPROVIDES:${PN} += "config-samba-winbind \
group-winbind \
samba-client-/usr/sbin/winbindd \
samba-winbind"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libMESSAGING-private-samba.so \
libRPC-SERVER-LOOP-private-samba.so \
libads-private-samba.so \
libasn1util-private-samba.so \
libauth-private-samba.so \
libauthkrb5-private-samba.so \
libc.so.6 \
libcli-ldap-common-private-samba.so \
libcli-smb-common-private-samba.so \
libcliauth-private-samba.so \
libcmdline-private-samba.so \
libcom-err.so.2 \
libcommon-auth-private-samba.so \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-private-samba.so \
libdcerpc-samba4-private-samba.so \
libdcerpc-server-core.so.0 \
libflag-mapping-private-samba.so \
libgenrand-private-samba.so \
libgensec-private-samba.so \
libgnutls.so.30 \
libgse-private-samba.so \
libidmap-private-samba.so \
libkrb5.so.3 \
libkrb5samba-private-samba.so \
liblibcli-lsa3-private-samba.so \
liblibcli-netlogon3-private-samba.so \
liblibsmb-private-samba.so \
libmsrpc3-private-samba.so \
libndr-samba-private-samba.so \
libndr-samba4-private-samba.so \
libndr-standard.so.0 \
libndr.so.6 \
libnss-info-private-samba.so \
libpopt.so.0 \
libreplace-private-samba.so \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-passdb.so.0 \
libsamba-security-private-samba.so \
libsamba-security-trusts-private-samba.so \
libsamba-sockets-private-samba.so \
libsamba-util.so.0 \
libsamba3-util-private-samba.so \
libsamdb-common-private-samba.so \
libsecrets3-private-samba.so \
libsmbconf.so.0 \
libsmbd-shim-private-samba.so \
libsocket-blocking-private-samba.so \
libsys-rw-private-samba.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libutil-tdb-private-samba.so \
libwbclient.so.0 \
pam-config \
samba-client \
samba-dcerpc \
samba-winbind-libs \
sysuser-shadow"

inherit rpm
