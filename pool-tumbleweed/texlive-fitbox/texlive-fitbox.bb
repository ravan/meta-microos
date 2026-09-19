SUMMARY = "Fit graphics on a page"
DESCRIPTION = "The package allows a box (usually an \\includegraphics box) to \
fit on the page. It scales the box to the maximal allowed size \
within the user-set limits. If there is not enough space on the \
page, the box is moved to the next one."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn77682"

RPM_NAME = "texlive-fitbox-2026.226.1.02svn77682-59.2.noarch.rpm"
RPM_HASH = "d0a4a07d3dbfe2e4c5b96c8300d701f1ab143167dc0cdc782c8caac9cbf0a41c522640b68da97a01292e6a37923daf2a3b4590d427ae531de62ecec142262476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fitbox.sty \
texlive-fitbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
