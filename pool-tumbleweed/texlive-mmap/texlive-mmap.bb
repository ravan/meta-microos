SUMMARY = "Include CMap resources in PDF files from pdfTeX"
DESCRIPTION = "The package is an extension of cmap with improved flexibility \
and coverage, including the ability to re-encode Knuth's basic \
mathematics fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn77682"

RPM_NAME = "texlive-mmap-2026.226.1.03svn77682-61.2.noarch.rpm"
RPM_HASH = "d6f9b43e067baac71dc524ec91241e5439e7c4ec28292ca7fdcccb3fbaf98eef78d998077aa8491f0705298493080643b2b7e1c85c6bda2d255ba5f331bdc2e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mmap.sty \
texlive-mmap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmap.sty \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
