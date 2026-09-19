SUMMARY = "Draw laboratory equipment"
DESCRIPTION = "This package was developed to help French chemistry teachers to \
create drawings (using TikZ) for laboratory stuff."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn63147"

RPM_NAME = "texlive-proflabo-2026.226.1.0svn63147-59.2.noarch.rpm"
RPM_HASH = "9e8e02ad2aea18296da9231946f89b194b2662416c56c29600359240a8fe4817a301249e5af577e73765718cda3642c3508dacfac8b41f108b07339113b5d5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ProfLabo.sty \
texlive-proflabo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-listofitems.sty \
tex-pgf.sty \
tex-simplekv.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
