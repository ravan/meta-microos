SUMMARY = "COntent-Oriented LaTeX"
DESCRIPTION = "The package (COntent Oriented LaTeX) gives LaTeX the power to \
retain mathematical meaning of its expressions in addition to \
the typesetting instructions; essentially separating style from \
the content of the math. One advantage of keeping mathematical \
meaning is that conversion of LaTeX documents to other \
executable formats (such as Content MathML or Mathematica code) \
is greatly simplified. The package requires the coolstr, \
coollist and forloop packages."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.35svn76924"

RPM_NAME = "texlive-cool-2026.226.1.35svn76924-61.2.noarch.rpm"
RPM_HASH = "37a156e2ee19da53cf46f4ae0d4cf4230e90b6da1b3ca28165f476a4fea5351cf0a66149f586c637ad3d8f39c3c333d65beebe8e1378c4bfdf1e1d3cfd70dd83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cool.sty \
texlive-cool"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bbm.sty \
tex-coollist.sty \
tex-coolstr.sty \
tex-forloop.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
