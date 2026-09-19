SUMMARY = "Set page orientation with dvips/Ghostscript (ps2pdf)"
DESCRIPTION = "This package provides commands for manual (per-page and \
per-document) orientation of pages in a PDF created with \
dvips/Ghostscript (ps2pdf). For future versions it is planned \
to add support for other drivers, allowing for PDF orientation \
to be set in (x)dvipdfmx and pdfmode pdfTeX using the same \
commands from the user perspective."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn57390"

RPM_NAME = "texlive-orientation-2026.226.1.0svn57390-61.2.noarch.rpm"
RPM_HASH = "630db7857dc2992d32bd16e17c40f726c7d8a6dbd062a954fd69e6d672127febae0230a5b5bef46b2faea83ceea58f821ee0c860ecfbaa5bffa2271cabb4ffb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-orientation.sty \
texlive-orientation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
