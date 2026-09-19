SUMMARY = "Binary files of pdfjam"
DESCRIPTION = "Binary files of pdfjam"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn52858"

RPM_NAME = "texlive-pdfjam-bin-2026.20260301.svn52858-120.4.aarch64.rpm"
RPM_HASH = "a8dfe973b9ff3d31034c31845a30451896d9938a7261a7e8f4f19ccaaee2eee7642bf327168c691acb8a848d5fdd761472592ce0515dd9aa9d0dc18f1a1c9753"

RPROVIDES:${PN} += "pdfjam \
texlive-pdfjam-bin"

RDEPENDS:${PN} += "/usr/bin/pdflatex \
texlive-pdfjam"

inherit rpm
