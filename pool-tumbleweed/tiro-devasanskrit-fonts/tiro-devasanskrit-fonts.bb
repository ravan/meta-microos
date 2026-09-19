SUMMARY = "Tiro Devanagari Sanskrit Fonts"
DESCRIPTION = "Tiro Devanagari Sanskrit has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-devasanskrit-fonts-1.52-2.7.noarch.rpm"
RPM_HASH = "54ca908f466c424702cd51023acb04ef4496631abd37a7c23c4d387c610b337d3334b3be47d8ac4bf3f3a1c1ddb17caaa6bed4dbf6b2b6957d2e4c7f758c5dd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-devasanskrit-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
