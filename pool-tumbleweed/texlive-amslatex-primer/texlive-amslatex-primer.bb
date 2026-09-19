SUMMARY = "Getting up and running with AMS-LaTeX"
DESCRIPTION = "The document aims to get you up and running with AMS-LaTeX as \
quickly as possible. These instructions (along with a template \
file template.tex) are not a substitute for the full \
documentation, but they may get you started quickly enough so \
that you will only need to refer to the main documentation \
occasionally. In addition to 'AMS-LaTeX out of the box', the \
document contains: a section describing how to draw commutative \
diagrams using Xy-pic; and a section describing how to use \
amsrefs to create a bibliography."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn28980"

RPM_NAME = "texlive-amslatex-primer-2026.226.2.3svn28980-61.2.noarch.rpm"
RPM_HASH = "cc584a78ead61909da76cc7d7278d4b2db30742011b288268a6329e66d3b3cc332552e436e6e91d211a2cd440022ae7a93b1177229041e6e653e8c9133a3616e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amslatex-primer"

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
