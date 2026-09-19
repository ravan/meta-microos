SUMMARY = "Akonadi Framework: Build Environment"
DESCRIPTION = "This package contains development files of Akonadi, the KDE PIM storage \
service."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d38da2ae51d6bc9a259cf8f05da094f84e1b1ded232bce46b61d545e3e1d7003eb9952738dfeb6079a355b00a82f4c25ae000cc98f6ed6e1b9aff512a196f04c"

RPROVIDES:${PN} += "akonadi-devel \
cmake-KPim6Akonadi \
libKF5AkonadiPrivate-devel"

RDEPENDS:${PN} += "akonadi \
cmake-KF6Config \
cmake-KF6ConfigWidgets \
cmake-KF6CoreAddons \
cmake-KF6ItemModels \
cmake-KF6XmlGui \
cmake-Qt6Core \
cmake-Qt6DBus \
cmake-Qt6Network \
cmake-Qt6Widgets \
cmake-Qt6Xml \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKPim6AkonadiAgentBase6 \
libKPim6AkonadiAgentWidgetBase6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiCore6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6AkonadiWidgets6 \
libKPim6AkonadiXml.so.6 \
libKPim6AkonadiXml6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
xsltproc"

inherit rpm
