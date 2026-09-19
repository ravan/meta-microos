SUMMARY = "GSSAPI NTLMSSP Mechanism"
DESCRIPTION = "A GSSAPI Mechanism that implements NTLMSSP."
LICENSE = "ISC"

PV = "1.3.1"

RPM_NAME = "gssntlmssp-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "61a4557d52665ba7dfcbdaf0506e61ef23777167a7a7bc25ef97977c7a96a060334585485f703d150044ccac4447f05e7a7891b0c55a168d5f3dd0b449f02aeb"

RPROVIDES:${PN} += "config-gssntlmssp \
gssntlmssp"

RDEPENDS:${PN} += "krb5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libunistring.so.5 \
libwbclient.so.0 \
libz.so.1"

inherit rpm
