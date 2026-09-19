SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ItemViews6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "069a6aabec4be520c4648cfd83e5b952a06f624061290e4a67cd676b0e44fae5ea3d52e14f66ef5c0a2c52bf65d0ce59d680a3674b2c915e8132ba142101e095"

RPROVIDES:${PN} += "libKF6ItemViews.so.6 \
libKF6ItemViews6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kitemviews \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
