SUMMARY = "'UI Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'UI Gothic' Japanese TrueType font made by IPA (Information-technology \
Promotion Agency)."
LICENSE = "IPA"

PV = "002.003"

RPM_NAME = "ipa-uigothic-fonts-002.003-67.25.noarch.rpm"
RPM_HASH = "5e769e4401457b2538124f1e82c06d0dfdc0bfa0a5a98b80c7f25ff740ccaf0d0696e68a76de25db83d57b96721d063def7b14c08c4049a81739e50b1a5a3485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPUIGothic \
ipa-uigothic-fonts \
locale-ja \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
