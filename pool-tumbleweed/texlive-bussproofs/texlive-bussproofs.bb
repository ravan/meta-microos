SUMMARY = "Proof trees in the style of the sequent calculus"
DESCRIPTION = "The package allows the construction of proof trees in the style \
of the sequent calculus and many other proof systems. One novel \
feature of the macros is they support the horizontal alignment \
according to some centre point specified with the command \
\\fCenter. This is the style often used in sequent calculus \
proofs. The package works in a Plain TeX document, as well as \
in LaTeX; an exposition of the commands available is given in \
the package file itself."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-bussproofs-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "6da8bd9cf74debd8ccdf4124de77580722c922321c5f0620eb5f0bbcc650338339069a9a691c7ba52533d2ff3f35ecc4506c467fa25555402ceb6f8efe89b5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bussproofs.sty \
texlive-bussproofs"

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
