SUMMARY = "Mark vertical rules in margin of text"
DESCRIPTION = "This package is an extension to lineno, replacing that \
package's line numbers with bars to the left or right of the \
text."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn77682"

RPM_NAME = "texlive-vertbars-2026.226.1.0csvn77682-60.2.noarch.rpm"
RPM_HASH = "82e209e62043df16248db6cf06afbb7714377ac487689ad44c303c979ee07568ee7623b33072eca2229b19dbf73e2e6b3226806043795d9503498b58f19eb162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vertbars.sty \
texlive-vertbars"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lineno.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
