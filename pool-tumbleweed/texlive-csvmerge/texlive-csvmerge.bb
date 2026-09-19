SUMMARY = "Merge TeX code with csv data"
DESCRIPTION = "This package provides macros for processing a csv spreadsheet \
file with a minimum of configuration for the csv file. The \
first row names the columns and the remaining rows are data. \
This data can be merged with TeX code residing in an auxiliary \
file and the process repeated for each data row. There is one \
macro to set things up, one to extract the data, and one to \
tell if the field is empty or not. The documentation contains \
examples."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51857"

RPM_NAME = "texlive-csvmerge-2026.226.1.0svn51857-61.2.noarch.rpm"
RPM_HASH = "b1b9e62bfe099071b6cbd67eaca661ca951b0896781c031cb0910dfe7201620b201a7abfb48498094f682363fd8394e4fbccc834a7f9a2ade583960f2269a079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csvmerge.sty \
texlive-csvmerge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-stringstrings.sty \
tex-trimspaces.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
