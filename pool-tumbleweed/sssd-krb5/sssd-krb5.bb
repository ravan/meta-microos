SUMMARY = "The Kerberos authentication backend plugin for sssd"
DESCRIPTION = "A back-end provider that the SSSD can utilize to authenticate against \
a Kerberos server."
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-krb5-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "85fb2d84f0674569a7cbc7517dc4cd6c18509e6f78da3757cc66005b49ac684321be6ca10ed9ef0309548c843d83f79e5656961e64c2bcb2a70563f8b0c13694"

RPROVIDES:${PN} += "libsss-krb5.so \
sssd-krb5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-debug.so \
libsss-krb5-common.so \
libsss-util.so \
libtalloc.so.2 \
sssd-krb5-common"

inherit rpm
