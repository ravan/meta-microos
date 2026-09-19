SUMMARY = "Control the typesetting of the abstract environment"
DESCRIPTION = "The abstract package gives you control over the typesetting of \
the abstract environment, and in particular provides for a one \
column abstract in a two column paper."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77682"

RPM_NAME = "texlive-abstract-2026.226.1.2asvn77682-61.2.noarch.rpm"
RPM_HASH = "79fcf4d68b99060083e92a1afb395bb5e634d53830cd209aea468a33ca27fc5f9580f71cb1aa43a8b3b43b009d71d9cca269627e024c9601a349346f0e63a899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abstract.sty \
texlive-abstract"

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
