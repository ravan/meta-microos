SUMMARY = "Arrange text on a sheet to fold into a greeting card"
DESCRIPTION = "The package provides a simple means of producing greeting \
cards. It arranges four panels onto a single sheet so that when \
the sheet is folded twice the four panels are arranged as front \
cover, inside left and right pages, and back cover. It uses the \
textpos package for placement on the sheet and the graphicx \
package for the necessary rotation. The four panels are set in \
minipages for formatting by the user."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-gcard-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "5a3f200c3a5ec13717766e1b831007abbc2dc449e1a968edd7bf89f4f2bf9e20bde8f96ea63f32dea68face5b63313ce9f3aa096c54d8dfa928bf0dbe9845db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gcard.sty \
texlive-gcard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
