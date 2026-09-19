SUMMARY = "NSS module and daemon for using LDAP as a naming service"
DESCRIPTION = "This is nss-pam-ldapd which provides a Name Service Switch (NSS) \
module that allows your LDAP server to provide user account, group, \
host name, alias, netgroup, and basically any other information that \
you would normally get from /etc flat files or NIS. It also provides a \
Pluggable Authentication Module (PAM) to do authentication to an LDAP \
server. \
 \
This is implemented using thin NSS and PAM modules which delegate to a \
dedicated service (nslcd) that queries the LDAP server with persistent \
connections, authentication, attribute translation, etc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.13"

RPM_NAME = "nss-pam-ldapd-0.9.13-2.1.aarch64.rpm"
RPM_HASH = "b513fb04e634c0da8f910c23fdfd3f500b8e1c7137bee70081f06a4ac8ef9a7bfd0f5fde4aacec79c32c87ed164017a961a662dfe0bb82c2005b5c71b849b230"

RPROVIDES:${PN} += "config-nss-pam-ldapd \
libnss-ldap.so.2 \
nss-ldapd \
nss-pam-ldapd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
liblber.so.2 \
libldap.so.2 \
libpam.so.0 \
shadow"

inherit rpm
