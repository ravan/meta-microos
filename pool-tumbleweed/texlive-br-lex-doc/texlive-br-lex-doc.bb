SUMMARY = "Documentation for texlive-br-lex"
DESCRIPTION = "This package includes the documentation for texlive-br-lex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44939"

RPM_NAME = "texlive-br-lex-doc-2026.226.svn44939-59.2.noarch.rpm"
RPM_HASH = "dc0af3b84a851ad70a31ca2e9e671df133a2678f6da342c29fdd0ee2603fa10b2ad3ab155c8316c772a698249fc4c8d07982af136785d2d92363156f50d8720d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-br-lex-doc-pt-BR \
texlive-br-lex-doc"

RDEPENDS:${PN} += ""

inherit rpm
