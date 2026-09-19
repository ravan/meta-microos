SUMMARY = "Dina Programming Font"
DESCRIPTION = "Dina is a monospace bitmap font, primarily aimed at programmers. \
It is relatively compact to allow a lot of code on screen, \
while (hopefully) clear enough to remain readable even at high resolutions."
LICENSE = "MIT"

PV = "2.92.0"

RPM_NAME = "dina-bitmap-fonts-2.92.0-2.22.noarch.rpm"
RPM_HASH = "ca1d99f37f8840522feee998c0da00d8f89651554be7868007d29b5296fa0b3ce97912fb1528895de8fd154ef7340463b080615f8d36b70ef4c0ec2a1d54b137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dina-bitmap-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
