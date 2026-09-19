SUMMARY = "Margin annotation for collaborative writing"
DESCRIPTION = "The package provides a flexible mechanism for annotating, and \
commenting upon, collaboratively-written documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn63406"

RPM_NAME = "texlive-mnotes-2026.226.0.0.9svn63406-61.2.noarch.rpm"
RPM_HASH = "c60552c609198d758b8e46a6c4b7c2b376404264320479d8a7ff8bc37ebc44fac506d29ed13c3a6f72ed50a85e58569a991611e771c64c21c8f686b3439bc46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mnotes.sty \
texlive-mnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifoddpage.sty \
tex-kvoptions.sty \
tex-marginnote.sty \
tex-sidenotes.sty \
tex-soul.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
