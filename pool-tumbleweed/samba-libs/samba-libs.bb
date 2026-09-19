SUMMARY = "Samba libraries"
DESCRIPTION = "The samba-libs package contains the libraries needed by programs that \
link against the SMB, RPC and other protocols provided by the Samba suite."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-libs-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "13b5d24e459fbc9d74595c7ac5ebecc7cc54dc67cc5d7bd5ca966490fb189800dbedc46580fed627f147fa9fd31c73c3db262cad7a329184464ed0eab1ec9486"

RPROVIDES:${PN} += "libLIBWBCLIENT-OLD-private-samba.so \
libREG-FULL-private-samba.so \
libRPC-SERVER-LOOP-private-samba.so \
libRPC-WORKER-private-samba.so \
libauth-unix-token-private-samba.so \
libauth4-private-samba.so \
libdcerpc-samr.so.0 \
libdcerpc-samr0 \
libdnsserver-common-private-samba.so \
libdsdb-module-private-samba.so \
libgpext-private-samba.so \
libposix-eadb-private-samba.so \
libprinter-driver-private-samba.so \
libsamba-net-private-samba.so \
libsamba-policy.so.0 \
libshares-private-samba.so \
libsmbpasswdparser-private-samba.so \
libtalloc-report-private-samba.so \
libtorture-private-samba.so \
libxattr-tdb-private-samba.so \
samba-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCHARSET3-private-samba.so \
libMESSAGING-SEND-private-samba.so \
libMESSAGING-private-samba.so \
libauth-private-samba.so \
libauthkrb5-private-samba.so \
libauthn-policy-util-private-samba.so \
libc.so.6 \
libcli-cldap-private-samba.so \
libcli-ldap-common-private-samba.so \
libcli-ldap-private-samba.so \
libcli-spoolss-private-samba.so \
libcliauth-private-samba.so \
libcmdline-private-samba.so \
libcom-err.so.2 \
libcommon-auth-private-samba.so \
libdb-glue-private-samba.so \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-private-samba.so \
libdcerpc-samba4-private-samba.so \
libdcerpc-server-core.so.0 \
libdcerpc.so.0 \
libflag-mapping-private-samba.so \
libgenrand-private-samba.so \
libgnutls.so.30 \
libgpo-private-samba.so \
libgse-private-samba.so \
libkrb5.so.3 \
libkrb5samba-private-samba.so \
libldb.so.2 \
libldbsamba-private-samba.so \
libmsrpc3-private-samba.so \
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
libsamba-sockets-private-samba.so \
libsamba-util.so.0 \
libsamba3-util-private-samba.so \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libsecrets3-private-samba.so \
libsmbclient-raw-private-samba.so \
libsmbconf.so.0 \
libsmbd-base-private-samba.so \
libsmbd-shim-private-samba.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libutil-reg-private-samba.so \
libutil-tdb-private-samba.so \
libwbclient.so.0 \
samba-client-libs"

inherit rpm
