SUMMARY = "Development package for mailcommon"
DESCRIPTION = "This package contains the development headers for the mailcommon library."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "mailcommon-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "08cfbfdf3c57779c231cbaf972ba555236b70f36ff821f91550a4d2d1908fc526472d55f7cc0c3d4df6eb5156b7e2c6cde5bea2c402ec0e62a53273d7d977f65"

RPROVIDES:${PN} += "cmake-KPim6MailCommon \
mailcommon-devel"

RDEPENDS:${PN} += "cmake-KF6Completion \
cmake-KPim6Akonadi \
cmake-KPim6AkonadiMime \
cmake-KPim6Libkdepim \
cmake-KPim6MessageComposer \
cmake-KPim6MessageViewer \
cmake-KPim6PimCommon \
cmake-KPim6PimCommonAkonadi \
cmake-Qt6Widgets \
ld-linux-aarch64.so.1 \
libKPim6MailCommon.so.6 \
libKPim6MailCommon6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
