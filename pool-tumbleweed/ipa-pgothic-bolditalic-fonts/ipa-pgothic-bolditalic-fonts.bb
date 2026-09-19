SUMMARY = "Bold+Italic Variant of 'Proportional Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Bold+Italic variant of 'Proportional Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-pgothic-bolditalic-fonts-003.02-14.5.noarch.rpm"
RPM_HASH = "5203a975dda62b24c27b7cf81bbf8cde03bcf3ceb1b62d82a6c3ee207b3bfd67fc7ea082ce1f2cf415f89416bba5e91939535a8889e42ad0c2ce667a0aaf88cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPGothic-BoldItalic \
ipa-pgothic-bolditalic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
