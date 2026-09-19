SUMMARY = "Binary files of texdiff"
DESCRIPTION = "Binary files of texdiff"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn15506"

RPM_NAME = "texlive-texdiff-bin-2026.20260301.svn15506-120.4.aarch64.rpm"
RPM_HASH = "dd096f049f2b1b823538c3549d6a6fbdc928464b51d1d24bb9cdc6e4bc9ba61d4f34eb5c8c7979cd98a71e4a0894be660e874bab09fecf59a758e3397d214ded"

RPROVIDES:${PN} += "texlive-texdiff-bin"

RDEPENDS:${PN} += "texlive-texdiff"

inherit rpm
