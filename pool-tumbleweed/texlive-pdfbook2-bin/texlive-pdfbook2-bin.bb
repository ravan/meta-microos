SUMMARY = "Binary files of pdfbook2"
DESCRIPTION = "Binary files of pdfbook2"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn37537"

RPM_NAME = "texlive-pdfbook2-bin-2026.20260301.svn37537-120.4.aarch64.rpm"
RPM_HASH = "c80a7571da165a6aee5401f6fad680ef0a40d7c064acbdd34d4f175b7029881332e8b9ab2f92b1ae87c01d11fbb27f8ef35e23afcbddc0dc9bee769b93223399"

RPROVIDES:${PN} += "texlive-pdfbook2-bin"

RDEPENDS:${PN} += "texlive-pdfbook2"

inherit rpm
