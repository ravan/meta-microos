SUMMARY = "A collection of programming tools for beamer"
DESCRIPTION = "This packages provides a collection of programming tools for \
beamer. Currently, it provides the control sequence \
\\redefbeamertemplate for redefining a predefined beamer \
template."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76639"

RPM_NAME = "texlive-beamertools-2026.226.0.0.1svn76639-61.2.noarch.rpm"
RPM_HASH = "89911972887fb3b04324a8f66ac0d784778d7df1f12ba1a3681088cc8c86d045c902de44f6253726918595dc719dd3e906a93ec519dca9edde2fee9f6f8e224a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamertools.sty \
texlive-beamertools"

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
