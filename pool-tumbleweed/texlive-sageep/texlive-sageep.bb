SUMMARY = "Format papers for the annual meeting of EEGS"
DESCRIPTION = "The class provides formatting for papers for the annual meeting \
of the Environmental and Engineering Geophysical Society (EEGS) \
('Application of Geophysics to Engineering and Environmental \
Problems', known as SAGEEP)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-sageep-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "626af5fb6ec0f338e4fe94eebf1c06283a1dba02330cff8a9bc0edcd13e9c8893d1207d06057acf2fdf248678fb0651cd9ddd92d09d14000202f1627bdc1a3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sageep.cls \
texlive-sageep"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-caption.sty \
tex-courier.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-indentfirst.sty \
tex-mathptmx.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
