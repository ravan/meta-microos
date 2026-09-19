SUMMARY = "Commands to control PDF readers, under X11"
DESCRIPTION = "The command-line programs pdfopen and pdfclose allow you to \
control the X Window System version of Adobe's Acrobat Reader \
from the command line or from within a (shell) script. The \
programs work with Acrobat Reader 5, 7, 8 and 9 for Linux, xpdf \
and evince. This version derives from one written by Fabrice \
Popineau for Microsoft operating systems."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.86svn65952"

RPM_NAME = "texlive-xpdfopen-2026.226.0.0.86svn65952-59.4.noarch.rpm"
RPM_HASH = "939701209ac9b904bdadb625d03e06a37bc4994a0a790f5f0d745783ded7785413376a5f59ea71b897c9ec684798b58d15d0d7334eea002a69d1a84d2b0f2900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfclose.1 \
man-pdfopen.1 \
texlive-pdftools-doc-/usr/share/man/man1/pdfclose.1.gz \
texlive-pdftools-doc-/usr/share/man/man1/pdfopen.1.gz \
texlive-xpdfopen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xpdfopen-bin"

inherit rpm
