SUMMARY = "Tools to load and manipulate data"
DESCRIPTION = "The tools comprise the packages: datatool-base.sty: the \
underlying base package used by all the other packages in this \
bundle; datatool.sty: databases may be created using LaTeX \
commands or by importing external files; they may be sorted \
numerically or alphabetically; repetitive operations (such as \
mail merging) may be performed on each row of a database, \
subject to conditions to exclude particular rows; commands are \
provided to examine database elements, and to convert formats \
(for example, to convert a numeric element to a format \
compatible with l3fp or the fp package; datapie.sty: a database \
may be represented as a pie chart; flexible options allow \
colouring of the chart, and annotation hooks are available; \
dataplot.sty: a database may be represented as a 2-dimensional \
scatter or line plot; flexible options control of the plot's \
overall appearance, and of legends and other extra information; \
databar.sty: a database may be represented as a bar chart; \
overall appearance, colouring and annotation are controllable; \
datagidx.sty: provides a way of indexing or creating \
glossaries/lists of abbreviations that uses TeX to do the \
sorting and collating instead of using an external indexing \
application, such as xindy or makeindex (although you may \
prefer \\printnoidxglossary now provided by the glossaries \
package); databib.sty: a bibliography may be loaded into a \
datatool database, and manipulated there before being printed \
(this permits a LaTeX-based route to printing bibliographies in \
formats for which no BibTeX style is available, although \
biblatex is now the better route); and person.sty: provides \
support for displaying a person's name and pronoun in a \
document, thus avoiding cumbersome use of 'he/she', etc. The \
drawing packages make use of PGF/TikZ for their output. \
Localisation support needs to be installed separately. See \
datatool-regions and datatool-english. The bundle supersedes \
and replaces the author's csvtools bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4.3svn77021"

RPM_NAME = "texlive-datatool-2026.226.3.4.3svn77021-61.2.noarch.rpm"
RPM_HASH = "621708f9dcd737d4ee4e370be7ee302c86f8ae5f817a349b3a9e5b35ea196d8aa9150df5c0d337881f5781ec50fd2605b4a01c1c9c0bf6d6d4b60ae2ec585850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-databar-2019-09-27.sty \
tex-databar.sty \
tex-databib-2019-09-27.sty \
tex-databib.sty \
tex-datagidx-2019-09-27.sty \
tex-datagidx.sty \
tex-datapie-2019-09-27.sty \
tex-datapie.sty \
tex-dataplot-2019-09-27.sty \
tex-dataplot.sty \
tex-datatool-2019-09-27.sty \
tex-datatool-base-2019-09-27.sty \
tex-datatool-base.sty \
tex-datatool-fp-2019-09-27.sty \
tex-datatool-fp.def \
tex-datatool-fp.sty \
tex-datatool-l3fp.def \
tex-datatool-latin1.ldf \
tex-datatool-lua.def \
tex-datatool-pgfmath-2019-09-27.sty \
tex-datatool-pgfmath.def \
tex-datatool-pgfmath.sty \
tex-datatool-undetermined.ldf \
tex-datatool-utf8.ldf \
tex-datatool.sty \
tex-person-2019-09-27.sty \
tex-person.sty \
texlive-datatool"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-mfirstuc.sty \
tex-multicol.sty \
tex-pgfkeys.sty \
tex-pgfmath.sty \
tex-pgfrcs.sty \
tex-substr.sty \
tex-textcase.sty \
tex-tikz.sty \
tex-tracklang.sty \
tex-xfor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-fp \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-substr \
texlive-xfor \
texlive-xkeyval"

inherit rpm
