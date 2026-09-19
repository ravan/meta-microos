SUMMARY = "Variants of \\fbox and other games with boxes"
DESCRIPTION = "Provides variants of \\fbox: \\shadowbox, \\doublebox, \\ovalbox, \
\\Ovalbox, with helpful tools for using box macros and flexible \
verbatim macros. You can box mathematics, floats, center, \
flushleft, and flushright, lists, and pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-fancybox-2026.226.1.4svn77682-59.2.noarch.rpm"
RPM_HASH = "a949f66a4b22f0fb60b5ce6fa81ded5e9d40ded48643239314b9d32f1cebbfc69030fbe56600c5b5eeae46a23b3991085a3a4767cad2717563637a91178c4a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancybox.sty \
texlive-fancybox"

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
