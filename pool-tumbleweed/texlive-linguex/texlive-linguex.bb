SUMMARY = "Format linguists' examples"
DESCRIPTION = "This bundle comprises two packages: The linguex package \
facilitates the formatting of linguist examples, automatically \
taking care of example numbering, indentations, indexed \
brackets, and the '*' in grammaticality judgments. The ps-trees \
package provides linguistic trees, building on the macros of \
tree-dvips, but overcoming some of the older package's \
shortcomings."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3svn77682"

RPM_NAME = "texlive-linguex-2026.226.4.3svn77682-61.2.noarch.rpm"
RPM_HASH = "9dde691a7bafb3ad48770a4ebbe8a7baeb915521c92050ac7267b3e2fab3cfc780ff36576f47c82250c57d4b3ad13edf025753c9e77d296e5da707a162ddd03b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linguex.sty \
tex-linguho.sty \
tex-ps-trees.sty \
texlive-linguex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cgloss4e.sty \
tex-tree-dvips.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
