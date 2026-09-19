SUMMARY = "Include a wide range of material in PDF tooltips"
DESCRIPTION = "The package was inspired by the cooltooltips package. In \
contrast to cooltooltips, fancytooltips allows inclusion of \
tooltips which contain arbitrary TeX material or a series of \
TeX materials (animated graphics) from an external PDF file. To \
see the tooltips, you have to open the files in Adobe Reader. \
The links and JavaScripts are inserted using eforms package \
from the AcroTeX bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn68931"

RPM_NAME = "texlive-fancytooltips-2026.226.1.8svn68931-59.2.noarch.rpm"
RPM_HASH = "467a4d791861f816f22660255fe69017f7bb79859b5f427f04c7ac4da4f5f513de740534e416261b3267b776d057b418bc9e6e70bb2f1d6905c9071e68de16fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancytooltips.sty \
texlive-fancytooltips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-eso-pic.sty \
tex-graphicx.sty \
tex-ocg.sty \
tex-transparent.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
