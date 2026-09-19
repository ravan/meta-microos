SUMMARY = "Macros for introductory physics and astronomy"
DESCRIPTION = "The package contains commands for students and teachers of \
introductory physics. Commands for physical quantities \
intelligently handle SI units so the user need not do so. There \
are other features that should make LaTeX easy for introductory \
physics students. The name of the package can be pronounced as \
'M&I' and refers to the physics textbook Matter & Interactions."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2.2svn76924"

RPM_NAME = "texlive-mandi-2026.226.3.2.2svn76924-59.2.noarch.rpm"
RPM_HASH = "3d9d2301800a364e5b8ee40ad055373f8c9034c366c3ce42b9c53056a52eeff2daca2629581e1d25dd9cc850cdfd066a27db544aff9448a37950325ccbd01e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mandi.sty \
tex-mandiexp.sty \
tex-mandistudent.sty \
texlive-mandi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-enumitem.sty \
tex-eso-pic.sty \
tex-esvect.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-makebox.sty \
tex-mathtools.sty \
tex-nicematrix.sty \
tex-pgfopts.sty \
tex-qrcode.sty \
tex-tcolorbox.sty \
tex-tensor.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
