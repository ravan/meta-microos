SUMMARY = "An extended general-purpose class"
DESCRIPTION = "The ncc class provides a framework for a common class to \
replace the standard article, book and report classes, and \
providing a 'preprint' class. The class's extensions are \
provided in a number of small packages, some of which may also \
be used with the standard classes. The ncclatex package also \
loads many of the packages of, and requires the latest version \
of the ncctools bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-ncclatex-2026.226.1.5svn15878-61.2.noarch.rpm"
RPM_HASH = "e64f853e0e19674ff69631517b7f877da9a46174722bcb2b55560215ac1d5bd4efb3b86c186d5cd410948c061172cf47090ccdad1730915e0d81cb898adeb36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cp1251-light.def \
tex-ncc.cls \
tex-ncc10.clo \
tex-ncc11.clo \
tex-ncc12.clo \
tex-ncc14.clo \
tex-nccart.clo \
tex-nccbiblist.sty \
tex-nccbook.clo \
tex-nccdefaults.sty \
tex-nccfit.clo \
tex-ncchdr.sty \
tex-nccheadings.sty \
tex-nccindex.sty \
tex-ncclatex.sty \
tex-nccltrus.sty \
tex-nccold.sty \
tex-nccproc.cls \
tex-nccsections.sty \
tex-ncctheorems.sty \
tex-ncctitle.clo \
tex-ncctitle.sty \
tex-ncctitlepage.sty \
tex-sibjnm.cls \
texlive-ncclatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpackage.sty \
tex-amstext.sty \
tex-babel.sty \
tex-cp1251.def \
tex-dcounter.sty \
tex-desclist.sty \
tex-extdash.sty \
tex-fontenc.sty \
tex-inputenc.sty \
tex-makeidx.sty \
tex-multicol.sty \
tex-nccboxes.sty \
tex-nccfancyhdr.sty \
tex-nccfloats.sty \
tex-nccfoots.sty \
tex-nccmath.sty \
tex-nccpic.sty \
tex-nccsect.sty \
tex-nccthm.sty \
tex-textarea.sty \
tex-tocenter.sty \
tex-topsection.sty \
tex-watermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
