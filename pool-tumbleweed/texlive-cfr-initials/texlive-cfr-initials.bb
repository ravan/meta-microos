SUMMARY = "LaTeX packages for use of initials"
DESCRIPTION = "This is a set of 23 tiny packages designed to make it easier to \
use fonts from the initials package in LaTeX, e.g. with the \
lettrine package. It is a response to comments on an answer at \
TeX StackExchange requesting sample package files for others to \
copy. I had previously assumed these were too trivial to be of \
interest, but if they would be useful, then I would prefer them \
to be generally available via CTAN."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn75712"

RPM_NAME = "texlive-cfr-initials-2026.226.1.01svn75712-59.2.noarch.rpm"
RPM_HASH = "a781c025c21af3675e1e200f3cf5f7f038010905d0a774d1c309c84310e80a2cb84ac4a89523d58d11f0b2736c7c0350c6b45c3b7c7cbdd564b9af047a97b191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Acorn.sty \
tex-AnnSton.sty \
tex-ArtNouv.sty \
tex-ArtNouvc.sty \
tex-Carrickc.sty \
tex-Eichenla.sty \
tex-Eileen.sty \
tex-EileenBl.sty \
tex-Elzevier.sty \
tex-GotIn.sty \
tex-GoudyIn.sty \
tex-Kinigcap.sty \
tex-Konanur.sty \
tex-Kramer.sty \
tex-MorrisIn.sty \
tex-Nouveaud.sty \
tex-Romantik.sty \
tex-Rothdn.sty \
tex-Royal.sty \
tex-Sanremo.sty \
tex-Starburst.sty \
tex-Typocaps.sty \
tex-Zallman.sty \
texlive-cfr-initials"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-Acorn.fd \
tex-AnnSton.fd \
tex-ArtNouv.fd \
tex-ArtNouvc.fd \
tex-Carrickc.fd \
tex-Eichenla.fd \
tex-Eileen.fd \
tex-EileenBl.fd \
tex-Elzevier.fd \
tex-GotIn.fd \
tex-GoudyIn.fd \
tex-Kinigcap.fd \
tex-Konanur.fd \
tex-Kramer.fd \
tex-MorrisIn.fd \
tex-Nouveaud.fd \
tex-Romantik.fd \
tex-Rothdn.fd \
tex-RoyalIn.fd \
tex-Sanremo.fd \
tex-Starburst.fd \
tex-Typocaps.fd \
tex-Zallman.fd \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
