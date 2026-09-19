SUMMARY = "Samba Python3 libraries"
DESCRIPTION = "The samba-python3 package contains the Python libraries needed by programs \
that use SMB, RPC and other Samba provided protocols in Python3 programs."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-python3-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "f20f06551d147ef393f709d323141c2cb7477db9a6442ad7ebe387aab9e129b3ca92dc01cc456ead5206758efedc2cd30fa2c98469ed271804fa2a45ef7579b4"

RPROVIDES:${PN} += "samba-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMESSAGING-SEND-private-samba.so \
libMESSAGING-private-samba.so \
libaddns-private-samba.so \
libads-private-samba.so \
libauth-unix-token-private-samba.so \
libauth4-private-samba.so \
libauthkrb5-private-samba.so \
libc.so.6 \
libcli-nbt-private-samba.so \
libcli-smb-common-private-samba.so \
libcliauth-private-samba.so \
libcluster-private-samba.so \
libcmdline-contexts-private-samba.so \
libcmdline-private-samba.so \
libcommon-auth-private-samba.so \
libdb-glue-private-samba.so \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-private-samba.so \
libdcerpc-samba4-private-samba.so \
libdcerpc.so.0 \
libdnsserver-common-private-samba.so \
libdsdb-garbage-collect-tombstones-private-samba.so \
libevents-private-samba.so \
libflag-mapping-private-samba.so \
libgenrand-private-samba.so \
libgensec-private-samba.so \
libgnutls.so.30 \
libgpo-private-samba.so \
libgse-private-samba.so \
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
libnetif-private-samba.so \
libposix-eadb-private-samba.so \
libpyldb-util.cpython-313-aarch64-linux-gnu-private-samba.so \
libpytalloc-util.cpython-313-aarch64-linux-gnu.so.2 \
libpython3.13.so.1.0 \
libregistry-private-samba.so \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-net-join.cpython-313-aarch64-linux-gnu-private-samba.so \
libsamba-net-private-samba.so \
libsamba-passdb.so.0 \
libsamba-policy.so.0 \
libsamba-python.cpython-313-aarch64-linux-gnu-private-samba.so \
libsamba-security-private-samba.so \
libsamba-util.so.0 \
libsamba3-util-private-samba.so \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libscavenge-dns-records-private-samba.so \
libsecrets3-private-samba.so \
libserver-role-private-samba.so \
libsmbconf.so.0 \
libsmbd-base-private-samba.so \
libstable-sort-private-samba.so \
libtalloc.so.2 \
libtdb-wrap-private-samba.so \
libtevent-util.so.0 \
libtevent.so.0 \
libutil-crypt-private-samba.so \
libutil-reg-private-samba.so \
libxattr-tdb-private-samba.so \
python-abi \
python3-ldb \
python3-talloc \
python3-tdb \
python3-tevent \
samba"

inherit rpm
