SUMMARY = "Development files for kf6-kuserfeedback"
DESCRIPTION = "Development files for kf6-kuserfeedback, a framework for collecting feedback from \
application users via telemetry and targeted surveys."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "kf6-kuserfeedback-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "5e0b2da8bbb4989929ade192179f45c4b937c04d303cc92772cec83d2da484fa2beb4c19ca9a9295edb78cdf6b856d2aae3e48dbcd54a84de5c080a5abecb76c"

RPROVIDES:${PN} += "cmake-KF6UserFeedback \
kf6-kuserfeedback-devel"

RDEPENDS:${PN} += "kf6-kuserfeedback \
libKF6UserFeedbackCore6 \
libKF6UserFeedbackWidgets6"

inherit rpm
