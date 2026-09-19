SUMMARY = "Variants of last page labels"
DESCRIPTION = "The package was designed as an extension of the lastpage \
package -- as well as that package's LastPage label (created in \
hook enddocument/afterlastpage, formerly \\AtEndDocument) it \
adds a VeryLastPage (created in the same hook, but formerly \
\\AfterLastShipout). When more than one page numbering scheme is \
in operation (as in a book class document with frontmatter), \
the labels above do not give the total number of pages, so the \
package also provides labels pagesLTS.<numbering scheme>, where \
the numbering scheme is arabic, roman, etc. The package relies \
on the undolabl package. Note: The 'LTS' of the package name \
stands for: 'L' = number of Last page, 'T' = Total number of \
pages, 'S' = page numbering Schemes (roman, arabic, ...)"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0gsvn76054"

RPM_NAME = "texlive-pageslts-2026.226.2.0gsvn76054-58.2.noarch.rpm"
RPM_HASH = "4d15a56f5c62a597a2856215df0f81f65935f8a4024233c10735d3afa445d23823ca524c66e879374ab6ad3244840a81324dac84d180fe3eec25b70236901906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pageslts.sty \
texlive-pageslts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-undolabl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
