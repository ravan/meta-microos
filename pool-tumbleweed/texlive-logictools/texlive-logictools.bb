SUMMARY = "Additional tools for typesetting formal logic"
DESCRIPTION = "Adds various tools for typesetting formal logic, including: An \
environment that makes it easier to produce good looking formal \
logic. A few macros that would be of interest to people \
studying logic at Oxford (or other places with similar \
notational conventions)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76924"

RPM_NAME = "texlive-logictools-2026.226.0.0.1.1svn76924-61.2.noarch.rpm"
RPM_HASH = "004750cfbca1abcc80e7c1def4a4468e628e702041e4b4683a1d36d23fbb83d22864147a8b1d32e240e87be9e2b76d1d93b68fd7f4c655dfb866b13822e79473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logictools.sty \
texlive-logictools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-amsmath.sty \
tex-bussproofs.sty \
tex-stmaryrd.sty \
tex-trimspaces.sty \
tex-xfrac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
