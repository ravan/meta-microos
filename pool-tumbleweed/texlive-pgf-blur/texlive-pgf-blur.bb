SUMMARY = "PGF/TikZ package for 'blurred' shadows"
DESCRIPTION = "The package adds blurred/faded/fuzzy shadows to PGF/TikZ \
pictures. It is configured as a TikZ/PGF library module. The \
method is similar to that of the author's pst-blur package for \
PSTricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn54512"

RPM_NAME = "texlive-pgf-blur-2026.226.1.02svn54512-58.2.noarch.rpm"
RPM_HASH = "d1d23b28371333744911bffe07610a619ca06b1a62d6e6775e990625b17987fb0c301276704d8a7c3b7f17759a3cf315d90300be5ab3bf18459817982174d96a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryshadows.blur.code.tex \
texlive-pgf-blur"

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
texlive-scripts-bin"

inherit rpm
