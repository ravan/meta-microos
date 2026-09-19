SUMMARY = "Margin adjustment and detection of odd/even pages"
DESCRIPTION = "The package provides commands to change the page layout in the \
middle of a document, and to robustly check for typesetting on \
odd or even pages. Instructions for use are at the end of the \
file. The package is an extraction of code from the memoir \
class, whose user interface it shares. It is intended the this \
package will eventually replace the chngpage package, which is \
distributed with the package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn77682"

RPM_NAME = "texlive-changepage-2026.226.1.0csvn77682-59.2.noarch.rpm"
RPM_HASH = "f9c36109966cef9df5e58aa268d77a2b3b6f22891f130c0ba68eca3e3d5e43178d22c00e914fbf17ec564bbd2cb42277a6cffbcd9df046e68ea7c41bb1a29d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changepage.sty \
tex-chngpage.sty \
texlive-changepage"

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
