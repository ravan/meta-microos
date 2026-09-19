SUMMARY = "Translations for package libsecret"
DESCRIPTION = "Provides translations for the 'libsecret' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.7"

RPM_NAME = "libsecret-lang-0.21.7-2.4.noarch.rpm"
RPM_HASH = "c76a3aa502b368f7e0920931c54a38babb2d5b2c6a0a537046385d3782fbb2a65e94b3f4bac18d71b43ac478101709dbbdcfed6570cefbf9018f5625fb0398d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsecret-lang \
libsecret-lang-all \
locale-libsecret-ar \
locale-libsecret-as \
locale-libsecret-be \
locale-libsecret-bg \
locale-libsecret-bs \
locale-libsecret-ca \
locale-libsecret-ca@valencia \
locale-libsecret-cs \
locale-libsecret-da \
locale-libsecret-de \
locale-libsecret-el \
locale-libsecret-en-GB \
locale-libsecret-eo \
locale-libsecret-es \
locale-libsecret-eu \
locale-libsecret-fa \
locale-libsecret-fi \
locale-libsecret-fr \
locale-libsecret-fur \
locale-libsecret-gl \
locale-libsecret-he \
locale-libsecret-hi \
locale-libsecret-hr \
locale-libsecret-hu \
locale-libsecret-id \
locale-libsecret-it \
locale-libsecret-ja \
locale-libsecret-ka \
locale-libsecret-kk \
locale-libsecret-ko \
locale-libsecret-lt \
locale-libsecret-lv \
locale-libsecret-ml \
locale-libsecret-ms \
locale-libsecret-nb \
locale-libsecret-ne \
locale-libsecret-nl \
locale-libsecret-oc \
locale-libsecret-pa \
locale-libsecret-pl \
locale-libsecret-pt \
locale-libsecret-pt-BR \
locale-libsecret-ro \
locale-libsecret-ru \
locale-libsecret-sk \
locale-libsecret-sl \
locale-libsecret-sr \
locale-libsecret-sr@latin \
locale-libsecret-sv \
locale-libsecret-ta \
locale-libsecret-tr \
locale-libsecret-uk \
locale-libsecret-vi \
locale-libsecret-zh-CN \
locale-libsecret-zh-HK \
locale-libsecret-zh-TW"

RDEPENDS:${PN} += "libsecret"

inherit rpm
