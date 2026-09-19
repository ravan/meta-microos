SUMMARY = "Extensive control of page headers and footers in LaTeX2e"
DESCRIPTION = "The package provides extensive facilities, both for \
constructing headers and footers, and for controlling their use \
(for example, at times when LaTeX would automatically change \
the heading style in use)."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.2svn78101"

RPM_NAME = "texlive-fancyhdr-2026.226.5.2svn78101-59.2.noarch.rpm"
RPM_HASH = "509f29b3e28436dcb20126e07a0672c5cd2a5a3264f0336a7cc0374902c494c5c8602a852815428760cd35b025813aa1d1badf9b563c6597f051099dbfc885f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extramarks-v4.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
texlive-fancyhdr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
