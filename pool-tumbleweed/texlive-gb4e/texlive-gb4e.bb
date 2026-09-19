SUMMARY = "Linguistic tools"
DESCRIPTION = "Provides an environment for linguistic examples, tools for \
glosses, and various other goodies. The code was developed from \
the midnight and covington packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-gb4e-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "4c3a5e792c32d7844b7513703f3a8b68fbe23e2adac1d724394022007452bc34e643cb3334cc302c19f163f447a5481e5fefbbd542a674356c24af3f90dedab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cgloss4e.sty \
tex-gb4e.sty \
texlive-gb4e"

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
