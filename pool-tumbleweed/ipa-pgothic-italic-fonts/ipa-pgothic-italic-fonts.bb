SUMMARY = "Italic Variant of 'Proportional Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Italic variant of 'Proportional Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-pgothic-italic-fonts-003.02-14.5.noarch.rpm"
RPM_HASH = "04a215b25623ab63dbf18dd0e718d9ac1373ae74af31286ba5068ba7c8c8e2185f8eb94146900c823cdc9337526ffb686d36a172cfc23785dc327df013ff08a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPGothic-Italic \
ipa-pgothic-italic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
