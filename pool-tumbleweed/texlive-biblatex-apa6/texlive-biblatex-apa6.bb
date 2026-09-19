SUMMARY = "BibLaTeX citation and reference style for APA 6th Edition"
DESCRIPTION = "This is a fairly complete BibLaTeX style (citations and \
references) for APA (American Psychological Association) 6th \
Edition conformant publications. It implements and automates \
most of the guidelines in the APA 6th edition style guide for \
citations and references. An example document is also given \
which typesets every citation and reference example in the APA \
6th edition style guide. This is a legacy style for 6th Edition \
documents. Please use the BibLaTeX-apa style package for the \
latest APA edition conformance."
LICENSE = "LPPL-1.0"

PV = "2026.226.8.5svn56209"

RPM_NAME = "texlive-biblatex-apa6-2026.226.8.5svn56209-61.2.noarch.rpm"
RPM_HASH = "576774ec37ba0a9e1b81c8e46352fc90f7f1dc8f648111a56fa9bce9c2050d7e3401dd682c7ee5c451c6d6eee3b3c37fe02696461be378b085c6a099eb2682e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-apa6.lbx \
tex-apa6.bbx \
tex-apa6.cbx \
tex-austrian-apa6.lbx \
tex-brazilian-apa6.lbx \
tex-british-apa6.lbx \
tex-danish-apa6.lbx \
tex-dutch-apa6.lbx \
tex-english-apa6.lbx \
tex-french-apa6.lbx \
tex-galician-apa6.lbx \
tex-german-apa6.lbx \
tex-greek-apa6.lbx \
tex-italian-apa6.lbx \
tex-naustrian-apa6.lbx \
tex-ngerman-apa6.lbx \
tex-norsk-apa6.lbx \
tex-norwegian-apa6.lbx \
tex-nswissgerman-apa6.lbx \
tex-nynorsk-apa6.lbx \
tex-portuguese-apa6.lbx \
tex-russian-apa6.lbx \
tex-slovene-apa6.lbx \
tex-spanish-apa6.lbx \
tex-swedish-apa6.lbx \
tex-swissgerman-apa6.lbx \
texlive-biblatex-apa6"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
