SUMMARY = "Christmas silliness (English)"
DESCRIPTION = "This is the plain TeX file xii.tex. Call 'pdftex xii.tex' to \
produce a (perhaps) surprising typeset document."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45804"

RPM_NAME = "texlive-xii-2026.226.svn45804-59.4.noarch.rpm"
RPM_HASH = "c85cd7f3dec9161221606581546fa318c051fa7b058e994a9589f7b48d49c5d30502956e911bd8e5df6161a910f2f2410d2fbe0bbf9a137d45642da5f5eb1758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xii"

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
