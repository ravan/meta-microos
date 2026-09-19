SUMMARY = "Non-variable M PLUS Code Latin 60 font"
DESCRIPTION = "A monospaced font with 7 weights from Thin to Bold. \
M PLUS Code Latin 60 has a character aspect ratio of 0.6."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus-code-latin60-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "0b8dc3c6941995e85c5fb553e6aff1721ed22fbb07d9befa78ad3aa288c2b195423eac7f3821dbdbfbabfa268ef10b84fd85cf93d938af2dc37cad8637ed22e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus-code-latin60-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
