SUMMARY = "A basis for books to be published by Mentis publishers"
DESCRIPTION = "This LaTeX class loads scrbook and provides changes necessary \
for publishing at Mentis publishers in Paderborn, Germany. It \
is not an official Mentis class, merely one developed by an \
author in close co-operation with Mentis."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-mentis-2026.226.1.5svn15878-59.2.noarch.rpm"
RPM_HASH = "10a6860975a2c75f00f2d48fef34ae597c46e30befdf3d3285291512a80ac526512a2765d772e72470d54aeca2deae8d0edd44c73a889b159234d1bddab898d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mentis.cls \
texlive-mentis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-jurabib.sty \
tex-makeidx.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-ragged2e.sty \
tex-relsize.sty \
tex-textcomp.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
