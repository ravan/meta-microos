SUMMARY = "BibLaTeX citation style covers the citation and bibliography guidelines for art historians"
DESCRIPTION = "This citation style covers the citation and bibliography \
guidelines of the Kunsthistorisches Institut der Universitat \
Bonn for undergraduates. It introduces bibliography entry types \
for catalogs and features a tabular bibliography, among other \
things. Various options are available to change and adjust the \
outcome according to one's own preferences. The style is \
compatible with English and German."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn46637"

RPM_NAME = "texlive-biblatex-arthistory-bonn-2026.226.1.2svn46637-61.2.noarch.rpm"
RPM_HASH = "cde63d46d25d87e6ae55e92abfa1b075a44e2fd85eee8b837b9852980bb57310da640742227c0c6fbe6c340d27db68f3ad7b93e9bc9afb20201b102d5a066367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arthistory-bonn-english.lbx \
tex-arthistory-bonn-german.lbx \
tex-arthistory-bonn.bbx \
tex-arthistory-bonn.cbx \
texlive-biblatex-arthistory-bonn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-ibid.cbx \
tex-authoryear.bbx \
tex-csquotes.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
