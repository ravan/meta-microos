SUMMARY = "BibLaTeX style for the New England Journal of Medicine (NEJM)"
DESCRIPTION = "This is a BibLaTeX numeric style based on the design of the New \
England Journal of Medicine (NEJM)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn49839"

RPM_NAME = "texlive-biblatex-nejm-2026.226.0.0.5.0svn49839-61.2.noarch.rpm"
RPM_HASH = "29244ef20013f987749a3d5d3163eea0c594107f85e0de7dbe5aff6cf00d665c2ef451440b8e7a15c7349e08ef985e78870af6729fd658acd923999897c9fc1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nejm.bbx \
tex-nejm.cbx \
texlive-biblatex-nejm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.cbx \
tex-numeric.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
