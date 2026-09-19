SUMMARY = "LaTeX macros for utilizing the roundrect MetaPost routines"
DESCRIPTION = "This LaTeX package provides ways to use the extremely \
configurable rounded rectangles of the roundrect MetaPost \
package with LaTeX. It is chiefly useful for examples, but also \
has macros for particular types of boxes which are useful on \
their own."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39804"

RPM_NAME = "texlive-lroundrect-2026.226.1.0svn39804-61.2.noarch.rpm"
RPM_HASH = "36e587e865a67e1fe093c85dd1c525c2809b0bc63393eeea4d5216f20d100cfe2ee853998453a5d13ba03ce01abd86c30d6928e93d11c3bd06c33032080ab447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lroundrect.sty \
texlive-lroundrect"

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
