SUMMARY = "Proofs in appendix"
DESCRIPTION = "The package makes it easier to write articles where proofs and \
other material are deferred to the appendix. The appendix \
material is written in the LaTeX code along with the main text \
which it naturally complements, and it is automatically \
deferred. The package can automatically send proofs to the \
appendix, can repeat in the appendix the theorem environments \
stated in the main text, can section the appendix automatically \
based on the sectioning of the main text, and supports a \
separate bibliography for the appendix material. It depends on \
the following other packages: amsthm, bibunits (if the \
bibliography option is set to separate), environ, etoolbox, \
fancyvrb, ifthen, and kvoptions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.6svn76507"

RPM_NAME = "texlive-apxproof-2026.226.1.2.6svn76507-61.2.noarch.rpm"
RPM_HASH = "8dede31d859b0e6579dc264706b2d9490f524dd5ae0b046afbec5176f1e4ce52b16c561062e0940c66453019d30ac24b626c2dac6aa686af5b8e224cdbd150e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apxproof.sty \
texlive-apxproof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-bibunits.sty \
tex-catchfile.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
