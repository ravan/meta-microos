SUMMARY = "Traditional style Irish fonts"
DESCRIPTION = "In both lower and upper case 32 letters are defined (18 'plain' \
ones, 5 long vowels and 9 aspirated consonants). The ligature \
'agus' is also made available. The remaining characters \
(digits, punctuation and accents) are inherited from the \
Computer Modern family of fonts. The font definitions use code \
from the sauter fonts, so those fonts have to be installed \
before using eiad. OT1*.fd files are provided for use with \
LaTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-eiad-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "b6e3b73cccc9062a2eaf08d8da32c52390abec248b99c9b166d299535ad77116c4d5f6820e19dd6cff2ef98beec41701ef469b703dc84c0999107986ec3e463e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OT1eiad.fd \
tex-OT1eiadcc.fd \
tex-OT1eiadss.fd \
tex-OT1eiadtt.fd \
tex-eiadb10.tfm \
tex-eiadbx10.tfm \
tex-eiadbxi10.tfm \
tex-eiadbxsl10.tfm \
tex-eiadccsc10.tfm \
tex-eiadci10.tfm \
tex-eiadcr10.tfm \
tex-eiadcsc10.tfm \
tex-eiadcsl10.tfm \
tex-eiadcslc9.tfm \
tex-eiaddunh10.tfm \
tex-eiadff10.tfm \
tex-eiadfi10.tfm \
tex-eiadfib8.tfm \
tex-eiadi10.tfm \
tex-eiaditt10.tfm \
tex-eiadr10.tfm \
tex-eiadr12.tfm \
tex-eiadr17.tfm \
tex-eiadsl10.tfm \
tex-eiadsltt10.tfm \
tex-eiadss10.tfm \
tex-eiadssbx10.tfm \
tex-eiadssdc10.tfm \
tex-eiadssi10.tfm \
tex-eiadssq8.tfm \
tex-eiadssqi8.tfm \
tex-eiadtcsc10.tfm \
tex-eiadtt10.tfm \
tex-eiadvtt10.tfm \
texlive-eiad"

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
