SUMMARY = "LaTeX tools and documenting facilities"
DESCRIPTION = "This is a versatile bundle of packages and classes for \
consistent formatting of control sequences, package options, \
source code examples, and writing a package manual (including \
an index containing the explained control sequences, options, \
ldots). The bundle also provides several other small ideas of \
mine such as a mechanism for providing abbreviations etc. Not \
at least it provides a number of programming tools. The \
intention behind this bundle mainly is a selfish one: \
documenting my own packages. The bundle contains an index style \
file cnltx.ist that should be placed in a directory in a TDS \
makeindex directory."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.15svn76924"

RPM_NAME = "texlive-cnltx-2026.226.0.0.15svn76924-60.2.noarch.rpm"
RPM_HASH = "42ab943c7f82b28bf672359b7062ced8382e04a33fa2fd675b26b7146ef6108e404c7f2b4249add6e05f1d1a840dc518146edf319887f5c277ce7eda8abc4010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cnltx-base.sty \
tex-cnltx-doc.cls \
tex-cnltx-example.sty \
tex-cnltx-listings.sty \
tex-cnltx-names.sty \
tex-cnltx-tools.sty \
tex-cnltx-translations.sty \
tex-cnltx.bbx \
tex-cnltx.cbx \
tex-cnltx.sty \
texlive-cnltx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-adjustbox.sty \
tex-alphabetic.bbx \
tex-alphabetic.cbx \
tex-beramono.sty \
tex-catchfile.sty \
tex-etoolbox.sty \
tex-fnpct.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-hyperref.sty \
tex-idxcmds.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-imakeidx.sty \
tex-libertine.sty \
tex-listings.sty \
tex-ltxcmds.sty \
tex-marginnote.sty \
tex-mdframed.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-pdftexcmds.sty \
tex-pgfopts.sty \
tex-ragged2e.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-textcomp.sty \
tex-translations.sty \
tex-trimspaces.sty \
tex-ulem.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
