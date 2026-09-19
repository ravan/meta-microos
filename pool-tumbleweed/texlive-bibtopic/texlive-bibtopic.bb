SUMMARY = "Include multiple bibliographies in a document"
DESCRIPTION = "The package allows the user to include several bibliographies \
covering different 'topics' or bibliographic material into a \
document (e.g., one bibliography for primary literature and one \
for secondary literature). The package provides commands to \
include either all references from a .bib file, only the \
references actually cited or those not cited in your document. \
The user has to construct a separate .bib file for each \
bibliographic 'topic', each of which will be processed \
separately by BibTeX. If you want to have bibliographies \
specific to one part of a document, see the packages bibunits \
or chapterbib."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-bibtopic-2026.226.1.1asvn77682-61.2.noarch.rpm"
RPM_HASH = "408f3ec29f7c59d005ac2aa54b1111e26ea0fd320149024835b3f96dd3ae779516a7213c907d937d22382b92a72a0fb5c2206924946cf8c9067dc15455ec0536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibtopic.sty \
texlive-bibtopic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
