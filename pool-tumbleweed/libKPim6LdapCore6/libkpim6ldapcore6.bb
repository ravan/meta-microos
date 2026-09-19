SUMMARY = "KDE PIM Libraries: LDAP support"
DESCRIPTION = "This package provides LDAP support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6LdapCore6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c3aef32f76ec4d137cffaba454438a94e9707e854658e1505d4ea7568c562d57423da8071aa1af02fd6cf99e7a5d76aa84bc8b15dea518b7aa3017044a2c0c7f"

RPROVIDES:${PN} += "libKPim6LdapCore.so.6 \
libKPim6LdapCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kldap \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libqt6keychain.so.1 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
