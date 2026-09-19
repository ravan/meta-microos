SUMMARY = "Translations for package libuser"
DESCRIPTION = "Provides translations for the 'libuser' package."
LICENSE = "LGPL-2.0-or-later"

PV = "0.64"

RPM_NAME = "libuser-lang-0.64-2.7.noarch.rpm"
RPM_HASH = "68c086c150db62ccfd4eedd8a5fcbbf025f7b41b16ea9bc629f0f69ccbd9cd2676689fe86561beb11c7eb0bdfaeb32107a170fc092aa7ff703ed11e76b0108b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libuser-lang \
libuser-lang-all \
locale-libuser-ar \
locale-libuser-as \
locale-libuser-bg \
locale-libuser-bn \
locale-libuser-bn-IN \
locale-libuser-bs \
locale-libuser-ca \
locale-libuser-cs \
locale-libuser-cy \
locale-libuser-da \
locale-libuser-de \
locale-libuser-de-CH \
locale-libuser-el \
locale-libuser-en-GB \
locale-libuser-es \
locale-libuser-et \
locale-libuser-eu \
locale-libuser-fi \
locale-libuser-fr \
locale-libuser-gu \
locale-libuser-he \
locale-libuser-hi \
locale-libuser-hr \
locale-libuser-hu \
locale-libuser-id \
locale-libuser-is \
locale-libuser-it \
locale-libuser-ja \
locale-libuser-ka \
locale-libuser-kn \
locale-libuser-ko \
locale-libuser-lv \
locale-libuser-mai \
locale-libuser-mk \
locale-libuser-ml \
locale-libuser-mr \
locale-libuser-ms \
locale-libuser-nb \
locale-libuser-nds \
locale-libuser-nl \
locale-libuser-or \
locale-libuser-pa \
locale-libuser-pl \
locale-libuser-pt \
locale-libuser-pt-BR \
locale-libuser-ro \
locale-libuser-ru \
locale-libuser-sk \
locale-libuser-sl \
locale-libuser-sr \
locale-libuser-sr@latin \
locale-libuser-sv \
locale-libuser-ta \
locale-libuser-te \
locale-libuser-tr \
locale-libuser-uk \
locale-libuser-vi \
locale-libuser-zh-CN \
locale-libuser-zh-TW"

RDEPENDS:${PN} += "libuser"

inherit rpm
