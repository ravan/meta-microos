SUMMARY = "Tools to create bibliographies in TeX"
DESCRIPTION = "The package extracts information in bib files, makes it \
available in the current document, and sorts lists of entries \
according to that information and the user's specifications. \
Citation and bibliography styles can then be written directly \
in TeX, without any use of BibTeX. Creating references thus \
depends entirely on the user's skill in TeX. The package works \
with all formats that use plain TeX's basic syntactic sugar; \
the distribution includes a third-party file for ConTeXt and a \
style file for LaTeX. As an example of use, an Author (Year) \
style is given in a separate file and explained in the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn19880"

RPM_NAME = "texlive-librarian-2026.226.1.0svn19880-61.2.noarch.rpm"
RPM_HASH = "e0692f2efdded00d12685bb3bcdc285f5f50702d547beb517229cce2a6385c09e6a72e078f160876f5a425b699a3bab1b18746093c77d462d7a957733d474360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-librarian.sty \
tex-librarian.tex \
tex-t-librarian.tex \
texlive-librarian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
