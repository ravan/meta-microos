SUMMARY = "Binary files of tikztosvg"
DESCRIPTION = "Binary files of tikztosvg"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn55132"

RPM_NAME = "texlive-tikztosvg-bin-2026.20260301.svn55132-120.4.aarch64.rpm"
RPM_HASH = "7b81a541648bf35f3ff8f1693abd308e8feead8a09c0e9210d24f8c8e862f57924d4f0934b868e8c566372ca399b2dab0895c89fdd1e75f1e57aa5bb2c762578"

RPROVIDES:${PN} += "texlive-tikztosvg-bin"

RDEPENDS:${PN} += "texlive-tikztosvg"

inherit rpm
