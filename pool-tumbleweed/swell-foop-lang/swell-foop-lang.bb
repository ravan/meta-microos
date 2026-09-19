SUMMARY = "Translations for package swell-foop"
DESCRIPTION = "Provides translations for the 'swell-foop' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "swell-foop-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "fcd800ae250e1dc8098976944df8ec12e79120b7830fa20145f660d69980bd4f6d17152ddfb1d37394ebe23ecc3134e3fb2b0d496c6cf984a517325e921ef6c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-swell-foop-af \
locale-swell-foop-ar \
locale-swell-foop-as \
locale-swell-foop-ast \
locale-swell-foop-az \
locale-swell-foop-be \
locale-swell-foop-bg \
locale-swell-foop-bn \
locale-swell-foop-bn-IN \
locale-swell-foop-br \
locale-swell-foop-bs \
locale-swell-foop-ca \
locale-swell-foop-ca@valencia \
locale-swell-foop-cs \
locale-swell-foop-cy \
locale-swell-foop-da \
locale-swell-foop-de \
locale-swell-foop-dz \
locale-swell-foop-el \
locale-swell-foop-en-CA \
locale-swell-foop-en-GB \
locale-swell-foop-en@shaw \
locale-swell-foop-eo \
locale-swell-foop-es \
locale-swell-foop-et \
locale-swell-foop-eu \
locale-swell-foop-fa \
locale-swell-foop-fi \
locale-swell-foop-fr \
locale-swell-foop-fur \
locale-swell-foop-ga \
locale-swell-foop-gl \
locale-swell-foop-gu \
locale-swell-foop-he \
locale-swell-foop-hi \
locale-swell-foop-hr \
locale-swell-foop-hu \
locale-swell-foop-id \
locale-swell-foop-is \
locale-swell-foop-it \
locale-swell-foop-ja \
locale-swell-foop-ka \
locale-swell-foop-kk \
locale-swell-foop-km \
locale-swell-foop-kn \
locale-swell-foop-ko \
locale-swell-foop-lt \
locale-swell-foop-lv \
locale-swell-foop-mai \
locale-swell-foop-mk \
locale-swell-foop-ml \
locale-swell-foop-mr \
locale-swell-foop-ms \
locale-swell-foop-nb \
locale-swell-foop-ne \
locale-swell-foop-nl \
locale-swell-foop-nn \
locale-swell-foop-oc \
locale-swell-foop-or \
locale-swell-foop-pa \
locale-swell-foop-pl \
locale-swell-foop-pt \
locale-swell-foop-pt-BR \
locale-swell-foop-ro \
locale-swell-foop-ru \
locale-swell-foop-si \
locale-swell-foop-sk \
locale-swell-foop-sl \
locale-swell-foop-sq \
locale-swell-foop-sr \
locale-swell-foop-sr@latin \
locale-swell-foop-sv \
locale-swell-foop-ta \
locale-swell-foop-te \
locale-swell-foop-th \
locale-swell-foop-tr \
locale-swell-foop-ug \
locale-swell-foop-uk \
locale-swell-foop-vi \
locale-swell-foop-wa \
locale-swell-foop-zh-CN \
locale-swell-foop-zh-HK \
locale-swell-foop-zh-TW \
swell-foop-lang \
swell-foop-lang-all"

RDEPENDS:${PN} += "swell-foop"

inherit rpm
