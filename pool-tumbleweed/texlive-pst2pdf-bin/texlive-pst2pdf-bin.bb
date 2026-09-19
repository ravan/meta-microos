SUMMARY = "Binary files of pst2pdf"
DESCRIPTION = "Binary files of pst2pdf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn29333"

RPM_NAME = "texlive-pst2pdf-bin-2026.20260301.svn29333-120.4.aarch64.rpm"
RPM_HASH = "a4631b928f83fa84800a3d22bcd98bdee1ff246f26681b989251d9c4be150172ea2e60c11cd8ff7fa679bdb2748f032b4d0adcb82240d9d4a271f10feed321f9"

RPROVIDES:${PN} += "texlive-pst2pdf-bin"

RDEPENDS:${PN} += "texlive-pst2pdf"

inherit rpm
