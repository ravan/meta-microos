SUMMARY = "Library for messages"
DESCRIPTION = "This package contains source headers for messagelib."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "messagelib-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e91ce5073c6255ea39fdbc1d1326f542b89ad4443f49682f552ac99d9bbd95e88fc2f5c615df88f3c4e11df604b0a3c708851065989fdb1e6b29211bcbbe772f"

RPROVIDES:${PN} += "cmake-KPim6MessageComposer \
cmake-KPim6MessageCore \
cmake-KPim6MessageList \
cmake-KPim6MessageViewer \
cmake-KPim6MimeTreeParser \
cmake-KPim6TemplateParser \
cmake-KPim6WebEngineViewer \
messagelib-devel"

RDEPENDS:${PN} += "cmake-KF6ColorScheme \
cmake-KF6Config \
cmake-KF6Contacts \
cmake-KF6CoreAddons \
cmake-KF6Mime \
cmake-KF6Service \
cmake-KF6TextAutoCorrectionWidgets \
cmake-KPim6Akonadi \
cmake-KPim6AkonadiMime \
cmake-KPim6IdentityManagementWidgets \
cmake-KPim6Libkleo \
cmake-KPim6MessageCore \
cmake-KPim6MimeTreeParser \
cmake-KPim6PimCommon \
cmake-KPim6PimCommonAkonadi \
cmake-KPim6TemplateParser \
cmake-KPim6WebEngineViewer \
cmake-Qt6Gui \
cmake-Qt6WebEngineWidgets \
cmake-Qt6Widgets \
messagelib"

inherit rpm
