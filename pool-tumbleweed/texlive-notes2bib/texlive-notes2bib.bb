SUMMARY = "Integrating notes into the bibliography"
DESCRIPTION = "The package defines a new type of note, bibnote, which will \
always be added to the bibliography. The package allows \
footnotes and endnotes to be moved into the bibliography in the \
same way. The package can be used with natbib and BibLaTeX as \
well as plain LaTeX citations. Both sorted and unsorted \
bibliography styles are supported. The package uses the LaTeX 3 \
macros and the associated xpackages bundle. It also makes use \
of the e-TeX extensions (any post-2005 LaTeX distribution will \
provide these by default, but users of older systems may need \
to use an elatex command or equivalent). The package relies on \
LaTeX 3 support from the l3kernel and l3packages bundles."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0msvn77682"

RPM_NAME = "texlive-notes2bib-2026.226.2.0msvn77682-61.2.noarch.rpm"
RPM_HASH = "5cc6f9b86e08bdb379544d55f14851bb58a71ba3a6a023c553a9342c59e3b04e3299156793d39e2cd147041173671dc99e8bebee9eb40b8d77e7edde3c9c2bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-notes2bib.sty \
texlive-notes2bib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
