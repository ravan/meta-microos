SUMMARY = "Process bibliographies (bib files) for LaTeX or other formats"
DESCRIPTION = "BibTeX allows the user to store his citation data in generic \
form, while printing citations in a document in the form \
specified by a BibTeX style, to be specified in the document \
itself (one often needs a LaTeX citation-style package, such as \
natbib, as well). BibTeX knows nothing about Unicode sorting \
algorithms or scripts, although it will pass on whatever bytes \
it reads. Its descendant bibtexu does support Unicode, via the \
ICU library. The older alternative bibtex8 supports 8-bit \
character sets. Another Unicode-aware alternative is the \
(independently developed) biber program, used with the BibLaTeX \
package to typeset its output."
LICENSE = "SUSE-TeX"

PV = "2026.226.0.0.99esvn77830"

RPM_NAME = "texlive-bibtex-2026.226.0.0.99esvn77830-61.2.noarch.rpm"
RPM_HASH = "92add08e65fb084dfd9b37fcacb53903be862e48a2c2d746a3febaba4f508283402e3e5ae32f3271faf7ccec596439f1dfb954265608d563ec54a947bc9314da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apalike.sty \
tex-apalike.tex \
texlive-bibtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibtex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
