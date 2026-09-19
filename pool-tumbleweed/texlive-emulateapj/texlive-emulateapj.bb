SUMMARY = "Produce output similar to that of APJ"
DESCRIPTION = "A LaTeX class (based on current RevTeX) to produce preprints \
with the page layout similar to that of the Astrophysical \
Journal."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74166"

RPM_NAME = "texlive-emulateapj-2026.226.svn74166-61.4.noarch.rpm"
RPM_HASH = "cb32c70572e5187e317f55d9023ad1630d95b57b51c5198515b09a07b03bc013f15b342e7c763c500126ea1419dfb10e4df54e20576797dcd955de5d087ff214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emulateapj.cls \
texlive-emulateapj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-epsf.sty \
tex-graphicx.sty \
tex-latexsym.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
