SUMMARY = "Binary files of convbkmk"
DESCRIPTION = "Binary files of convbkmk"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn30408"

RPM_NAME = "texlive-convbkmk-bin-2026.20260301.svn30408-120.4.aarch64.rpm"
RPM_HASH = "11e55505d3d436f6a377daca8e734b815a5f9b81c07cce7855dfc540f39083c5d09cf8de54b9c2301cf6cc6e4c06f621df6958f4e5e21bdfd87f9087401eca3f"

RPROVIDES:${PN} += "texlive-convbkmk-bin"

RDEPENDS:${PN} += "texlive-convbkmk"

inherit rpm
