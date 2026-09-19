SUMMARY = "Framework for collecting feedback from application users"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. It is designed to be compliant with the \
KDE Telemetry Policy, which forbids the usage of unique identification."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "libKF6UserFeedbackCore6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f250aaf6e87b3136fb80ba057d76e78e2b9387e136272dd942a41aadc478ee6b7dba06f1a0cc4105af377ce4a38fda03b623637316affa79da4a19710d0c262e"

RPROVIDES:${PN} += "libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kuserfeedback \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
