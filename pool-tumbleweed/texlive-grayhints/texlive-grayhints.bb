SUMMARY = "Produce 'gray hints' to a variable text field"
DESCRIPTION = "The package provides JavaScript code snippets to create 'gray \
hints'. Gray hints, as the author terms them, are text that \
appears initially in a text field that gives a short hint as to \
what the contents of the text field should be. For example, a \
text field might contain the hint 'First Name', or a date field \
might read 'yyyy/mm/dd'. As soon as the field comes into focus, \
the hint disappears. It reappears when the field is blurred and \
the user did not enter any text into the field. The package \
works for dvips/Distiller, pdfLaTeX, LuaLaTeX, and XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn49052"

RPM_NAME = "texlive-grayhints-2026.226.svn49052-60.4.noarch.rpm"
RPM_HASH = "d92d77bcc5861ff9b7b6b6af1fb412652791b76968980a317ecd8f27b9ed49eaa9e4ecc6d64e95ce0565d40da9381ad4fff4703ae7a81661b716066b094fa724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grayhints.sty \
texlive-grayhints"

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
