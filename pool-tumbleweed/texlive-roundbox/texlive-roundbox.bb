SUMMARY = "Round boxes in LaTeX"
DESCRIPTION = "This package implements a command \\roundbox that can be used, \
in LaTeX, for producing boxes, framed with rounded corners."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn29675"

RPM_NAME = "texlive-roundbox-2026.226.0.0.2svn29675-60.2.noarch.rpm"
RPM_HASH = "9167dafa9162f1c2b9318f9152f6b888e5b13d31dc06ec96b6dfabd22deef481d64cf3c65a13589fb979373761a016fb778d732ffb4c84535cad53fef6e50dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-roundbox.sty \
texlive-roundbox"

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
