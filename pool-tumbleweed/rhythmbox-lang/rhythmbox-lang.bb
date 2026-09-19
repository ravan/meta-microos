SUMMARY = "Translations for package rhythmbox"
DESCRIPTION = "Provides translations for the 'rhythmbox' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "rhythmbox-lang-3.5.1-1.1.noarch.rpm"
RPM_HASH = "529a96cf5bd48c7e10216f1d2f444ee31c43bd43bb8d9416f674efee369bfe74728576aa325048cee83911fe46952eab51ef5d9296fb1d4c5200119c6b6e2c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rhythmbox-af \
locale-rhythmbox-ar \
locale-rhythmbox-as \
locale-rhythmbox-az \
locale-rhythmbox-be \
locale-rhythmbox-be@latin \
locale-rhythmbox-bg \
locale-rhythmbox-bn-IN \
locale-rhythmbox-br \
locale-rhythmbox-bs \
locale-rhythmbox-ca \
locale-rhythmbox-ca@valencia \
locale-rhythmbox-cs \
locale-rhythmbox-cy \
locale-rhythmbox-da \
locale-rhythmbox-de \
locale-rhythmbox-dz \
locale-rhythmbox-el \
locale-rhythmbox-en-CA \
locale-rhythmbox-en-GB \
locale-rhythmbox-eo \
locale-rhythmbox-es \
locale-rhythmbox-et \
locale-rhythmbox-eu \
locale-rhythmbox-fa \
locale-rhythmbox-fi \
locale-rhythmbox-fr \
locale-rhythmbox-fur \
locale-rhythmbox-ga \
locale-rhythmbox-gd \
locale-rhythmbox-gl \
locale-rhythmbox-gu \
locale-rhythmbox-he \
locale-rhythmbox-hi \
locale-rhythmbox-hr \
locale-rhythmbox-hu \
locale-rhythmbox-id \
locale-rhythmbox-is \
locale-rhythmbox-it \
locale-rhythmbox-ja \
locale-rhythmbox-ka \
locale-rhythmbox-kk \
locale-rhythmbox-kn \
locale-rhythmbox-ko \
locale-rhythmbox-lt \
locale-rhythmbox-lv \
locale-rhythmbox-mk \
locale-rhythmbox-ml \
locale-rhythmbox-mr \
locale-rhythmbox-ms \
locale-rhythmbox-nb \
locale-rhythmbox-nds \
locale-rhythmbox-ne \
locale-rhythmbox-nl \
locale-rhythmbox-nn \
locale-rhythmbox-oc \
locale-rhythmbox-or \
locale-rhythmbox-pa \
locale-rhythmbox-pl \
locale-rhythmbox-pt \
locale-rhythmbox-pt-BR \
locale-rhythmbox-ro \
locale-rhythmbox-ru \
locale-rhythmbox-si \
locale-rhythmbox-sk \
locale-rhythmbox-sl \
locale-rhythmbox-sr \
locale-rhythmbox-sr@latin \
locale-rhythmbox-sv \
locale-rhythmbox-ta \
locale-rhythmbox-te \
locale-rhythmbox-th \
locale-rhythmbox-tr \
locale-rhythmbox-uk \
locale-rhythmbox-vi \
locale-rhythmbox-zh-CN \
locale-rhythmbox-zh-HK \
locale-rhythmbox-zh-TW \
rhythmbox-lang \
rhythmbox-lang-all"

RDEPENDS:${PN} += "rhythmbox"

inherit rpm
