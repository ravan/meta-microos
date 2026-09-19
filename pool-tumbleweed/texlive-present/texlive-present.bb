SUMMARY = "Presentations with Plain TeX"
DESCRIPTION = "The package offers a collection of simple macros for preparing \
presentations in Plain TeX. Slide colour and text colour may be \
set, links between parts of the presentation, to other files, \
and to web addresses may be inserted. Images may be included \
easily, and code is available to provide transition effects \
between slides or frames. The structure of the macros is not \
overly complex, so that users should find it easy to adapt the \
macros to their specific needs."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.1svn50048"

RPM_NAME = "texlive-present-2026.226.2.2.1svn50048-59.2.noarch.rpm"
RPM_HASH = "5371d87ee54305dd6d6faa379c1f5b0c7aa9bc131b12674153a2654c326fa9d27facb19671d32cd837393bf8bc7b46a7809e6e0075549c590f696dd91b05acae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-present.tex \
texlive-present"

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
