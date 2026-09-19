SUMMARY = "A collection of general packages for LaTeX"
DESCRIPTION = "The NCCtools bundle contains many packages for general use \
under LaTeX; many are also used by NCC LaTeX. The bundle \
includes tools for: executing commands after a package is \
loaded; watermarks; counter manipulation (dynamic counters, \
changing counter numbering with another counter); improvements \
to the description environment; hyphenation of compound words; \
new levels of footnotes; space-filling patterns; 'poor man's' \
Black Board Bold symbols; alignment of the content of a box; \
use comma as decimal separator; boxes with their own crop \
marks; page cropmarks; improvements to fancy headers; float \
'styles', mini floats, side floats; manually marked footnotes; \
extension of amsmath; control of paragraph skip; an envelope to \
the graphicx package; dashed and multiple rules; alternative \
techniques for declarations of sections, captions, and \
toc-entries; generalised text-stretching; generation of new \
theorem-like environments; control of the text area; centred \
page layouts; and un-numbered top-level section."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5.3svn51810"

RPM_NAME = "texlive-ncctools-2026.226.3.5.3svn51810-61.2.noarch.rpm"
RPM_HASH = "ab561f0897b38bc9f688baa2b733792277f2a9c46db9c9295ab1d3d0795190c85a901ecf488b81b7fd8c7a518a06a58db4a060be2a13ae9be3663645ff0fff09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afterpackage.sty \
tex-dcounter.sty \
tex-desclist.sty \
tex-extdash.sty \
tex-manyfoot.sty \
tex-mboxfill.sty \
tex-nccbbb.sty \
tex-nccboxes.sty \
tex-ncccomma.sty \
tex-ncccropbox.sty \
tex-ncccropmark.sty \
tex-nccfancyhdr.sty \
tex-nccfloats.sty \
tex-nccfoots.sty \
tex-nccmath.sty \
tex-nccparskip.sty \
tex-nccpic.sty \
tex-nccrules.sty \
tex-nccsect.sty \
tex-nccstretch.sty \
tex-nccthm.sty \
tex-textarea.sty \
tex-tocenter.sty \
tex-topsection.sty \
tex-watermark.sty \
texlive-ncctools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsgen.sty \
tex-amsmath.sty \
tex-graphicx.sty \
tex-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
