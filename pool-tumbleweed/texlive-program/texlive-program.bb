SUMMARY = "Typesetting programs and algorithms"
DESCRIPTION = "The main offering is a program environment; a programbox \
environment is available for fragments that must not break with \
the pages."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.3.14svn44214"

RPM_NAME = "texlive-program-2026.226.3.3.14svn44214-59.2.noarch.rpm"
RPM_HASH = "3aec27e02c353d67ddc41a8fe638dcfbbd79c287aa675803029d30052fd37370930f9446c820b89b4665a11fcc9a8c7ecdb08d0804f07aa2ab9fefdade03341c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-program.sty \
texlive-program"

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
