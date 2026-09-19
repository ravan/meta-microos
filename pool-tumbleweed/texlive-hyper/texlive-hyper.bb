SUMMARY = "Hypertext cross referencing"
DESCRIPTION = "Redefines LaTeX cross-referencing commands to insert \\special \
commands for HyperTeX dvi viewers, such as recent versions of \
xdvi. The package is now largely superseded by hyperref."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2dsvn17357"

RPM_NAME = "texlive-hyper-2026.226.4.2dsvn17357-60.2.noarch.rpm"
RPM_HASH = "7c022b55e677e67f4f7e3547e0cda487722ee98d2cb44fa47aa043ce59a2cf9cac793da97e6b758e1aa35ee88fbe0356257a69189a9990a86942dd54dba7787f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hxt-bc.sty \
tex-hyper.sty \
texlive-hyper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-defpattern.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
