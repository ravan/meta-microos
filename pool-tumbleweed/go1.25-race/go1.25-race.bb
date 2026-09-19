SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.25.14"

RPM_NAME = "go1.25-race-1.25.14-1.1.aarch64.rpm"
RPM_HASH = "561aacf5a5f22197f3eebb5e2b3a947ceabc962cfac598f4fb421854e3056667f236e326ff50d4f8aee12b697de81e300e2f8fdfc4bf8a2de5eb5aa52f3b0bf1"

RPROVIDES:${PN} += "go1.25-race"

RDEPENDS:${PN} += "go1.25"

inherit rpm
