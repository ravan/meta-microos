SUMMARY = "Commands for MatematicaC3 textbooks"
DESCRIPTION = "The package provides support for the Matematica C3 project to \
produce free mathematical text books for use in Italian high \
schools."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn29845"

RPM_NAME = "texlive-matc3-2026.226.1.0.1svn29845-59.2.noarch.rpm"
RPM_HASH = "82a5f3992724ce47f320e5d18d937176c7ffad7a5ad94ca78d1ec48d735cdb37aa6d1890b5d65bf238ec9c3c335a20313ec77310fe7dd972d5afb03b80346393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matc3.sty \
texlive-matc3"

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
