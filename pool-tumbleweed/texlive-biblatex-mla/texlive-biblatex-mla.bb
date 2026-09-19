SUMMARY = "MLA style files for BibLaTeX"
DESCRIPTION = "The package provides BibLaTeX support for citations in the \
format specified by the MLA handbook."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1asvn62138"

RPM_NAME = "texlive-biblatex-mla-2026.226.2.1asvn62138-61.2.noarch.rpm"
RPM_HASH = "d01b358d630aff4f0e5a262bec06448d815e4915c725650aff484af968e3578c5b7dd8b7180633c7912f0e1e40c2192c0661c0844090cac6f328399065dfcd98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-mla.lbx \
tex-english-mla.lbx \
tex-italian-mla.lbx \
tex-mla-footnotes.cbx \
tex-mla-new.bbx \
tex-mla-new.cbx \
tex-mla-strict.bbx \
tex-mla-strict.cbx \
tex-mla.bbx \
tex-mla.cbx \
tex-mla7.bbx \
tex-mla7.cbx \
tex-portuguese-mla.lbx \
tex-spanish-mla.lbx \
texlive-biblatex-mla"

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
