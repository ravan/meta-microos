SUMMARY = "Eventviews Library"
DESCRIPTION = "This internal library implements a GUI framework for viewing various \
calendar events in agenda, list, month view or timeline fashion."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "eventviews-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8664faedd532527b3482e77f37191721c494439dd4f5a043007d9df44f756de3e8a28acc74dde2a88b29cedae103ac3a8f0369a3a9c94463a215fa0cc256ad93"

RPROVIDES:${PN} += "eventviews"

RDEPENDS:${PN} += ""

inherit rpm
