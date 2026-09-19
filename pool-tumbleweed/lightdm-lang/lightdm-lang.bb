SUMMARY = "Translations for package lightdm"
DESCRIPTION = "Provides translations for the 'lightdm' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.32.0"

RPM_NAME = "lightdm-lang-1.32.0-9.4.noarch.rpm"
RPM_HASH = "d36e09f317b2ec3789343415c3caf9f2f600fff619f0ac4134251b46cd3d7063bf3352403c8c83c14a6a1e6f7e95b70e285bed879b1b48a624ab9343539cafed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-lang \
lightdm-lang-all \
locale-lightdm-af \
locale-lightdm-ar \
locale-lightdm-ast \
locale-lightdm-az \
locale-lightdm-be \
locale-lightdm-bg \
locale-lightdm-bn \
locale-lightdm-br \
locale-lightdm-bs \
locale-lightdm-ca \
locale-lightdm-ca@valencia \
locale-lightdm-cs \
locale-lightdm-da \
locale-lightdm-de \
locale-lightdm-el \
locale-lightdm-en-AU \
locale-lightdm-en-CA \
locale-lightdm-en-GB \
locale-lightdm-eo \
locale-lightdm-es \
locale-lightdm-et \
locale-lightdm-eu \
locale-lightdm-fa \
locale-lightdm-fi \
locale-lightdm-fr \
locale-lightdm-gd \
locale-lightdm-gl \
locale-lightdm-gu \
locale-lightdm-he \
locale-lightdm-hi \
locale-lightdm-hr \
locale-lightdm-hu \
locale-lightdm-ia \
locale-lightdm-id \
locale-lightdm-is \
locale-lightdm-it \
locale-lightdm-ja \
locale-lightdm-kk \
locale-lightdm-km \
locale-lightdm-kn \
locale-lightdm-ko \
locale-lightdm-lt \
locale-lightdm-lv \
locale-lightdm-ml \
locale-lightdm-mr \
locale-lightdm-ms \
locale-lightdm-nb \
locale-lightdm-nl \
locale-lightdm-nn \
locale-lightdm-oc \
locale-lightdm-pa \
locale-lightdm-pl \
locale-lightdm-pt \
locale-lightdm-pt-BR \
locale-lightdm-ro \
locale-lightdm-ru \
locale-lightdm-si \
locale-lightdm-sk \
locale-lightdm-sl \
locale-lightdm-sq \
locale-lightdm-sr \
locale-lightdm-sv \
locale-lightdm-ta \
locale-lightdm-te \
locale-lightdm-th \
locale-lightdm-tr \
locale-lightdm-ug \
locale-lightdm-uk \
locale-lightdm-vi \
locale-lightdm-zh-CN \
locale-lightdm-zh-HK \
locale-lightdm-zh-TW"

RDEPENDS:${PN} += "lightdm"

inherit rpm
