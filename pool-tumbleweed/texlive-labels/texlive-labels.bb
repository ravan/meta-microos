SUMMARY = "Print sheets of sticky labels"
DESCRIPTION = "A LaTeX package to print a regular grid of ragged-right labels \
on a page, suitable for sheets of labels which can be fed \
through a printer. Macros are provided to allow easy input of \
names and addresses in a form free of TeX markup. Equally \
useful is a feature for making multiple copies of a single \
label, e.g., return address stickers to go with the labels. \
Rows, columns, borders can all be specified to match the label \
sheet being used."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn15878"

RPM_NAME = "texlive-labels-2026.226.0.0.13svn15878-63.2.noarch.rpm"
RPM_HASH = "5fa97b513f11918da840e80ec878788d42dc6f875fc8b6ed6ce07564a7d1ff14c312c7b4071788448076846906b16a00e68422607f6fe0782d40bd4b2e45e340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labels.sty \
tex-olabels.sty \
texlive-labels"

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
