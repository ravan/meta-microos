SUMMARY = "Translations for package kgamma6"
DESCRIPTION = "Provides translations for the 'kgamma6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kgamma6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "11c9a04e649af756cc369756c225415e9652c37f5e16946437de35f0eb671eb86beb44a56f82e97d3fd3b93004e41c79ed688c365331b37aad3d3eec3b63230d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgamma6-lang \
kgamma6-lang-all \
locale-kgamma6-ar \
locale-kgamma6-ast \
locale-kgamma6-az \
locale-kgamma6-be \
locale-kgamma6-bg \
locale-kgamma6-br \
locale-kgamma6-bs \
locale-kgamma6-ca \
locale-kgamma6-ca@valencia \
locale-kgamma6-cs \
locale-kgamma6-cy \
locale-kgamma6-da \
locale-kgamma6-de \
locale-kgamma6-el \
locale-kgamma6-en-GB \
locale-kgamma6-eo \
locale-kgamma6-es \
locale-kgamma6-et \
locale-kgamma6-eu \
locale-kgamma6-fa \
locale-kgamma6-fi \
locale-kgamma6-fr \
locale-kgamma6-ga \
locale-kgamma6-gl \
locale-kgamma6-he \
locale-kgamma6-hi \
locale-kgamma6-hr \
locale-kgamma6-hu \
locale-kgamma6-ia \
locale-kgamma6-id \
locale-kgamma6-is \
locale-kgamma6-it \
locale-kgamma6-ja \
locale-kgamma6-ka \
locale-kgamma6-kk \
locale-kgamma6-km \
locale-kgamma6-ko \
locale-kgamma6-lt \
locale-kgamma6-lv \
locale-kgamma6-mk \
locale-kgamma6-ml \
locale-kgamma6-mr \
locale-kgamma6-ms \
locale-kgamma6-nb \
locale-kgamma6-nds \
locale-kgamma6-ne \
locale-kgamma6-nl \
locale-kgamma6-nn \
locale-kgamma6-oc \
locale-kgamma6-pa \
locale-kgamma6-pl \
locale-kgamma6-pt \
locale-kgamma6-pt-BR \
locale-kgamma6-ro \
locale-kgamma6-ru \
locale-kgamma6-si \
locale-kgamma6-sk \
locale-kgamma6-sl \
locale-kgamma6-sq \
locale-kgamma6-sr \
locale-kgamma6-sr@ijekavian \
locale-kgamma6-sr@ijekavianlatin \
locale-kgamma6-sr@latin \
locale-kgamma6-sv \
locale-kgamma6-ta \
locale-kgamma6-th \
locale-kgamma6-tr \
locale-kgamma6-ug \
locale-kgamma6-uk \
locale-kgamma6-vi \
locale-kgamma6-zh-CN \
locale-kgamma6-zh-HK \
locale-kgamma6-zh-TW"

RDEPENDS:${PN} += "kgamma6"

inherit rpm
