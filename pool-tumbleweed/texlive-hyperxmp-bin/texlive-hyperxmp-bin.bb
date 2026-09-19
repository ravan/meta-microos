SUMMARY = "Binary files of hyperxmp"
DESCRIPTION = "Binary files of hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn56984"

RPM_NAME = "texlive-hyperxmp-bin-2026.20260301.svn56984-120.4.aarch64.rpm"
RPM_HASH = "5f77367a7038ad8ce0f89b4e166349bf8cadafe3ab0155e71ac5a684152fb43e060d7a3b903ff35b4e038764d797e89b6a3523b37ee9ec7a3c2bb4c25b19d45d"

RPROVIDES:${PN} += "texlive-hyperxmp-bin"

RDEPENDS:${PN} += "texlive-hyperxmp"

inherit rpm
