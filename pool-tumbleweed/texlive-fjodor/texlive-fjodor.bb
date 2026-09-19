SUMMARY = "A selection of layout styles"
DESCRIPTION = "The package provides several page layouts, selectable by \
package options."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn53207"

RPM_NAME = "texlive-fjodor-2026.226.svn53207-59.2.noarch.rpm"
RPM_HASH = "6a0e58e24a1e882986865c4413c280414ec9078aae425567422acab0672fee41041ebdddd1851cb4a84cea760b4d24c77fc70e20eb4f72df45740b0689c1c992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fjodor.sty \
texlive-fjodor"

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
