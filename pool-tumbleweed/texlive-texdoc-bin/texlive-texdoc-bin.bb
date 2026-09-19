SUMMARY = "Binary files of texdoc"
DESCRIPTION = "Binary files of texdoc"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn47948"

RPM_NAME = "texlive-texdoc-bin-2026.20260301.svn47948-120.4.aarch64.rpm"
RPM_HASH = "e05461b9e3822c36c17088637b912a606d818fc12eb4882e2cfbfd78aa5c5a52e47da75077825b0f95a34bf6dd6453935a6e1ddf3eb03304010a5a9b0299e7ea"

RPROVIDES:${PN} += "texlive-texdoc-bin"

RDEPENDS:${PN} += "texlive-texdoc"

inherit rpm
