SUMMARY = "Binary files of checkcites"
DESCRIPTION = "Binary files of checkcites"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn25623"

RPM_NAME = "texlive-checkcites-bin-2026.20260301.svn25623-120.4.aarch64.rpm"
RPM_HASH = "e21c5ad2ed262ca46d0219f2c186c92af0baab37f1384e5429a0052cd45af3657ed86bfcb191b664a333307df2ae122857194927d83223aee7b76b616063283f"

RPROVIDES:${PN} += "texlive-checkcites-bin"

RDEPENDS:${PN} += "texlive-checkcites"

inherit rpm
