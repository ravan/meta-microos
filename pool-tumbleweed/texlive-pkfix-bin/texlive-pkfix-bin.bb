SUMMARY = "Binary files of pkfix"
DESCRIPTION = "Binary files of pkfix"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn13364"

RPM_NAME = "texlive-pkfix-bin-2026.20260301.svn13364-120.4.aarch64.rpm"
RPM_HASH = "76d809a10ac39851feb018da9b3d69a32c912be3b87ab4ab3ab0559e1d2dec94642d928e18758dc8da02bff052cb4b8dc346d9d2183610eeedb960132db5020a"

RPROVIDES:${PN} += "texlive-pkfix-bin"

RDEPENDS:${PN} += "texlive-pkfix"

inherit rpm
