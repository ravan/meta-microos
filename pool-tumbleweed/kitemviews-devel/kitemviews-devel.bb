SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "kitemviews-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "c6b441d276d41cec063fc8d7499887b9d68561d8b4a2c78b4a6b883b345e5253db56fa4753bc549e814964c63a6876605e96b16a353d668380a6fd9e32f0d136"

RPROVIDES:${PN} += "cmake-KF5ItemViews \
kitemviews-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
ld-linux-aarch64.so.1 \
libKF5ItemViews.so.5 \
libKF5ItemViews5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
