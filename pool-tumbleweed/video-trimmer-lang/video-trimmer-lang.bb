SUMMARY = "Translations for package video-trimmer"
DESCRIPTION = "Provides translations for the 'video-trimmer' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.03.1"

RPM_NAME = "video-trimmer-lang-26.03.1-1.3.noarch.rpm"
RPM_HASH = "5f0af88de03ef36cc76788374af2f65bbbac8eafbc15301d7d01373a07f04fa0585b39e2bd73fb00c5fef061ea631ca00050f61a2e7dacef4eb2cbb47ccbcfed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-video-trimmer-ar \
locale-video-trimmer-be \
locale-video-trimmer-bg \
locale-video-trimmer-ca \
locale-video-trimmer-cs \
locale-video-trimmer-da \
locale-video-trimmer-de \
locale-video-trimmer-el \
locale-video-trimmer-en-GB \
locale-video-trimmer-eo \
locale-video-trimmer-es \
locale-video-trimmer-eu \
locale-video-trimmer-fa \
locale-video-trimmer-fi \
locale-video-trimmer-fr \
locale-video-trimmer-fur \
locale-video-trimmer-gl \
locale-video-trimmer-he \
locale-video-trimmer-hi \
locale-video-trimmer-hr \
locale-video-trimmer-hu \
locale-video-trimmer-ia \
locale-video-trimmer-id \
locale-video-trimmer-is \
locale-video-trimmer-it \
locale-video-trimmer-ja \
locale-video-trimmer-ka \
locale-video-trimmer-kk \
locale-video-trimmer-nb \
locale-video-trimmer-nl \
locale-video-trimmer-oc \
locale-video-trimmer-pl \
locale-video-trimmer-pt \
locale-video-trimmer-pt-BR \
locale-video-trimmer-ro \
locale-video-trimmer-ru \
locale-video-trimmer-sl \
locale-video-trimmer-sr \
locale-video-trimmer-sv \
locale-video-trimmer-ta \
locale-video-trimmer-tr \
locale-video-trimmer-uk \
locale-video-trimmer-zh-CN \
locale-video-trimmer-zh-TW \
video-trimmer-lang \
video-trimmer-lang-all"

RDEPENDS:${PN} += "video-trimmer"

inherit rpm
