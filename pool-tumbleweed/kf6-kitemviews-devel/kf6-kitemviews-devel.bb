SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists. Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kitemviews-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4ecd1e2d35bed0e37091b698c5267b0a18cad28c55062f8305f352154a8c341c939af2a659ef665635dd7404314a877b04c4eaf7fb626d03b9928cd7fd9c1558"

RPROVIDES:${PN} += "cmake-KF6ItemViews \
kf6-kitemviews-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ItemViews.so.6 \
libKF6ItemViews6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
