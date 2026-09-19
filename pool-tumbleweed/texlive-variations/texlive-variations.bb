SUMMARY = "Typeset tables of variations of functions"
DESCRIPTION = "The package provides macros for typesetting tables showing \
variations of functions according to French usage. These macros \
may be used by both LaTeX and plain TeX users."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn15878"

RPM_NAME = "texlive-variations-2026.226.0.0.3svn15878-60.2.noarch.rpm"
RPM_HASH = "8ce3ca41c5105ec26558d4db370edf2c7ed356dad3fc23697d980d4b174e5dbb18883c39c40840a809e31f574793ae360f3d3da941d9c74f39e9bb0748659bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-variations.sty \
tex-variations.tex \
texlive-variations"

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
