SUMMARY = "Replace the harvard package with natbib"
DESCRIPTION = "This small package allows a LaTeX document containing the \
citation commands provided by the Harvard package to be \
compiled using the natbib package. Migration from harvard to \
natbib thus can be achieved simply by replacing \
\\usepackage{harvard} with usepackage{natbib} \
usepackage{har2nat} It is important that har2nat be loaded \
after natbib, since it modifies natbib commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-har2nat-2026.226.1.0svn77682-60.4.noarch.rpm"
RPM_HASH = "d6d09d6174e9f4c75ef53cfe56372c41a5513f24ac573ecbd2bc1e788a498fa8decbe0c35aef567d43537f485c0a6203a90e717061abf86147a493003f7d5752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-har2nat.sty \
texlive-har2nat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-natbib.sty \
tex-suffix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
