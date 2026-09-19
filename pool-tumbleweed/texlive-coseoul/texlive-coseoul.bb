SUMMARY = "Context sensitive outline elements"
DESCRIPTION = "The package provides 'relative' commands that may be used in \
place of \\chapter, \\section, etc. The documentation shows a \
number of document-management scenarios in which such commands \
are valuable."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn23862"

RPM_NAME = "texlive-coseoul-2026.226.1.1svn23862-61.2.noarch.rpm"
RPM_HASH = "8001b17664608e3b0696ba799c1a993c0fbb88b1c2ca76a8f94ed18f651e87215de27439fafde7786ac86b993eb7d546b088d9f7d3d2104812d77a0aec28da19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coseoul.sty \
texlive-coseoul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
