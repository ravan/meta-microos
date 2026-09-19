SUMMARY = "Library to assist working with LDAP directories"
DESCRIPTION = "This package contains additional libraries for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kldap-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "472f7bed9679ca10beb1353c904dc702741af81fe49cf61fbcb080bd65f493c419b11f71014b1ab34fac3999bc0a59722779f800c38e3fdb423c8fc9eb95ade2"

RPROVIDES:${PN} += "kldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKPim6LdapCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
