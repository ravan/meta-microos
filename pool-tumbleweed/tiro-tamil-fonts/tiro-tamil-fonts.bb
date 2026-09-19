SUMMARY = "Tiro Tamil Fonts"
DESCRIPTION = "Tiro Tamil has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-tamil-fonts-1.52-2.7.noarch.rpm"
RPM_HASH = "2ade1f0693f678d633842de439819772f1a25e76eb61b021249b773d21d84c0afd5f3f23f4d20b46b0359902114492dec312a548b8792481210a573a0018a4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-tamil-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
