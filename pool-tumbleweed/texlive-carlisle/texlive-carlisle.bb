SUMMARY = "David Carlisle's small packages"
DESCRIPTION = "Many of David Carlisle's more substantial packages stand on \
their own, or as part of the LaTeX latex-tools set; this set \
contains: Making dotless 'j' characters for fonts that don't \
have them; A method for combining the capabilities of longtable \
and tabularx; An environment for including Plain TeX in LaTeX \
documents; A jiffy to remove counters from other counters' \
reset lists (now obsolete as it has been incorporated into the \
LaTeX format); A jiffy to create 'slashed' characters for \
physicists."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59577"

RPM_NAME = "texlive-carlisle-2026.226.svn59577-59.2.noarch.rpm"
RPM_HASH = "0c56d0c1069ab9d46dfb9b85418bbdc7b95dcd82591dc4f623c3bd4dfb41e5ddb22556f31acef396a70065867353e9abd20408e5d693a8b04d5af582ac1d6388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dotlessj.sty \
tex-ltxtable.sty \
tex-plain.sty \
tex-remreset.sty \
tex-scalefnt.sty \
tex-slashed.sty \
texlive-carlisle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-longtable.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
