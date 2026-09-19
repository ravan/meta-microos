SUMMARY = "Business cards with QR-Code"
DESCRIPTION = "What happens when you give your visiting card to someone? \
Either they manually type the text into their computer or \
mobile phone, or it will end up in a box and be forgotten. \
Nowadays data is required electronically, not on paper. Here is \
the solution: A visiting card with QR-Code that contains a full \
vcard so that it can be scanned with an app on the mobile phone \
and thereby automatically imported into the electronic \
contacts. This also works well when you are offline and \
bluetooth transfer fails. So here is the highly configurable \
business card or visiting card with full vcard as QR-Code, \
ready to send to online printers. You can specify the exact \
size of the paper and the content within the paper, including \
generation of crop marks. The package depends on the following \
other LaTeX packages: calc, crop, DejaVuSans, etoolbox, \
fontawesome, fontenc, geometry, kvoptions, marvosym, qrcode, \
varwidth, and wrapfig. The package needs XeLaTeX for working \
properly."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-businesscard-qrcode-2026.226.1.2svn76924-59.2.noarch.rpm"
RPM_HASH = "e13c988b63186dedc34f7251a28e3aeba0f923ec13a93c9f585ea286e70ffaa6329d23a08f73da459ba9dc32532ab5bef456036bcd5b79cfe414a4ef8b4fb63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-businesscard-qrcode.cls \
texlive-businesscard-qrcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-DejaVuSans.sty \
tex-calc.sty \
tex-crop.sty \
tex-etoolbox.sty \
tex-extarticle.cls \
tex-fontawesome.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-kvoptions.sty \
tex-marvosym.sty \
tex-qrcode.sty \
tex-varwidth.sty \
tex-wrapfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
