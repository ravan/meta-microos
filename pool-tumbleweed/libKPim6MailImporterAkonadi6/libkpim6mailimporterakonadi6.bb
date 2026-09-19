SUMMARY = "MailImporter Akonadi based library for kdepim"
DESCRIPTION = "This package provides the mailimporter library for Akonadi based functions, \
used by KDE PIM applications to import data from other mail formats \
(such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6MailImporterAkonadi6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "cc56d68d943f5b07e5e7abe931be51312e3dad5709f7379eeaab5421174643c9c0e5368ae1b9d3c9a77526a4390d2150beff5244a37e7ccb71ddafc2dfa6b938"

RPROVIDES:${PN} += "libKPim6MailImporterAkonadi.so.6 \
libKPim6MailImporterAkonadi6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Mime.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6MailImporter.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
mailimporter"

inherit rpm
