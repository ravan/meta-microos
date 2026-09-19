SUMMARY = "Semantic, keyval-based mathematics"
DESCRIPTION = "The SemanTeX package for LaTeX delivers a more semantic, \
systematized way of writing mathematics, compared to the \
classical math syntax in LaTeX. The system uses keyval syntax, \
and the user can define their own keys and customize the system \
down to the last detail. At the same time, care has been taken \
to make the syntax as simple, natural, practical, and \
lightweight as possible. Furthermore, the package has a \
companion package, called stripsemantex, which allows you to \
completely strip your documents of SemanTeX markup to prepare \
them e.g. for publication. The package is still in beta, but is \
considered feature-complete and more or less stable, so using \
it at this point should be safe. Still, suggestions, ideas, and \
bug reports are more than welcome!"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.525svn76924"

RPM_NAME = "texlive-semantex-2026.226.0.0.525svn76924-60.2.noarch.rpm"
RPM_HASH = "d21de770034dc814cfba8b85db64679dd9822d3519082f1d8e763198ccb03d04c4819411bd2526d429463e81f0fd96c2a1720efe65a6738c34626c843240935a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semantex.sty \
tex-stripsemantex.sty \
texlive-semantex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-leftindex.sty \
tex-semtex.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-semtex"

inherit rpm
