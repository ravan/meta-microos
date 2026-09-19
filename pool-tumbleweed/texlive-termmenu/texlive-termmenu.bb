SUMMARY = "The package provides support for terminal-based menus using expl3"
DESCRIPTION = "When writing programs, it's often required to present the user \
with a list of options/actions. The user is then expected to \
select one of these options for the program to process. \
termmenu provides this mechanism for TeX. It requires only \
expl3 support, thus the l3kernel and l3packages are both \
required."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn76924"

RPM_NAME = "texlive-termmenu-2026.227.svn76924-62.2.noarch.rpm"
RPM_HASH = "5a320ec064bafc923c5e1424c382013c77107578b265d037d3ff9e7c0f0fb81335bcfacbb9f4343ffb7270903b130ca09e07b47ae5f497f6354313122c128b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termmenu.tex \
texlive-termmenu"

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
