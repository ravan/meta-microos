SUMMARY = "Typeset go diagrams with PSTricks"
DESCRIPTION = "The psgo package"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.17svn78101"

RPM_NAME = "texlive-psgo-2026.226.0.0.17svn78101-59.2.noarch.rpm"
RPM_HASH = "8ad8557480842c09910e0a3c21e99b84e32225d1d2ed83aa46f8d5571572080c4b5ad491b8eaac2491005fc4a357fe58362ac2794c0d969939a5f569bbf6bd25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psgo.sty \
texlive-psgo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
