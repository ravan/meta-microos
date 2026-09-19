SUMMARY = "Bold+Italic Variant of 'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Bold+Italic variant of 'Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-gothic-bolditalic-fonts-003.02-14.5.noarch.rpm"
RPM_HASH = "fbb36370945dff66bd7ee90df94b7cb5b7d838545c74709c17633437c67d9934851369f096661d08262de11bcc0e76161c934f7faecdb02ec691d45d85ada118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAGothic-BoldItalic \
ipa-gothic-bolditalic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
