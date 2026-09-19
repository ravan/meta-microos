SUMMARY = "A utility for making hyphenation patterns"
DESCRIPTION = "Mkpattern is a general purpose program for the generation of \
hyphenation patterns, with definition of letter sets and \
template-like constructions. It also provides an easy way to \
handle different input and output encodings, and features \
generation of clean UTF-8 patterns. The package was used for \
the creation of the Galician patterns."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-mkpattern-2026.226.1.2svn76924-61.2.noarch.rpm"
RPM_HASH = "f53f95b40427916446392ac4dabb4ec5117ae0371b4f7703202edb644fea7470d81f39a13a68ba0a391cc52570a7e3e7e8d4c5461cf2343e5b636d01728e0dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mkpatter.tex \
texlive-mkpattern"

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
