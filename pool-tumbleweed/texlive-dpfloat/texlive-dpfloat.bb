SUMMARY = "Support for double-page floats"
DESCRIPTION = "Provides fullpage and leftfullpage environments, that may be \
used inside a figure, table, or other float environment. If the \
first of a 2-page spread uses a 'leftfullpage' environment, the \
float will only be typeset on an even-numbered page, and the \
two floats will appear side-by-side in a two-sided document."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-dpfloat-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "d6441f0d4fcf54f4adae2f701a9c61775282f6e59d475cad1b8fbcb80e8a54d6dfce1e0c37e7175d9bd6b0239d77f7754b7fb7cbfe5a80b3f5cd52066e26e3a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dpfloat.sty \
texlive-dpfloat"

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
