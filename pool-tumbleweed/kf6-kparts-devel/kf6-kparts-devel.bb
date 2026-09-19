SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons). Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kparts-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "93fae584891da5af505fc733e343314979d3d37d5c4788d10dfe382d8cc29c6c6a1401994c658899810f1cc9afedea4f043ab9b22a7c3e72679e0c4cfd121f72"

RPROVIDES:${PN} += "cmake-KF6Parts \
kf6-kparts-devel"

RDEPENDS:${PN} += "cmake-KF6KIO \
cmake-KF6Service \
cmake-KF6TextWidgets \
cmake-KF6XmlGui \
libKF6Parts6"

inherit rpm
