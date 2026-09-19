SUMMARY = "Facilitates mass-mailing of postcards (junkmail)"
DESCRIPTION = "A modification of the standard LaTeX letter class which prints \
multiple, pre-stamped, 5.5'' by 3.5'' postcards (a US standard \
size) via the envlab and mailing packages. An address database \
is employed to address the front side of each postcard and a \
message is printed on the back side of all. An illustrative \
example is provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75878"

RPM_NAME = "texlive-postcards-2026.226.svn75878-59.2.noarch.rpm"
RPM_HASH = "0b307ab0ca03a5b8882545badba302f2ce8572bd1666a53e4cf5d4013affd57a78dfde6ddf9fe3d82176a35a5a338724e30f18aa2911126135c73aae6d84593b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-postcards.cls \
texlive-postcards"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-letter.cls \
tex-mailing.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
