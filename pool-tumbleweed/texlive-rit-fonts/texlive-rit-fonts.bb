SUMMARY = "Malayalam fonts by Rachana Institute of Typography (RIT)"
DESCRIPTION = "The RIT font collection provides versions of 17 font families \
in Malayalam (the language spoken in the southern Indian state \
of Kerala) script in TrueType and WOFF2 formats. The fonts are: \
RIT Ala RIT Chingam RIT Ezhuthu RIT Indira RIT Karuna RIT \
Keralayeeam RIT Keram RIT Kutty RIT Lasya RIT Lekha RIT \
MeeraNew RIT Panmana RIT Rachana RIT Sundar RIT TN Joy RIT \
Thaara RIT Uroob A LaTeX package rit-fonts.sty that will help \
users to make use of these Unicode-compliant fonts in LaTeX \
documents with XeTeX or LuaTeX is also provided."
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn74984"

RPM_NAME = "texlive-rit-fonts-2026.226.1.0svn74984-60.4.noarch.rpm"
RPM_HASH = "f70546fa1b5c36c56cedc62ebc51dd8c15d356baa36d2997f6035e952ca0d31affe0670baf7f6e96e5119e83ae7de7d33cd4ffbffe198b22e9104a84e6e78c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rit-fonts.sty \
texlive-rit-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-polyglossia.sty \
tex-textcomp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-rit-fonts-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
