SUMMARY = "TikZ Library for Structural Analysis"
DESCRIPTION = "stanli is a STructural ANalysis LIbrary based on PGF/TikZ. \
Creating new assignments and tests, at university, is usually a \
very time-consuming task, especially when this includes drawing \
graphics. In the field of structural engineering, those small \
structures are a key part for teaching. This package permits to \
create such 2D and 3D structures in a very fast and simple way."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.0svn54512"

RPM_NAME = "texlive-stanli-2026.226.3.0svn54512-64.2.noarch.rpm"
RPM_HASH = "71d3525cbb472ccf27e795a9f8e2a45dc0e6561960cd04499a7cd5cd1e11a718cab45afb24d61d6d0981c6fbc831575d3c6089e03fa175eea54e202278355712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stanli.sty \
texlive-stanli"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
