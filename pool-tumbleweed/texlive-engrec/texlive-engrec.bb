SUMMARY = "Enumerate with lower- or uppercase Greek letters"
DESCRIPTION = "This package provides two macros \\engrec and \\EnGrec to convert \
number arguments to lower case or upper case greek letters. \
They have the syntax of \\alph, i.e. \\engrec{a_counter}, \
\\EnGrec{a_counter}. Options are provided to work with the \
upgreek and fourier packages. Requires amstext."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-engrec-2026.226.1.1svn15878-61.4.noarch.rpm"
RPM_HASH = "4486ad996f9fce0496033f357f76d82a6ec4713bf00f9a440162f47ed9745cff9237bd666b3a3312c0022221cbb42b4e6efda571f08f2bd8de22dcd1158659e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engrec.sty \
texlive-engrec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-upgreek.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
