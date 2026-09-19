SUMMARY = "Italic Variant of 'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Italic variant of 'Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-gothic-italic-fonts-003.02-14.5.noarch.rpm"
RPM_HASH = "e42c7d0d8e1f31e12264d2c11b46738a90967d96e251ec39242c634b9e87c26b45dc589bb28a0bbc33d1aca6fd5eca8622c9a8fa960350129df84073cf3554b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAGothic-Italic \
ipa-gothic-italic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
