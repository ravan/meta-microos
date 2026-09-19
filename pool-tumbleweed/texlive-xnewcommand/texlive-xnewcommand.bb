SUMMARY = "Define \\global and \\protected commands with \\newcommand"
DESCRIPTION = "The package provides the means of defining \\global and (e-TeX) \
\\protected commands, within the framework of LaTeX's standard \
\\newcommand."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-2026.226.1.2svn15878-59.4.noarch.rpm"
RPM_HASH = "b7653a12adba3152c78a54c0426206fe52f6acc38b1a3aaa78f9bdcc1e0e7686e304f66874617ec08e5d3763d8f6dbca8989e8b102996bd9503c0045e65068c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xnewcommand.sty \
texlive-xnewcommand"

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
