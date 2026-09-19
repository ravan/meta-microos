SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-knotifyconfig-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0df648f9ad69b4665541e1bce5fc25f30e279224c8444579af733cb58761d4005467a6d3d5b23379c712225d9aa5c37aeec94c95ea8dbbb865fbe5e1de4cbe1e"

RPROVIDES:${PN} += "cmake-KF6NotifyConfig \
kf6-knotifyconfig-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
libKF6NotifyConfig6"

inherit rpm
