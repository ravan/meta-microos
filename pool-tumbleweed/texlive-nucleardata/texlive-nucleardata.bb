SUMMARY = "Provides data about atomic nuclides for documents"
DESCRIPTION = "The package provides data and commands for including nuclear \
and atomic mass and energy data in LaTeX documents. It uses the \
PythonTeX package and requires pythontex.exe to be called with \
the TeX file as the argument."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47307"

RPM_NAME = "texlive-nucleardata-2026.226.1.1svn47307-61.2.noarch.rpm"
RPM_HASH = "10f62c91756484730472fe19b04c92595d1e728dad18b9f4185c8371d1b57b213301d2303d1e6294c9ade403c33404f8c53b5f27b57a731d75ecf2c4db028c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nucleardata.sty \
texlive-nucleardata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pythontex.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
