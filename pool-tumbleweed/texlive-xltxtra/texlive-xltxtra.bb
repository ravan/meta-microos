SUMMARY = "'Extras' for LaTeX users of XeTeX"
DESCRIPTION = "This package was previously used to provide a number of \
features that were useful for typesetting documents with \
XeLaTeX. Many of those features have now been incorporated into \
the fontspec package and other packages, but the package \
persists for backwards compatibility. Nowadays, loading xltxtra \
will: load the fontspec, metalogo, and realscripts packages; \
redefine \\showhyphens so it works correctly; and define two \
extra commands: \\vfrac and \\namedglyph."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-xltxtra-2026.226.0.0.7svn77682-59.4.noarch.rpm"
RPM_HASH = "bc15b23ffde41efbdfcc21ad9d2a7d4e184c26f6eadb335d6e05b53624f57375adc3726662c1cea417db6004adf47eec64f152b830db0a144f9480c6a68fa865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xltxtra.sty \
texlive-xltxtra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-metalogo.sty \
tex-realscripts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-metalogo \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
