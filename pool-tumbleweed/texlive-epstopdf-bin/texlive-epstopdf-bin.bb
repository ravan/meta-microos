SUMMARY = "Binary files of epstopdf"
DESCRIPTION = "Binary files of epstopdf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn18336"

RPM_NAME = "texlive-epstopdf-bin-2026.20260301.svn18336-120.4.aarch64.rpm"
RPM_HASH = "a2f9ac44ddafa33625fce1537dcb1e65a296e3c02786af894be603c5c7dea0a11af293821a26f4d429182341b0eaa2ec5f5ed73ad4225ba1dc89e9c2b8cc3daf"

RPROVIDES:${PN} += "texlive-epstopdf-bin"

RDEPENDS:${PN} += "texlive-epstopdf"

inherit rpm
