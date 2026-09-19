SUMMARY = "Put simple annotations and notes inside a picture"
DESCRIPTION = "The package defines the annotation environment in which \
callouts, notes, arrows, and the like can be placed to describe \
certain parts of a picture."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44899"

RPM_NAME = "texlive-callouts-2026.226.svn44899-59.2.noarch.rpm"
RPM_HASH = "69b03e0f7e2f3b35a7996c3c70cca024f9385983f40a3d74ba21c853eee178b382ae0685505f495290b6774c80ad18c0d8befe2cc4b574e6e3ac85f62a72daf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-callouts.sty \
texlive-callouts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
