SUMMARY = "Optimizing workflow involving odes and pdes"
DESCRIPTION = "This package is the solution no one asked for, to a problem \
nobody had. Have you ever thought to yourself 'wow, I sure do \
dislike having to remember multiple macros for my odes and \
pdes' and the author of this package has to agree, \
wholeheartedly. In the modern world of 'tik-toking' and 'family \
guy surfing' our brains have rotted beyond salvage for even \
basic levels of cognitive recall. This package aims to fix \
this, through two macros that have been set to each have an \
identical form and function with an emphasis on intuitive use. \
Through setting options, the multiple common notational style \
are easily swapped between, all by a single option. You're \
Welcome."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn69485"

RPM_NAME = "texlive-odesandpdes-2026.226.1.0.0svn69485-61.2.noarch.rpm"
RPM_HASH = "e2d336f5be52906316195da17af6163b22b5928c790a1b04df8e14791382a58d7fdfe9733d04afa1395d89e8f5e864015cd10de4178981efdab2ff0df68b4aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-odesandpdes.sty \
texlive-odesandpdes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
