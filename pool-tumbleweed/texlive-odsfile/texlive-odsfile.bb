SUMMARY = "Read OpenDocument Spreadsheet documents as LaTeX tables"
DESCRIPTION = "The distribution includes a package and a lua library that can \
together read OpenDocument spreadsheet documents as LaTeX \
tables. Cells in the tables may be processed by LaTeX macros, \
so that (for example) the package may be used for drawing some \
plots. The package uses lua's zip library."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn77682"

RPM_NAME = "texlive-odsfile-2026.226.0.0.10svn77682-61.2.noarch.rpm"
RPM_HASH = "dc4b7abfd60c09f129f4a48625c276a8d895ae0a16291b73244d338727805326aff1e4d15cbcaed5e0daf0c09dbaf1e5f0b633a621f26a94db2a1541a2675464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-odsfile.sty \
texlive-odsfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
