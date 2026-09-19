SUMMARY = "Translations for package warp"
DESCRIPTION = "Provides translations for the 'warp' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "warp-lang-0.9.2-2.6.noarch.rpm"
RPM_HASH = "70431ec342bbc26b686e810a0e0056e835e6415df2966616387c66f44343ce92037279a0c9dac73dc89b46acc43ed8835dde1f76c43aced61736a8f674f3164c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-warp-bg \
locale-warp-ca \
locale-warp-cs \
locale-warp-da \
locale-warp-de \
locale-warp-el \
locale-warp-en-GB \
locale-warp-es \
locale-warp-eu \
locale-warp-fa \
locale-warp-fi \
locale-warp-fr \
locale-warp-fur \
locale-warp-gl \
locale-warp-he \
locale-warp-hi \
locale-warp-hr \
locale-warp-hu \
locale-warp-id \
locale-warp-is \
locale-warp-it \
locale-warp-ka \
locale-warp-ko \
locale-warp-nb \
locale-warp-nl \
locale-warp-oc \
locale-warp-pt \
locale-warp-pt-BR \
locale-warp-ro \
locale-warp-ru \
locale-warp-sl \
locale-warp-sr \
locale-warp-sv \
locale-warp-tr \
locale-warp-uk \
locale-warp-vi \
locale-warp-zh-CN \
locale-warp-zh-TW \
warp-lang \
warp-lang-all"

RDEPENDS:${PN} += "warp"

inherit rpm
