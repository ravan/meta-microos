SUMMARY = "Wire Font"
DESCRIPTION = "Wire is a condensed monoline sans. Its modular-based characters are \
flavored with a sense of art nouveau. Nearly hairline thickness suggests \
usage for body text above 12px. While at display sizes it reveals its \
tiny dot terminals to create a sharp mood in headlines. \
 \
For web typesetting it is recommended to adjust letter-spacing for sizes \
below 30px to 0.033em and up. For 12 px we recommend the value of \
0.085em."
LICENSE = "OFL-1.1"

PV = "1.000"

RPM_NAME = "cyreal-wire-fonts-1.000-7.25.noarch.rpm"
RPM_HASH = "7417f517bf36a22f659a444e550886fbde4229f179aa9695ea983a659319595fd6efa46b5d5435ca2a136665790ce7bcd65303da394ae6f0716ccabcd0381b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-wire-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
