SUMMARY = "Color extension for the bussproofs package"
DESCRIPTION = "This is a small extension to the bussproofs package that adds \
color control for proof trees. It allows users to customize the \
colors of nodes (formulas), inference lines, and labels via \
package options and runtime commands, while preserving the \
original layout and spacing of bussproofs."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77507"

RPM_NAME = "texlive-bussproofs-colorful-2026.226.1.0svn77507-59.2.noarch.rpm"
RPM_HASH = "3ef8128fd38b80dc1cb9c50f8db14b7630cced9fed2fd5c875ab8884867b1cd9d33f5de3f2581abbc8e7037d1fb0c91c27c35ac7b2b9cf7d3d5052bc37aea160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bussproofs-colorful.sty \
texlive-bussproofs-colorful"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bussproofs.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
