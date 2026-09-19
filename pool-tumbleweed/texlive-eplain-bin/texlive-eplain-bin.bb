SUMMARY = "Binary files of eplain"
DESCRIPTION = "Binary files of eplain"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn3006"

RPM_NAME = "texlive-eplain-bin-2026.20260301.svn3006-120.4.aarch64.rpm"
RPM_HASH = "6a2999d9d0c15ba8db406d7d29413c8bcb3e0c226ed74266b340ab3aa4e0192257bb837f776bcf0a5f82986fa9e6ed4b1c1d3632eb40c841be0a1d5aa6bd2272"

RPROVIDES:${PN} += "texlive-eplain-bin"

RDEPENDS:${PN} += "texlive-eplain"

inherit rpm
