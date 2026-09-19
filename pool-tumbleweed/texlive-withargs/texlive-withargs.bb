SUMMARY = "In-place argument substitution"
DESCRIPTION = "The \\withargs command provides a clean way to populate a \
template (containing #1, #2, etc.) using LaTeX argument \
substitution. It also allows you to carefully control argument \
expansion using a LaTeX3-style argument specification. Uses \
range from creating readable string templates (akin to C's \
printf function) to performing otherwise complex token-list \
manipulation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.1svn76924"

RPM_NAME = "texlive-withargs-2026.226.0.0.3.1svn76924-60.2.noarch.rpm"
RPM_HASH = "4b19ac575dbbb45c4da9a2be7b5406caea4b03fc500349dfc145e7665e6144c12e2c1194a5887eb404dc9cdf5b88356a463d9651cca266d2b490852ff91d56f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-withargs-dry.sty \
tex-withargs-packagedoc.cls \
tex-withargs.sty \
texlive-withargs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filecontents.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-listings.sty \
tex-marginnote.sty \
tex-mdframed.sty \
tex-needspace.sty \
tex-noindentafter.sty \
tex-textcomp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
