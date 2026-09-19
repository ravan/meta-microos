SUMMARY = "A personal class for writing journals"
DESCRIPTION = "This LaTeX document class enables the user to turn simple pure \
text entries into a colorful and nicely formatted journal."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-jwjournal-2026.226.svn76924-63.2.noarch.rpm"
RPM_HASH = "d253e9f53ca90b50dba84c430a278b80d4bcc9ee4a612baed45ad5785782ec30af42a86484135d0abcadf4d2140bfdc69dc95190dd4cb4c4c11ed0c043d0b5a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jwjournal.cls \
texlive-jwjournal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ProjLib.sty \
tex-enumitem.sty \
tex-needspace.sty \
tex-tcolorbox.sty \
texlive \
texlive-einfart \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
