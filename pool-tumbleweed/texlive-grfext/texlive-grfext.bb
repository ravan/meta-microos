SUMMARY = "Manipulate the graphics package's list of extensions"
DESCRIPTION = "This package provides macros for adding to, and reordering the \
list of graphics file extensions recognised by package \
graphics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-grfext-2026.226.1.3svn77682-60.4.noarch.rpm"
RPM_HASH = "7227139e9ecffe01f64ebdd2608641112f2a55f328727af7d224a6c09bf18e066fe088df3cb28195058262ea74d6bcd6626af2b91d4780e714a4de78958f0897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grfext.sty \
texlive-grfext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-kvdefinekeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
