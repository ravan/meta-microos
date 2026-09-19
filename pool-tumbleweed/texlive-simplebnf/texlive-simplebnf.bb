SUMMARY = "A simple package to format Backus-Naur form (BNF)"
DESCRIPTION = "This package provides a simple way for typesetting grammars in \
Backus-Naur form (BNF). The included bnf environment parses BNF \
expressions (possibly annotated), so users can write readable \
BNF expressions in their documents. It features a flexible \
configuration system, allowing for the customization of the \
domain-specific language (DSL) used in typesetting the grammar. \
Additionally, the package comes with sensible defaults. The \
package requires expl3, xparse, mathtools, and tabularray.."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-simplebnf-2026.226.1.0.1svn76924-60.2.noarch.rpm"
RPM_HASH = "0a6ee8114ccfdb45b22edcb40dae8fe9b7b13c5fda49d2089a44311db7ed356851fcd5e29298542e14078ba90f3ab3e713ab6142236a220a0e5dc23527ba4995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplebnf.sty \
texlive-simplebnf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-mathtools.sty \
tex-tabularray.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
