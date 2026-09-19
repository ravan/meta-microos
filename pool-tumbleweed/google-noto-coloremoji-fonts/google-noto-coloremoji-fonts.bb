SUMMARY = "Noto Color Emoji font"
DESCRIPTION = "Noto Color Emoji font"
LICENSE = "OFL-1.1"

PV = "20250916"

RPM_NAME = "google-noto-coloremoji-fonts-20250916-1.3.noarch.rpm"
RPM_HASH = "d3e2e0f93320934c2cb596dffb3be097e4a48ff1e071f9510ace252102ad5230bded4672699003fe6aa3200a0b2e8468c659769bc71189116ec5a86d71573552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-coloremoji-fonts \
noto-coloremoji-fonts \
noto-emoji-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
