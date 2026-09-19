SUMMARY = "Write your ideas in a clear way"
DESCRIPTION = "This package provides an environment that has its own line \
numbers or markers and can be well distinguished from the main \
text, for writing your ideas or annotations."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65236"

RPM_NAME = "texlive-mindflow-2026.226.svn65236-61.2.noarch.rpm"
RPM_HASH = "36459c562c52c7c56836cb3299bc9ad679de1283c0259e068dcdf6fa7e9e09718819e0c82dce57be862f3cb767f46590d3c2a51fdab0ce13d32eabb6a83e5069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mindflow.sty \
texlive-mindflow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-lineno.sty \
tex-nowidow.sty \
tex-tcolorbox.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
