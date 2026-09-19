SUMMARY = "Binary files of yplan"
DESCRIPTION = "Binary files of yplan"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn34398"

RPM_NAME = "texlive-yplan-bin-2026.20260301.svn34398-120.4.aarch64.rpm"
RPM_HASH = "dceda96441d772d8a3ed35c482fe9bbe675769fc1ab275699d56c3e632077c39278ddbd141be6c0b385eea4ea3e91846449183df68393184f451f765c6197ce1"

RPROVIDES:${PN} += "texlive-yplan-bin"

RDEPENDS:${PN} += "texlive-yplan"

inherit rpm
