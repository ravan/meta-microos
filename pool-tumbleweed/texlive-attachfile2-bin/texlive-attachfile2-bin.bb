SUMMARY = "Binary files of attachfile2"
DESCRIPTION = "Binary files of attachfile2"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn52909"

RPM_NAME = "texlive-attachfile2-bin-2026.20260301.svn52909-120.4.aarch64.rpm"
RPM_HASH = "2bdaff33ded7d6eae8822ead4d472c48cf3344892f653090dacbbe9a72430273fd99e693f7de61c6954ee24b23b0ef2d004a77d077987c146b44fe3286c13fb9"

RPROVIDES:${PN} += "texlive-attachfile2-bin \
texlive-pdftools-bin-/usr/bin/pdfatfi"

RDEPENDS:${PN} += "texlive-attachfile2"

inherit rpm
