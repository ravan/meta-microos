SUMMARY = "TikZ powered LaTeX package to draw parameterized 2D robot arms"
DESCRIPTION = "This LaTeX package uses TikZ to draw parameterized 2D robot \
arms, for example to be used in educational material."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-2026.226.0.0.1svn63116-60.4.noarch.rpm"
RPM_HASH = "f399f3d897c1ac183a50543a5b6a92e187057b24c9709eab3729c691d1c1308aaeded6f3e997956721454dc4f7fb3a35dea24827f3f61283a746e0087d24c703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-robotarm.sty \
texlive-robotarm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
