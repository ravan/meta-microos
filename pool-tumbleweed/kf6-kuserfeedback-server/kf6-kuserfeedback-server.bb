SUMMARY = "Server component of kf6-kuserfeedback"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides a server component \
used to collect telemetry and feedback."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "kf6-kuserfeedback-server-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "9d145a36d207e58d56f99a9a006e09ecec68f4f4b38b18374675be7c8d62c72c58924cb721f1ee7caf86bbe9afcfedd629a0cdd218acdbd9ef8e1e1c88cdcb12"

RPROVIDES:${PN} += "kf6-kuserfeedback-server"

RDEPENDS:${PN} += "kf6-kuserfeedback \
php"

inherit rpm
