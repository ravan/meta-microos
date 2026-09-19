SUMMARY = "Typesetting linear programming formulations and sets of equations"
DESCRIPTION = "The package is designed to aid the author writing linear \
programming formulations, one restriction at a time. With the \
package, one can easily label equations, formulations can span \
multiple pages and several elements of the layout (such as \
spacing, texts and equation tags) are also customizable. \
Besides linear programming formulations, this package can also \
be used to display any series of aligned equations with easy \
labeling/referencing and other customization options."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn36918"

RPM_NAME = "texlive-lpform-2026.226.svn36918-61.2.noarch.rpm"
RPM_HASH = "2a6d1aa8b9adb33fbb4c2ba5c23fc85a794346e786c361a81dda0fce18d9397e90784db172e1280fd81c9b910ccf3033547b628a998f9166e1938d175403d5a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lpform.sty \
texlive-lpform"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
