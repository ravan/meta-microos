SUMMARY = "Binary files of checklistings"
DESCRIPTION = "Binary files of checklistings"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn38300"

RPM_NAME = "texlive-checklistings-bin-2026.20260301.svn38300-120.4.aarch64.rpm"
RPM_HASH = "a1d04c98e92a237251abb16a913b19555d7ecb951af8dcc687552f7ba91bcdfb0e0b573e92661fec33be85cff64578c1981032fd77e2e188e7cec7d66bd5ca3e"

RPROVIDES:${PN} += "texlive-checklistings-bin"

RDEPENDS:${PN} += "texlive-checklistings"

inherit rpm
