SUMMARY = "Extensions to theorem environments"
DESCRIPTION = "The bundle provides several packages for commonly-needed \
support for typesetting theorems. The packages should work with \
kernel theorems (theorems 'out of the box' with LaTeX), and the \
theorem and amsthm packages. Features of the bundle include: a \
key-value interface to \\newtheorem; a \\listoftheorems command; \
hyperref and autoref compatibility; a mechanism for restating \
entire theorems in a single macro call."
LICENSE = "LPPL-1.0"

PV = "2026.227.76svn77682"

RPM_NAME = "texlive-thmtools-2026.227.76svn77682-62.2.noarch.rpm"
RPM_HASH = "aaa67afab21de39d2de32bfc78dbf3055617510bd8a1b3ee127027510367210773f7d822a18dda08d47dd78efb951fc20db700a8b4a6d1182c76c9086c7d04d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aliasctr.sty \
tex-parseargs.sty \
tex-thm-amsthm.sty \
tex-thm-autoref.sty \
tex-thm-beamer.sty \
tex-thm-kv.sty \
tex-thm-listof.sty \
tex-thm-llncs.sty \
tex-thm-ntheorem.sty \
tex-thm-patch.sty \
tex-thm-restate.sty \
tex-thmdef-mdframed.sty \
tex-thmdef-shaded.sty \
tex-thmdef-thmbox.sty \
tex-thmtools.sty \
tex-unique.sty \
texlive-thmtools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-keyval.sty \
tex-kvsetkeys.sty \
tex-mdframed.sty \
tex-remreset.sty \
tex-shadethm.sty \
tex-thmbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
