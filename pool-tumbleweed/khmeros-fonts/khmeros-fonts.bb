SUMMARY = "Fonts for the Khmer Language of Cambodia"
DESCRIPTION = "This package contains fonts for the Khmer language of Cambodia."
LICENSE = "LGPL-2.1+"

PV = "5.0"

RPM_NAME = "khmeros-fonts-5.0-118.25.noarch.rpm"
RPM_HASH = "bcf9d5b4503ca9a2909a1a0e135e18de656e654d319350a55014bcc2b2b510b97043a839151ca9ce28bf10f28293b4375db0bd8b615b6d6eec83bad7856f8a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "KhmerOS-fonts \
khmeros-fonts \
locale-km \
scalable-font-km"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
