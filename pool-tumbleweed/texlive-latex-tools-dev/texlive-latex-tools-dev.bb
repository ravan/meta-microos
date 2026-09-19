SUMMARY = "Development pre-release of the LaTeX tools bundle"
DESCRIPTION = "This is a pre-release version of the standard LaTeX tools \
bundle. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_1svn77483"

RPM_NAME = "texlive-latex-tools-dev-2026.226.pre_release_1svn77483-63.2.noarch.rpm"
RPM_HASH = "3f075827efec5d70458bd647860c8a122fb40f2312c4b9d0781a8a4408ebb174ed5bfd572536c635606d8372b2f31449343ab1effb23652d5520d3a3d3398606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-afterpage.sty \
texdev-array-2016-10-06.sty \
texdev-array-2020-02-10.sty \
texdev-array-2023-11-01.sty \
texdev-array-2024-06-01.sty \
texdev-array.sty \
texdev-bm.sty \
texdev-calc.sty \
texdev-dcolumn.sty \
texdev-delarray.sty \
texdev-e.tex \
texdev-enumerate.sty \
texdev-fontsmpl.sty \
texdev-fontsmpl.tex \
texdev-ftnright.sty \
texdev-h.tex \
texdev-hhline.sty \
texdev-indentfirst.sty \
texdev-l3sys-query.sty \
texdev-layout.sty \
texdev-longtable-2020-01-07.sty \
texdev-longtable.sty \
texdev-multicol-2017-04-11.sty \
texdev-multicol-2019-10-01.sty \
texdev-multicol-2024-05-23.sty \
texdev-multicol.sty \
texdev-q.tex \
texdev-r.tex \
texdev-rawfonts.sty \
texdev-s.tex \
texdev-shellesc.sty \
texdev-showkeys-2014-10-28.sty \
texdev-showkeys.sty \
texdev-somedefs.sty \
texdev-tabularx.sty \
texdev-thb.sty \
texdev-thc.sty \
texdev-thcb.sty \
texdev-theorem.sty \
texdev-thm.sty \
texdev-thmb.sty \
texdev-thp.sty \
texdev-trace.sty \
texdev-varioref-2016-02-16.sty \
texdev-varioref-2019-10-01.sty \
texdev-varioref.sty \
texdev-verbatim.sty \
texdev-verbtest.tex \
texdev-x.tex \
texdev-xr-2023-07-04.sty \
texdev-xr.sty \
texdev-xspace.sty \
texlive-latex-tools-dev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texdev-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
