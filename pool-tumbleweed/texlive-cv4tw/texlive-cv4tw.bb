SUMMARY = "LaTeX CV class, with extended details"
DESCRIPTION = "The class offers entries for assets and social networks; \
customizable styles are provided. The class comes with no \
documentation, but a worked example offers some guidance."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn34577"

RPM_NAME = "texlive-cv4tw-2026.226.0.0.2svn34577-61.2.noarch.rpm"
RPM_HASH = "459c5e091e60883e379874366d798d9c73b91687ebc72cd28ca965794d8291ae131066edf48c7c2b8d2792a3f25b1c1f9d9cb7398df37c547a4a65eb20a74e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cv4tw-scheme.sty \
tex-cv4tw-theme-compact.sty \
tex-cv4tw-theme-core.sty \
tex-cv4tw-theme-sharp.sty \
tex-cv4tw-theme-simple.sty \
tex-cv4tw.cls \
texlive-cv4tw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-boxedminipage.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontawesome.sty \
tex-fontspec.sty \
tex-forloop.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lastpage.sty \
tex-libertine.sty \
tex-multicol.sty \
tex-needspace.sty \
tex-newenviron.sty \
tex-pbox.sty \
tex-pifont.sty \
tex-realboxes.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
