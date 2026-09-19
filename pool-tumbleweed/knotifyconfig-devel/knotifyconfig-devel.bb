SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "knotifyconfig-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "01bf965e587f4da16362734e91b144be064e216b15c5324133ffe96d33fa179d89fe2a75dea42258a325567034fc9050ba42df2933729ca046f643878f70222a"

RPROVIDES:${PN} += "cmake-KF5NotifyConfig \
knotifyconfig-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
libKF5NotifyConfig5"

inherit rpm
