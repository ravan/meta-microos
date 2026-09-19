SUMMARY = "Tiro Kannada Fonts"
DESCRIPTION = "Tiro Kannada has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-kannada-fonts-1.52-2.7.noarch.rpm"
RPM_HASH = "dfefe85a1cdd57bf895aff8522ecb1b335bab5e9d04b7060f320a7aacb1176174dcc341221c34b4e4146eb30068ac6d7d1e7f9e0330516e4f0dd1a207901ff1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-kannada-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
