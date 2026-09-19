SUMMARY = "Optionally omit pieces of text"
DESCRIPTION = "Stephan Bellantoni's version has provided preamble commands for \
selecting environments to be included/excluded. This package \
does the same, but corrects, improves, and extends it in both \
implementation and function."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.55svn21921"

RPM_NAME = "texlive-versions-2026.226.0.0.55svn21921-60.2.noarch.rpm"
RPM_HASH = "f73eacf23f53d39028b54ee33a1514cb4bec285d5049fa46159f9db7f705256997288de4c0e52d900c9f3f4d3c22846c076e7335650612ede599563689afcfc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-versions.sty \
texlive-versions"

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
