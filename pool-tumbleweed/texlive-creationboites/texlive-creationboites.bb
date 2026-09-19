SUMMARY = "Macros to create simple tcolorbox with some customizations"
DESCRIPTION = "This package provides some macros to create sampleboxes with \
tcolorbox : a macro \\CreationBoite to create the box; a macro \
\\ParamBoites to modify some parameters; possibility to modify \
'deeply' the boxes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn77768"

RPM_NAME = "texlive-creationboites-2026.226.0.0.20asvn77768-61.2.noarch.rpm"
RPM_HASH = "6dca3b61af728b1b3f82a29bb7c884a449c0d687c92a5c32dd94ab9353f3e632aff9ac273beec888fd60413221fa363856fec5acdee72b2909690b66100abce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CreationBoites.sty \
texlive-creationboites"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontawesome5.sty \
tex-fontawesome6.sty \
tex-fontawesome7.sty \
tex-simplekv.sty \
tex-tcolorbox.sty \
tex-twemojis.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
