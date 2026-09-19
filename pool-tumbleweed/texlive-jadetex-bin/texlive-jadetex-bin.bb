SUMMARY = "Binary files of jadetex"
DESCRIPTION = "Binary files of jadetex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn3006"

RPM_NAME = "texlive-jadetex-bin-2026.20260301.svn3006-120.4.aarch64.rpm"
RPM_HASH = "ff6e93dd05d76640b726d494263b24c30d994d0dc7b1e2e9675c7c9a450317564ff1dcee298ec9a735b42feac0af6fdc35e01259ac2b53e8d26c31718fa250c9"

RPROVIDES:${PN} += "texlive-jadetex-bin"

RDEPENDS:${PN} += "texlive-jadetex"

inherit rpm
