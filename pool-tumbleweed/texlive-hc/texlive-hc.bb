SUMMARY = "Replacement for the LaTeX classes"
DESCRIPTION = "A set of replacements for the default LaTeX classes, based upon \
the Koma-Script bundle and the seminar class. Includes hcart, \
hcreport, hcletter, and hcslides."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-hc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "39793c534d36e9e85b588c3b1709dcf33f12c204b9f780fd48e54c2ebf623e22ca7e01388e899741d3c9082fafd5009a5f27ce595bb1109a373e517602a6c880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hcart.cls \
tex-hcletter.cls \
tex-hcreport.cls \
tex-hcslides.cls \
texlive-hc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fancybox.sty \
tex-fancyref.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-mathpple.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-palatino.sty \
tex-pifont.sty \
tex-truncate.sty \
tex-typearea.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
