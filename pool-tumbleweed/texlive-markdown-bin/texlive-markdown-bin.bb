SUMMARY = "Binary files of markdown"
DESCRIPTION = "Binary files of markdown"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn73628"

RPM_NAME = "texlive-markdown-bin-2026.20260301.svn73628-120.4.aarch64.rpm"
RPM_HASH = "a927660274eb20b3c1320198a10d154535e7c88bf32165edd54e51b84ec343c326ac3dd35cb8c4d97b7082342096c9fef6efcf175fbb77ce9225386f08de93b8"

RPROVIDES:${PN} += "texlive-markdown-bin"

RDEPENDS:${PN} += "texlive-markdown"

inherit rpm
