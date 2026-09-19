SUMMARY = "Quote verbatim text without white space formatting"
DESCRIPTION = "This package provides an environment for displaying block text \
with special characters, such as verbatim quotes from a referee \
report which may contain pseudo-(La)TeX code. This behaves like \
a verbatim environment, except that it displays its content as \
normal paragraph content, ignoring any white space \
preformatting."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41869"

RPM_NAME = "texlive-phfquotetext-2026.226.1.0svn41869-58.2.noarch.rpm"
RPM_HASH = "53f107f5e14e6a46caf8a8c369de308fbd3fcf5fa2be57acf8c86b7dbe416541913d9795bfc28dabe0c428dc18f422cc529e9d9eac553e08f8ac5a20dd528e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfquotetext.sty \
texlive-phfquotetext"

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
