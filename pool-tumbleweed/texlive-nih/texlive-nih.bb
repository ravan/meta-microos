SUMMARY = "A class for NIH grant applications"
DESCRIPTION = "The nih class offers support for grant applications to NIH, the \
National Institutes of Health, a US government agency. The \
example-* files provide a template for using nih.cls and \
submitting the biographical sketches the NIH wants. They \
(potentially) use denselists package, which just reduces list \
spacing; the package is distributed with the class, but is not \
part of the class proper. (The examples may be distributed \
without even the restrictions of the LaTeX licence.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-nih-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "111f55ab7245c6e451ee0963bceca4d9e50713de4bcfd0c2f9e5da9d108ee112b29588459413c12bfd507d252ce2df931850a1425cfcf01878f49edf11941b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-denselists.sty \
tex-nih.cls \
texlive-nih"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
