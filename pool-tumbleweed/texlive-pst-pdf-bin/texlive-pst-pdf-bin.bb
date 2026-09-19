SUMMARY = "Binary files of pst-pdf"
DESCRIPTION = "Binary files of pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn7838"

RPM_NAME = "texlive-pst-pdf-bin-2026.20260301.svn7838-120.4.aarch64.rpm"
RPM_HASH = "693548e8a312ff3dc612468364813de1a490958b1f47b3754bdc21788b2cdff7950ec9dc90e899cbd53093f5139bec94df9701a79919be0158709367e8042bbb"

RPROVIDES:${PN} += "texlive-pst-pdf-bin"

RDEPENDS:${PN} += "texlive-pst-pdf"

inherit rpm
