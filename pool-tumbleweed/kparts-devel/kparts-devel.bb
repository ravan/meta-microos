SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons). Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kparts-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "358dcacdb0c1d2484d10f49bae11260420770394cf6a37cdc03a0e3d9c90a643ef1272c622540b8baa7e194e1fa2d8fec6a78bdbf217f317aa48786240c8ce35"

RPROVIDES:${PN} += "cmake-KF5Parts \
kparts-devel"

RDEPENDS:${PN} += "cmake-KF5KIO \
cmake-KF5TextWidgets \
cmake-KF5XmlGui \
libKF5Parts5"

inherit rpm
