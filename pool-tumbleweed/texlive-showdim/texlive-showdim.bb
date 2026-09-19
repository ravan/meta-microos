SUMMARY = "Variants on printing dimensions"
DESCRIPTION = "A package for LaTeX providing a number of commands for printing \
the value of a TeX dimension. For example, \
\\tenthpt{\\baselineskip} yields the current value of \
\\baselineskip rounded to the nearest tenth of a point."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn78101"

RPM_NAME = "texlive-showdim-2026.226.1.2svn78101-60.2.noarch.rpm"
RPM_HASH = "e4880e426cbde34450cadaa045ea97e82f9e8b18ccaf805c48b2688ea17b7ad890b022edf2c778a12fabad84fcb1c8fc663bba25c5ad0709e852411a03e8508e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showdim.sty \
texlive-showdim"

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
