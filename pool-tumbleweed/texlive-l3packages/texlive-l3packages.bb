SUMMARY = "High-level LaTeX3 concepts"
DESCRIPTION = "This collection deals with higher-level ideas such as the \
Designer Interface, as part of LaTeX3 developments. The \
packages here have over time migrated into the LaTeX kernel: \
the material here is retained to support older files. The \
appropriate LaTeX kernel releases incorporating the ideas from \
the packages here are l3keys2e 2022-06-01 xfp 2022-06-01 xparse \
2020-10-01 xtemplate 2024-06-01"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76637"

RPM_NAME = "texlive-l3packages-2026.226.svn76637-63.2.noarch.rpm"
RPM_HASH = "6a86876461fb0fcb35643c30197e2eb3cfd39b3aa3b569a4ff4ed55c78bfb1464c4175a3212cf50fb5bac8ef5eac1c48f890ab6bfa48c678fb27d6c365b67a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-l3keys2e.sty \
tex-xfp.sty \
tex-xparse-2018-04-12.sty \
tex-xparse-2020-10-01.sty \
tex-xparse-generic.tex \
tex-xparse.sty \
tex-xtemplate-2023-10-10.sty \
tex-xtemplate.sty \
texlive-l3packages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
