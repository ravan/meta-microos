SUMMARY = "Citation style for the German legal profession"
DESCRIPTION = "The package offers BibLaTeX support for citations in German \
legal texts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn64762"

RPM_NAME = "texlive-biblatex-jura2-2026.226.0.0.5svn64762-61.2.noarch.rpm"
RPM_HASH = "4cd535d5fabb0a73467cf32f4c34812dfa757186871f84142ebc8c20ffffd83c2dce9eb5724cac456bc391a9bc548280ae1c8cec2191946a0d934972068aff6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jura2.bbx \
tex-jura2.cbx \
texlive-biblatex-jura2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ext-authortitle-ibid.bbx \
tex-ext-authortitle-ibid.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
