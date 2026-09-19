SUMMARY = "Latin Modern Font"
DESCRIPTION = "BabelStone latin modern font."
LICENSE = "OFL-1.1"

PV = "6.002"

RPM_NAME = "babelstone-modern-fonts-6.002-3.25.noarch.rpm"
RPM_HASH = "1df48f80e3428764695b3254ed0df80b2e41dd3292939a4d860a85069ac1da0853a2e1631cfeb8ce499e304780b06298ea601bafe3a72339cfa488248f6583fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-modern-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
