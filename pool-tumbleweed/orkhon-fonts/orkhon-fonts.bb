SUMMARY = "Font for Old Turkic Script"
DESCRIPTION = "Emir Yasin Sari's unicode font for writing Old turkic script."
LICENSE = "OFL-1.1"

PV = "20100509"

RPM_NAME = "orkhon-fonts-20100509-3.25.noarch.rpm"
RPM_HASH = "2605e39882efa8580674235f97d83cc88b719036c09d68c745e1f328175daef0905d4fdc37ad0428018db9fa3c5fa4cb5e625fb8d338efc3740e626109be381e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orkhon-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
