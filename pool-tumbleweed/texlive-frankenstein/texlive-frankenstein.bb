SUMMARY = "A collection of LaTeX packages"
DESCRIPTION = "Frankenstein is a bundle of LaTeX packages serving various \
purposes and a BibTeX bibliography style. Descriptions are \
given under the individual packages: abbrevs, achicago package, \
achicago bibstyle, attrib, blkcntrl, compsci, dialogue, lips, \
moredefs, newclude, slemph, titles."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-frankenstein-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "453839b5bc403995da335b0859749cf78da461090b95633686c8f25bb8cb62e6a1b2b023dbdf7918b00308a9ee7a8a70095a828a5897a94893831396b3a8146f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abbrevs.cfg \
tex-abbrevs.sty \
tex-achicago.sty \
tex-attrib.sty \
tex-blkcntrl.sty \
tex-compsci.cfg \
tex-compsci.sty \
tex-dialogue.sty \
tex-lips.sty \
tex-moredefs.sty \
tex-newclude.sty \
tex-slemph.cfg \
tex-slemph.sty \
tex-titles.cfg \
tex-titles.sty \
texlive-frankenstein"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
