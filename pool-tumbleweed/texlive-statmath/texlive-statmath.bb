SUMMARY = "A LaTeX package for simple use of statistical notation"
DESCRIPTION = "The package offers anumber of notational conventions to be used \
in applied and theoretical papers in statistics which are \
currently lacking in the popular amsmath package. The seasoned \
LaTeX user will see that the provided commands are simple, \
almost trivial, but will hopefully offer less cluttered \
preambles as well as a welcome help for novice users."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn46925"

RPM_NAME = "texlive-statmath-2026.226.0.0.1svn46925-64.2.noarch.rpm"
RPM_HASH = "f42bfaff7d837ab40e251d94ebd6b0000f2e8e9f70d1fb79e6453676f63f4de4b935ff105d9fb53fab3f005836f0f58d1c0bebdeb6c81c1b49c1ba9023c38c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statmath.sty \
texlive-statmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-bm.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
