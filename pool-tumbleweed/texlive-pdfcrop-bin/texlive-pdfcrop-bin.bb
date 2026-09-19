SUMMARY = "Binary files of pdfcrop"
DESCRIPTION = "Binary files of pdfcrop"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn14387"

RPM_NAME = "texlive-pdfcrop-bin-2026.20260301.svn14387-120.4.aarch64.rpm"
RPM_HASH = "dd566a8046cc77f88b2f14b45bc9b5061261384982c3b72be8edbe8262096447cef50c3d1708bc2bf77672e513e0b5555c506e5559fa3533d8b64a9ea758e0cc"

RPROVIDES:${PN} += "texlive-pdfcrop-bin"

RDEPENDS:${PN} += "texlive-pdfcrop"

inherit rpm
