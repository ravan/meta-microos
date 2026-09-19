SUMMARY = "A Class for Typesetting Brazilian legal texts"
DESCRIPTION = "This class implements rules to typeset Brazilian legal texts. \
Its purpose is to be an easy-to-use implementation for the \
end-user."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44939"

RPM_NAME = "texlive-br-lex-2026.226.svn44939-59.2.noarch.rpm"
RPM_HASH = "c2f2ed90fd6efe35d02c5dd01c43af8ad81e13eba40439a56ff794e82eee6753da2cf33a621b7a28ebc7eaa496296d5acab8bdb91decd7c43fcf49a11dc21610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-br-lex.cls \
texlive-br-lex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-polyglossia.sty \
tex-textcase.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
