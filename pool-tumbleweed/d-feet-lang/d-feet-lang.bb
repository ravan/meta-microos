SUMMARY = "Translations for package d-feet"
DESCRIPTION = "Provides translations for the 'd-feet' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.16"

RPM_NAME = "d-feet-lang-0.3.16-2.15.noarch.rpm"
RPM_HASH = "1e533eee0b4136d07a8dffe4d09d7f86210dea2126485d5efd04ab33bc2bef2fdd9818204f6debd09ce28ff4baae4b31218b78d3f1fefbf0e817ae4328852992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "d-feet-lang \
d-feet-lang-all \
locale-d-feet-bs \
locale-d-feet-cs \
locale-d-feet-da \
locale-d-feet-de \
locale-d-feet-el \
locale-d-feet-en-GB \
locale-d-feet-es \
locale-d-feet-eu \
locale-d-feet-fi \
locale-d-feet-fr \
locale-d-feet-fur \
locale-d-feet-gl \
locale-d-feet-hr \
locale-d-feet-hu \
locale-d-feet-id \
locale-d-feet-lv \
locale-d-feet-nb \
locale-d-feet-nl \
locale-d-feet-oc \
locale-d-feet-pl \
locale-d-feet-pt \
locale-d-feet-pt-BR \
locale-d-feet-ro \
locale-d-feet-ru \
locale-d-feet-sl \
locale-d-feet-sr \
locale-d-feet-sr@latin \
locale-d-feet-sv \
locale-d-feet-tr \
locale-d-feet-uk \
locale-d-feet-zh-CN"

RDEPENDS:${PN} += "d-feet"

inherit rpm
