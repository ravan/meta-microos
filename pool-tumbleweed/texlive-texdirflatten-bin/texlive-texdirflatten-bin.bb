SUMMARY = "Binary files of texdirflatten"
DESCRIPTION = "Binary files of texdirflatten"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn12782"

RPM_NAME = "texlive-texdirflatten-bin-2026.20260301.svn12782-120.4.aarch64.rpm"
RPM_HASH = "8d915fc5b7bcba8a16279c6177a793dafd96de683eba56166d8c1f6fb94c07abf2eb0fa2dc4d34491ee9c169b2a1911260a0cbe85c10aa9161aadf3e14023158"

RPROVIDES:${PN} += "texlive-texdirflatten-bin"

RDEPENDS:${PN} += "texlive-texdirflatten"

inherit rpm
