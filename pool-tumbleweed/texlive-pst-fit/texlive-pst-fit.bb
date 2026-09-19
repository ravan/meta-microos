SUMMARY = "Macros for curve fitting"
DESCRIPTION = "The package uses PSTricks to fit curves to: Linear Functions; \
Power Functions; exp Function; Log_{10} and Log_e functions; \
Recip; Kings Law data; Gaussian; and 4th order Polynomial"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn70686"

RPM_NAME = "texlive-pst-fit-2026.226.0.0.03svn70686-59.2.noarch.rpm"
RPM_HASH = "95a67806dfe8ab934e2f0687909b0a9f08b057ff044c2d8042620f2e4f18262cbe12c6fa7c79f133be2703130ced2ed984677e1889bdc82fad7c9af9e6cd1e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fit.sty \
tex-pst-fit.tex \
texlive-pst-fit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-tools.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
