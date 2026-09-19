SUMMARY = "Cyrillic fonts that support LaTeX standard encodings"
DESCRIPTION = "The LH fonts address the problem of the wide variety of \
alphabets that are written with Cyrillic-style characters. The \
fonts are the original basis of the set of T2* and X2 encodings \
that are now used when LaTeX users need to write in Cyrillic \
languages. Macro support in standard LaTeX encodings is offered \
through the latex-cyrillic and t2 bundles, and the package \
itself offers support for other (more traditional) encodings. \
The fonts, in the standard T2* and X2 encodings are available \
in Adobe Type 1 format, in the CM-Super family of fonts. The \
package also offers its own LaTeX support for OT2 encoded \
fonts, CM bright shaped fonts and Concrete shaped fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5gsvn77838"

RPM_NAME = "texlive-lh-2026.226.3.5gsvn77838-61.2.noarch.rpm"
RPM_HASH = "6589fb630673d15935797819a67a119ed9223b8ebf949cfa3acd91244053fef8ff9939ceac04078f24198705582feb3d87740d7fbc2667903a9853b339c19651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labx1095.tfm \
tex-labx1200.tfm \
tex-labx1728.tfm \
tex-larm0600.tfm \
tex-larm0800.tfm \
tex-larm1095.tfm \
tex-larm1200.tfm \
tex-larm1728.tfm \
tex-lati1200.tfm \
tex-lh-lcy.sty \
tex-lh-lcyccr.sty \
tex-lh-lcyxccr.sty \
tex-lh-ot2.sty \
tex-lh-ot2ccr.sty \
tex-lh-ot2xccr.sty \
tex-lh-t2accr.sty \
tex-lh-t2axccr.sty \
tex-lh-t2bccr.sty \
tex-lh-t2bxccr.sty \
tex-lh-t2cccr.sty \
tex-lh-t2cxccr.sty \
tex-lh-x2ccr.sty \
tex-lh-x2xccr.sty \
tex-nfssfox.tex \
tex-testfox.tex \
tex-testkern.tex \
texlive-lh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-ec \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
