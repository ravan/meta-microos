SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5ItemViews5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "99a0491963e14d508574bdda1e15b5b0340a9f1d33c4dbc57e185b98b37a96872ae97c09642a6b574ce6f482b52d0a4e885e3a145ea3e24a472466295ab87ffd"

RPROVIDES:${PN} += "libKF5ItemViews.so.5 \
libKF5ItemViews5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
