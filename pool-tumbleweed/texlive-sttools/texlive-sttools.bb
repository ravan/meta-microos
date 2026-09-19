SUMMARY = "Various macros"
DESCRIPTION = "A collection of tools and macros, providing: miscellaneous \
float control, page styles for floats, multipage tabulars, even \
columns at end of twocolumn region, switching between one- and \
two-column anywhere,"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5svn77682"

RPM_NAME = "texlive-sttools-2026.226.3.5svn77682-64.2.noarch.rpm"
RPM_HASH = "c185769be3833d1f4f7ee5cf2026c33f5937cb96cb13912c76250f6debb7fd6a813881d69355294f7e82c24135e369def324aeba6a8d5a2105451ddc1ec02594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cuted.sty \
tex-floatpag.sty \
tex-flushend.sty \
tex-stabular.sty \
tex-stfloats.sty \
texlive-sttools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
