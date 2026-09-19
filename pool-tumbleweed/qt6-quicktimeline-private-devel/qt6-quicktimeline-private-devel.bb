SUMMARY = "Non-ABI stable API for the Qt 6 QuickTimeline Library"
DESCRIPTION = "This package provides private headers of libQt6QuickTimeline that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quicktimeline-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "228412e3e58299c556914dcdedc2e640c5beaccbc459ec59d4e82c4d172ce83d8f59d718d0b91d63bc061015c52bf338790032b440073810799dd0d488e9f207"

RPROVIDES:${PN} += "cmake-Qt6QuickTimelineBlendTreesPrivate \
cmake-Qt6QuickTimelinePrivate \
qt6-quicktimeline-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTimeline"

inherit rpm
