SUMMARY = "Verifies definitions are unchanged, such as before patching"
DESCRIPTION = "This package is intended for package authors who patch code \
from other packages. To improve reliability, the verifycommand \
package provides a way to verify that macros or environments \
have not changed. This allows a package author to check before \
patching a definition. If a definition is not as expected, a \
warning is issued. At the end of the compile, a list of all \
changed definitions is displayed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11svn74512"

RPM_NAME = "texlive-verifycommand-2026.226.1.11svn74512-60.2.noarch.rpm"
RPM_HASH = "26eecf03c5488e7cbdfdcfc99665ab88d776dc926adf7c366be5cddae201fcd8473dec8a4b1bf801b90145aef28e0d6d2d347bddb7315afabe7819caa865b3f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verifycommand.sty \
texlive-verifycommand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-iftex.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
