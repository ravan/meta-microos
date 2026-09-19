SUMMARY = "Curves for LaTeX picture environment"
DESCRIPTION = "This package draws curves in the standard LaTeX picture \
environment using parabolas between data points with continuous \
slope at joins; for circles and arcs, it uses up to 16 \
parabolas. The package can also draw symbols or dash patterns \
along curves. The package provides facilities equivalent to \
technical pens with compasses and French curves. Curves consist \
of short secants drawn by overlapping disks or line-drawing \
\\special commands selected by package options."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.55svn45255"

RPM_NAME = "texlive-curves-2026.226.1.55svn45255-61.2.noarch.rpm"
RPM_HASH = "bfd257cd5e9d2ba27de14660395930f52a10aca8fa9836639fe57dbac0249075b41dfda0000605c459412717ae60e67a0f1a855e494affd076422f1d361a4782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-curves.sty \
tex-curvesls.sty \
texlive-curves"

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
