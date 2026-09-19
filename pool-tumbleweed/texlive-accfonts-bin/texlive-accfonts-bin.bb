SUMMARY = "Binary files of accfonts"
DESCRIPTION = "Binary files of accfonts"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn12688"

RPM_NAME = "texlive-accfonts-bin-2026.20260301.svn12688-120.4.aarch64.rpm"
RPM_HASH = "e969214870df1f71c9a82b42abbfdbdc6fd5d6db7d68b9ab0a1a1ddb4a8e0da1ea64b5f187da5f8fab51471466769d40e1174eafb0eb4a28784500082e7e77a6"

RPROVIDES:${PN} += "texlive-accfonts-bin"

RDEPENDS:${PN} += "texlive-accfonts"

inherit rpm
