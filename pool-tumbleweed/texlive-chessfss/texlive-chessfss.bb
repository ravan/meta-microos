SUMMARY = "A package to handle chess fonts"
DESCRIPTION = "This package offers commands to use and switch between chess \
fonts. It uses the LaTeX font selection scheme (nfss). The \
package doesn't parse, format and print PGN input like e.g. the \
packages skak or texmate; the aim of the package is to offer \
writers of chess packages a bundle of commands for fonts, so \
that they don't have to implement all these commands for \
themselves. A normal user can use the package to print e.g. \
single chess symbols and simple diagrams. The documentation \
contains also a section about installation of chess fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn78101"

RPM_NAME = "texlive-chessfss-2026.226.1.2asvn78101-60.2.noarch.rpm"
RPM_HASH = "bee114c28f7d291da66803bae9b0c99bc47c5e927fdbc7694fd2327b102d645ce7adf42ecfb196537c8843d52dc5e0b72cf471c29608666e2ba45efec04dcea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chess-board-example-enc.enc \
tex-chess-fig-example-enc.enc \
tex-chessfss.sty \
tex-lsb1enc.def \
tex-lsb1skak.fd \
tex-lsb1skaknew.fd \
tex-lsb2enc.def \
tex-lsb2skak.fd \
tex-lsb2skaknew.fd \
tex-lsb3enc.def \
tex-lsb3skak.fd \
tex-lsb3skaknew.fd \
tex-lsbc1enc.def \
tex-lsbc1skaknew.fd \
tex-lsbc2enc.def \
tex-lsbc2skaknew.fd \
tex-lsbc3enc.def \
tex-lsbc3skaknew.fd \
tex-lsbc4enc.def \
tex-lsbc4skaknew.fd \
tex-lsbc5enc.def \
tex-lsbc5skaknew.fd \
tex-lsbenc.def \
tex-lsbskak.fd \
tex-lsbskaknew.fd \
tex-lsfenc.def \
tex-lsfskak.fd \
tex-lsfskaknew.fd \
tex-lsienc.def \
tex-lsiskak.fd \
tex-lsiskaknew.fd \
texlive-chessfss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
