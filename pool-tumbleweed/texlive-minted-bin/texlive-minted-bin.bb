SUMMARY = "Binary files of minted"
DESCRIPTION = "Binary files of minted"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn72375"

RPM_NAME = "texlive-minted-bin-2026.20260301.svn72375-120.4.aarch64.rpm"
RPM_HASH = "087bff2c3b616a36988b18cde03a9851902b162d7f56b78b307c8835dedfcf355fd3e1f0190b268de41de2853c09b2f17694f30263a268553921308a3b548945"

RPROVIDES:${PN} += "texlive-minted-bin"

RDEPENDS:${PN} += "texlive-minted"

inherit rpm
