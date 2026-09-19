SUMMARY = "QML interface components for kf6-kuserfeedback"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides the QtQuick components \
needed to build QML interfaces leveraging the library."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "kf6-kuserfeedback-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f8cda475ada94384c3e9fd824a3f33fb70739518061654f15fdffb4663a997ed45ad9b3f96d74a690d7d8742fd25d4861c7e80cdbecf2a1615be4449642268ad"

RPROVIDES:${PN} += "kf6-kuserfeedback-imports \
libKF6UserFeedbackQml.so \
qt6qmlimport-org.kde.userfeedback \
qt6qmlimport-org.kde.userfeedback.1 \
qt6qmlimport-org.kde.userfeedback.254"

RDEPENDS:${PN} += "kf6-kuserfeedback \
ld-linux-aarch64.so.1 \
libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackCore6 \
libKF6UserFeedbackWidgets6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
