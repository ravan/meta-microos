SUMMARY = "User interface components for kf6-kuserfeedback"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides the user interface \
components to integrate the framework in Qt applications."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "libKF6UserFeedbackWidgets6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "db12d916f26ebc056934668819eeab624120d6d33252e000264e3c3be2ca8d488fe8bf2de831a9b60bde254e3dbcc14317d987edcc6059115a48bab6b09bafee"

RPROVIDES:${PN} += "libKF6UserFeedbackWidgets.so.6 \
libKF6UserFeedbackWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kuserfeedback \
ld-linux-aarch64.so.1 \
libKF6UserFeedbackCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
