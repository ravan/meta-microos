SUMMARY = "Translations for package gretl"
DESCRIPTION = "Provides translations for the 'gretl' package."
LICENSE = "GPL-3.0-only"

PV = "2025a"

RPM_NAME = "gretl-lang-2025a-1.7.noarch.rpm"
RPM_HASH = "5ad7e75ed6c4b79b7878dc1efae1a67a96541ba3ad8a198bec991a558a242abac793361045e8e34a2b4dbd550f9af4d2ef9044b6153b64ccd0dbd1a009819226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gretl-lang \
gretl-lang-all \
locale-gretl-bg \
locale-gretl-ca \
locale-gretl-cs \
locale-gretl-de \
locale-gretl-el \
locale-gretl-es \
locale-gretl-eu \
locale-gretl-fr \
locale-gretl-gl \
locale-gretl-it \
locale-gretl-ja \
locale-gretl-pl \
locale-gretl-pt \
locale-gretl-pt-BR \
locale-gretl-ro \
locale-gretl-ru \
locale-gretl-sq \
locale-gretl-tr \
locale-gretl-uk \
locale-gretl-zh-CN \
locale-gretl-zh-TW"

RDEPENDS:${PN} += "gretl"

inherit rpm
