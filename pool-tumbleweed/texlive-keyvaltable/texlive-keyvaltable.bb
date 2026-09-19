SUMMARY = "Re-usable table layouts separating content and presentation"
DESCRIPTION = "The main goal of this package is to offer means for typesetting \
tables easily and yet still looking rather nicely in a way that \
separates content from presentation and with re-usable layout \
for tables of the same type. For this purpose, the package \
provides the environment KeyValTable, which allows one to \
typeset tables that have a previously defined column layout and \
whose rows can be produced in a key-value fashion."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn77682"

RPM_NAME = "texlive-keyvaltable-2026.226.2.3svn77682-63.2.noarch.rpm"
RPM_HASH = "4e57edd1593b5d5d5e8803e033d61f8f67001decc02ec777b876673facd127c20b98c959916cab4f681a3a9d9fb687afa1fdcd1623cf4be2b3f2e852f8f6600b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyvaltable.sty \
texlive-keyvaltable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-colortbl.sty \
tex-etoolbox.sty \
tex-trimspaces.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
