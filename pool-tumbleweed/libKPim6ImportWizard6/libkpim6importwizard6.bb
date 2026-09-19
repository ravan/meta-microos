SUMMARY = "Assistant to import PIM data"
DESCRIPTION = "This package contains the shared libraries used to provide the mail import \
wizard functionality to KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6ImportWizard6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8f7eaba01b332e9c5126664a2552e3f9ef1dbb69b1321bee4add2d679ae633c49aa3cad854620fc2c8205c101de5ffc305cf01ef9f287de190c21d841fbd3abb"

RPROVIDES:${PN} += "libKPim6ImportWizard.so.6 \
libKPim6ImportWizard6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6MailCommon.so.6 \
libKPim6MailTransport.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libQt6Core.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
