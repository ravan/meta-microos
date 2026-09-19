SUMMARY = "Binary files of texsis"
DESCRIPTION = "Binary files of texsis"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn3006"

RPM_NAME = "texlive-texsis-bin-2026.20260301.svn3006-120.4.aarch64.rpm"
RPM_HASH = "8f3dafa97f52c3ba0232648055a0ed5a216f5a57a91cef55ec3abd768c92e6884c424c03577becb73bc7db45f986183dd2361f29b1d5feb1a052db76d3cc860a"

RPROVIDES:${PN} += "texlive-texsis-bin"

RDEPENDS:${PN} += "texlive-texsis"

inherit rpm
