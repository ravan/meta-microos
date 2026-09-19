SUMMARY = "Mathematics in Greek texts"
DESCRIPTION = "This package has been designed to facilitate the use of Greek \
letters in mathematical mode. The package allows one to \
directly type in Greek letters (in ISO 8859-7 encoding) in math \
mode."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-elmath-2026.226.1.2svn15878-61.4.noarch.rpm"
RPM_HASH = "fef17251be7eef5e5a9b6640d448c5b7b7b23dcd377d23e1442241e3a96931466a726da0921d9e353e295e573d115e5dfe78deb6feb008ba473c02b69b344e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elmath.sty \
texlive-elmath"

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
