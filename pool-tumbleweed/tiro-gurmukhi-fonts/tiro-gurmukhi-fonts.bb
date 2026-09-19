SUMMARY = "Tiro Gurmukhi Fonts"
DESCRIPTION = "Tiro Gurmukhi has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-gurmukhi-fonts-1.52-2.7.noarch.rpm"
RPM_HASH = "98f949a10b8a99f3aa6cfdd553c7cc623378a29de621009aefc8642a70ff2c838737ce7821f4cda421bce6e220d46fe435ff71588dcefb2b921fc37aeeb68eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-gurmukhi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
