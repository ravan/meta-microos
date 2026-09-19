SUMMARY = "Support for floating point operations at LaTeX level"
DESCRIPTION = "This package provides an interface to the LaTeX3 floating point \
unit (part of expl3), mainly used for PSTricks related packages \
to allow math expressions at LaTeX level. siunitx is used for \
formatting the calculated number. The package also depends on \
xkeyval and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn77682"

RPM_NAME = "texlive-pst-calculate-2026.226.0.0.02svn77682-59.2.noarch.rpm"
RPM_HASH = "a9f07a068c82425c001da22ea9deb12f158a1f8ca7006266a02e36ea122724ce06f8306de6941b842a683e6deff3eaa40a8300b9b4687a6c754076550c2dc002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-calculate.sty \
texlive-pst-calculate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-siunitx.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
