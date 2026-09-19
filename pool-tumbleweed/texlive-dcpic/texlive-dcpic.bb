SUMMARY = "Commutative diagrams in a LaTeX and TeX documents"
DESCRIPTION = "DCpic is a package for typesetting Commutative Diagrams within \
a LaTeX and TeX documents. Its distinguishing features are: a \
powerful graphical engine, the PiCTeX package; an easy \
specification syntax in which a commutative diagram is \
described in terms of its objects and its arrows (morphism), \
positioned in a Cartesian coordinate system."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0.0svn30206"

RPM_NAME = "texlive-dcpic-2026.226.5.0.0svn30206-59.2.noarch.rpm"
RPM_HASH = "14c844895431dc7556e8aeb5d7e4cd74e296c232eb44293e55175932d1fc1d27c0acbdb359cc604f642cf16885f9e84093e5f7628441cf72953216900397a676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dcpic.sty \
tex-europroc.cls \
texlive-dcpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
