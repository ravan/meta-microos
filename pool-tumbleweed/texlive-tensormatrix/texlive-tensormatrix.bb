SUMMARY = "Matrix representations of tensors"
DESCRIPTION = "This LaTeX package defines an environment tmat for visualizing \
the structure of matrix representations of tensors. It requires \
the TikZ package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.0.0svn76005"

RPM_NAME = "texlive-tensormatrix-2026.227.1.0.0svn76005-62.2.noarch.rpm"
RPM_HASH = "bb8a0d0624710ca0280c13520d76f40a4de744a73f10822890d50df6807aa2abec0f6e9303229a581cbcd30b9c05d3659f6ec3b660e2d5b52fa710184af04bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tensormatrix.sty \
texlive-tensormatrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
