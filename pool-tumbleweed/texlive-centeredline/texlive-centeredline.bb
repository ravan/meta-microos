SUMMARY = "A macro for centering lines"
DESCRIPTION = "This package provides a macro \\centeredline{...} which allows \
to conveniently center a line inside a paragraph while allowing \
usage therein of \\verb or other macros changing catcodes. It \
works nicely in list environments, and material whose natural \
width exceeds the current linewidth will get properly centered \
too."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-centeredline-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "9c1f610faf89e134556ab627c16ded324a725c7115cffd90c71385cbdca60bd2e053d95f01e4efb6f72cafd0c89863c4d07312a23af049c7f931be5f979e149d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-centeredline.sty \
texlive-centeredline"

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
