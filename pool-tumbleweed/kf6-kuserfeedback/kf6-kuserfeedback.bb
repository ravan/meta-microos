SUMMARY = "Framework for collecting feedback from application users"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. It is designed to be compliant with the \
KDE Telemetry Policy, which forbids the usage of unique identification."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "kf6-kuserfeedback-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "73d7c94b09ac8fd332c223f6ed4fc1dbeac6d89d19db6a7c889e72e239646493292626fd31e5b63c479e9c4f80db4eb4b717960d4223a17a80cc86e7ef2eef34"

RPROVIDES:${PN} += "kf6-kuserfeedback"

RDEPENDS:${PN} += ""

inherit rpm
