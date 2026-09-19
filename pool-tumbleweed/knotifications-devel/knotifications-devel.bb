SUMMARY = "KDE Desktop notifications: Build Environment"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "knotifications-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "85aeeeb9aeeba373ffab92e9f4376e36fee40595861045c8c3f9617e173353cd39128143d4e698ee4e085ad5ec2867f9f3288619e6d0c093f0fa8b92951eda99"

RPROVIDES:${PN} += "cmake-KF5Notifications \
knotifications-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5TextToSpeech \
cmake-Qt5Widgets \
libKF5Notifications5"

inherit rpm
