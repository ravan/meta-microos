SUMMARY = "Typesetting LaTeX source code"
DESCRIPTION = "This package provides a way to typeset LaTeX source code and \
the related result in the same document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3ssvn77682"

RPM_NAME = "texlive-showexpl-2026.226.0.0.3ssvn77682-60.2.noarch.rpm"
RPM_HASH = "8b7e7f92873d8f63ee6c1a926c48bed052087152856798a115fdbdd46fbd04e96e996ba7bb6dfe06ea58e42fa631de890616fd4c2d14980cf2987404634b799a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showexpl.sty \
texlive-showexpl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-graphicx.sty \
tex-listings.sty \
tex-refcount.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
