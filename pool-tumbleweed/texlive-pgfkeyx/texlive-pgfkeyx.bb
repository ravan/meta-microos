SUMMARY = "Extended and more robust version of pgfkeys"
DESCRIPTION = "The package extends and improves the robustness of the pgfkeys \
package. In particular, it can deal with active comma, equality \
sign, and slash in key parsing. The difficulty with active \
characters has long been a problem with the pgfkeys package. \
The package also introduces handlers beyond those that pgfkeys \
can offer."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn26093"

RPM_NAME = "texlive-pgfkeyx-2026.226.0.0.0.1svn26093-58.2.noarch.rpm"
RPM_HASH = "7a27b492c4e481871f0a0dd93e22ba68252a4f21eacf9cff236a4ebdbbc258f73535fa0d1e85795007ca12aa2236e24855125f5dd65c1b86b151b5dbec2ae408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfkeyx.sty \
texlive-pgfkeyx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
