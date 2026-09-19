SUMMARY = "MailImporter library for kdepim"
DESCRIPTION = "This package provides the mailimporter library, used by KDE PIM applications \
to import data from other mail formats (such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6MailImporter6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e119a25b2b7ec2d0ce0edb0c4c7978660acb4096bb7465ac6e4adbbf22c7be7302517ff6d5949c6ce6f08196b7991138e3005c7c2c5f95a3dde993b06798d797"

RPROVIDES:${PN} += "libKPim6MailImporter.so.6 \
libKPim6MailImporter6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ConfigCore.so.6 \
libKF6I18n.so.6 \
libKPim6PimCommon.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6 \
mailimporter"

inherit rpm
