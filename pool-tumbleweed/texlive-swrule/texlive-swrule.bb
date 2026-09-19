SUMMARY = "Lines thicker in the middle than at the ends"
DESCRIPTION = "Defines commands that create rules split into a (specified) \
number of pieces, whose size varies to produce the effect of a \
rule that swells in its centre."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54267"

RPM_NAME = "texlive-swrule-2026.226.svn54267-64.2.noarch.rpm"
RPM_HASH = "79d20f6584052b3b0000088980575266e8af3090f7b0f6bd771e86e9a89fd86e619675b44e73223fb56c5eb12883d28675447025838ed3d0c7869b2b07e0b687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swrule.sty \
texlive-swrule"

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
