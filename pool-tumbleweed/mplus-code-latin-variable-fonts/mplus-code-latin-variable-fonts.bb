SUMMARY = "Variable M PLUS Code Latin font"
DESCRIPTION = "A monospaced variable font that can be adjusted for both \
weight and width."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus-code-latin-variable-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "333ed2376949f5578476fedcbe7a77f019d820403ac957c74669d873a0c18d0f4966fb09bac905ed18e786538b5b8fba918e5417f3c81f2419b8ae6f55913484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus-code-latin-variable-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
