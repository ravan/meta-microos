SUMMARY = "Postfix LDAP map support"
DESCRIPTION = "This provides support for LDAP maps in Postfix. If you plan to use LDAP \
maps with Postfix, you need this."
LICENSE = "EPL-2.0 | IPL-1.0"

PV = "3.11.7"

RPM_NAME = "postfix-ldap-3.11.7-1.1.aarch64.rpm"
RPM_HASH = "ce2d46a06a3c8623ad2ac02069d405fc370f56404ab40af062f4c6f393da67d9decd1866914476c3422c1855faf229cfd70d701be5c4db1672295ec4c67c1a22"

RPROVIDES:${PN} += "postfix-/usr/lib/postfix/postfix-ldap.so \
postfix-ldap"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
postfix"

inherit rpm
