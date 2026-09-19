SUMMARY = "Binary files of make4ht"
DESCRIPTION = "Binary files of make4ht"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn37750"

RPM_NAME = "texlive-make4ht-bin-2026.20260301.svn37750-120.4.aarch64.rpm"
RPM_HASH = "158e0e8b8f9da7f9a493ab5ef4c9b08a3aaeb354f693abc859328f7f698412e9f379796e3ccef3fe2b37e0310229efc0cd0aaa9aed7efc3d1e14c014277ccf72"

RPROVIDES:${PN} += "texlive-make4ht-bin"

RDEPENDS:${PN} += "texlive-make4ht"

inherit rpm
