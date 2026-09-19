SUMMARY = "Binary files of albatross"
DESCRIPTION = "Binary files of albatross"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn57089"

RPM_NAME = "texlive-albatross-bin-2026.20260301.svn57089-120.4.aarch64.rpm"
RPM_HASH = "35161f1c945c11693afc65ac14360c56eaf006174113dc50e7b1b844c5ece72b62e0e13462cee7ed113064217f7202ce1c8f338710f18425372d25b88379d817"

RPROVIDES:${PN} += "texlive-albatross-bin"

RDEPENDS:${PN} += "texlive-albatross"

inherit rpm
