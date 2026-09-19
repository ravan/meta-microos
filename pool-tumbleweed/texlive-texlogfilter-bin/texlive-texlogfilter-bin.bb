SUMMARY = "Binary files of texlogfilter"
DESCRIPTION = "Binary files of texlogfilter"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn61780"

RPM_NAME = "texlive-texlogfilter-bin-2026.20260301.svn61780-120.4.aarch64.rpm"
RPM_HASH = "a7ccb472340e6014d9fd50778083d246eb5abd0d7ffb8b78c9dfb6557127ad0fda3c2b3a80e8f99a8e21cb5352c6fc0776580a4f4926595add2f92123c3546e1"

RPROVIDES:${PN} += "texlive-texlogfilter-bin"

RDEPENDS:${PN} += "texlive-texlogfilter"

inherit rpm
