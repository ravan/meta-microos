SUMMARY = "Samba dcerpc service binaries"
DESCRIPTION = "This packages contains the binaries for the DCE/RPC endpoint servers."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-dcerpc-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "f910e0e21cc84295b566e8ec5d2320d0da34a8a3a34afa73b31c46f3c5e6d6eb2f39d72361a583b7a1b2a9f73648083ece18877a799189a7d5249024c8b77917"

RPROVIDES:${PN} += "samba-dcerpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libCHARSET3-private-samba.so \
libREG-FULL-private-samba.so \
libRPC-SERVER-LOOP-private-samba.so \
libRPC-WORKER-private-samba.so \
libads-private-samba.so \
libauth-private-samba.so \
libc.so.6 \
libcli-smb-common-private-samba.so \
libcli-spoolss-private-samba.so \
libcliauth-private-samba.so \
libcmdline-private-samba.so \
libcommon-auth-private-samba.so \
libcups.so.2 \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-private-samba.so \
libdcerpc-server-core.so.0 \
libgenrand-private-samba.so \
libgnutls.so.30 \
libgse-private-samba.so \
libldap.so.2 \
liblibcli-lsa3-private-samba.so \
liblibcli-netlogon3-private-samba.so \
liblibsmb-private-samba.so \
libmsrpc3-private-samba.so \
libndr-samba-private-samba.so \
libndr-samba4-private-samba.so \
libndr-standard.so.0 \
libndr.so.6 \
libnetapi.so.1 \
libnpa-tstream-private-samba.so \
libpopt.so.0 \
libprinting-migrate-private-samba.so \
libreplace-private-samba.so \
libsamba-cluster-support-private-samba.so \
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
libsamdb.so.0 \
libsecrets3-private-samba.so \
libsmbconf.so.0 \
libsmbd-base-private-samba.so \
libsmbd-shim-private-samba.so \
libsocket-blocking-private-samba.so \
libsys-rw-private-samba.so \
libtalloc.so.2 \
libtdb-wrap-private-samba.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-private-samba.so \
libutil-reg-private-samba.so \
libutil-tdb-private-samba.so \
libwbclient.so.0"

inherit rpm
