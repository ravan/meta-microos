SUMMARY = "Key based parser"
DESCRIPTION = "This LaTeX package provides an interface to define and evaluate \
key-based replacement rules. It can be used to parse the \
argument specification of a document command."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-keyparse-2026.226.1.1svn76924-63.2.noarch.rpm"
RPM_HASH = "68a6df8b027e94ffc24f250a54eb07e175e9cacfe42b861c0a6119a77cfbc5dfc00dd2e1a0613419204e7ee59cb037e28aef8bc390468267cc13425acdd4a4f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyparse.sty \
texlive-keyparse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
