SUMMARY = "Show characters inside a box"
DESCRIPTION = "The package typesets a character inside a box, showing where \
reference point is, and displaying width, height, and depth \
information of the character. The output is like that on page \
63 of 'The TeXBook' or page 101 of 'The METAFONTbook'. The \
package itself is motivated by Knuth's macros in the file \
manmac.tex. Users should note that using a small size for the \
character inside the box does not make any sense: use a large \
size."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn29803"

RPM_NAME = "texlive-showcharinbox-2026.226.0.0.1svn29803-60.2.noarch.rpm"
RPM_HASH = "219bc0a9e242150dd035610ef6eccf6e67765152083a596d756b181783603e997fcce37e01fd2c001275c8a2dd282713fcb01cc9f20f6454e1709ba048b95d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showcharinbox.sty \
texlive-showcharinbox"

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
