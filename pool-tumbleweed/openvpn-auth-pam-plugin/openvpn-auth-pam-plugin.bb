SUMMARY = "OpenVPN auth-pam plugin"
DESCRIPTION = "The OpenVPN auth-pam plugin implements username/password authentication \
via PAM, and essentially allows any authentication method supported by \
PAM (such as LDAP, RADIUS, or Linux Shadow passwords) to be used with \
OpenVPN. \
 \
While PAM supports username/password authentication, this can be \
combined with X509 certificates to provide two indepedent levels of \
authentication. \
 \
This plugin uses a split privilege execution model which will function \
even if you drop openvpn daemon privileges using the user, group, or \
chroot directives."
LICENSE = "GPL-2.0-only-with-openvpn-openssl-exception"

PV = "2.7.5"

RPM_NAME = "openvpn-auth-pam-plugin-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "983ac220c261d32c0a9c438f8e2cf09c4e8abe5e81be8181d8342cffabcf51b68db3fe35c45d691320d2f0d92aa48b7fca63dce4d98db8a8ce624b845e0f0f72"

RPROVIDES:${PN} += "openvpn-auth-pam-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
openvpn"

inherit rpm
