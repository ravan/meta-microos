SUMMARY = "Babel/Polyglossia support for Friulan(Furlan)"
DESCRIPTION = "The package provides a language description file that enables \
support of Friulan either with babel or with polyglossia."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-babel-friulan-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "c7462b055631e30da5e8f6de85bf546b5943732ea62682362fc6bbcbe09499e924ccb882e4f2d10804f9b226ea98a0e4a5734100333e3adea0f00610582fc29c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-friulan.ldf \
texlive-babel-friulan"

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
