SUMMARY = "Commented editions with LaTeX"
DESCRIPTION = "The package is intended for commented editions. An example of \
commented edition is a teacher's book based on a student's \
textbook. Each page of a teacher's book is a page from the \
textbook and comments for the teacher. This package was \
commissioned by Instituto de Matematica Pura e Aplicada ( IMPA)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn50116"

RPM_NAME = "texlive-commedit-2026.226.1.02svn50116-60.2.noarch.rpm"
RPM_HASH = "dbe33af16f4ebc2bf69df58c8b99f7841134ad98f57c395cec8a54780067780f8cb4c5e81770967967a5f29b3c33edfc725d65dff1a8cb8f9acdb38b576fe7f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commedit.sty \
texlive-commedit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-changepage.sty \
tex-etoolbox.sty \
tex-everyshi.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
