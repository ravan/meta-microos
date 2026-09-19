SUMMARY = "Bib management tools"
DESCRIPTION = "A set of bibliography tools. Includes: aux2bib, a perl script \
which will take an .aux file and make a portable .bib file to \
go with it; bibify, a shell script that will optimise away one \
pass of the LaTeX/BibTeX cycle, in some cases; bibkey, a shell \
script that finds entries whose 'keyword' field matches the \
given keys (uses sed and awk); cleantex, a shell script to tidy \
up after a LaTeX run; looktex, a shell script to list entries \
that match a given regexp; makebib, a shell script to make an \
exportable .bib file from an existing (set of) .bib file(s) and \
an optional set of citations (uses sed) printbib, a shell \
script to make a dvi file from a .bib file, sorted by cite key, \
and including fields like 'keyword', 'abstract', and 'comment'. \
bib2html, a perl script that makes a browsable HTML version of \
a bibliography (several .bst files are supplied); and citekeys, \
a shell script that lists the citation keys of a .bib file."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-bibtools-2026.226.svn75712-61.2.noarch.rpm"
RPM_HASH = "5552468289e6d49e4e669afc229a2eba31020dc46329026562379df4f4a17313a7c83c860dfa3b6ad6ff4240ca5b572cc3b7a40a64fe5970de516704de549a28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtools"

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
