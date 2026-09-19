SUMMARY = "Convert 'Ghostscript fonts' to PK files"
DESCRIPTION = "Designed for use with xdvi and dvips this utility converts \
Adobe Type 1 fonts to PK bitmap format. It should not \
ordinarily be much used nowadays, since both its target \
applications are now capable of dealing with Type 1 fonts, \
direct."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-2026.226.1.19.2svn52851-60.4.noarch.rpm"
RPM_HASH = "a65daa92d01b5a24733830bee6141ff3553a7fa09d10bd139f768657b7c5135e1d909dc55de1c412d67d30a821b8539f5cbf2e0d5aa2399f5471480caaa28d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gsftopk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gsftopk-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
