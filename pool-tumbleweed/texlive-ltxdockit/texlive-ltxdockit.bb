SUMMARY = "Documentation support"
DESCRIPTION = "This bundle, consisting of a simple wrapper class and some \
packages, forms a small LaTeX/BibTeX documentation kit; the \
author uses it for some of his own packages. The package is not \
supported: users should not attempt its use unless they are \
capable of dealing with problems unaided. (The actual purpose \
of releasing the package is to make it possible for third \
parties to compile the documentation of other packages, should \
that be necessary.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn21869"

RPM_NAME = "texlive-ltxdockit-2026.226.1.2dsvn21869-59.2.noarch.rpm"
RPM_HASH = "ce7f7b2372de73267e4ed83b106f58253bb3e7f273ce74b2b2885c9bdc14bd2ad501d4eabd1cbe61b7d99a09b7f421d29c5efa999458222ce217c65e4d65b416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-btxdockit.sty \
tex-ltxdockit.cfg \
tex-ltxdockit.cls \
tex-ltxdockit.def \
tex-ltxdockit.sty \
texlive-ltxdockit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-listings.sty \
tex-multicol.sty \
tex-scrartcl.cls \
tex-textcomp.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
