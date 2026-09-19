SUMMARY = "Translations for package papers"
DESCRIPTION = "Provides translations for the 'papers' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "papers-lang-50.3-1.1.noarch.rpm"
RPM_HASH = "96eaf297dd6f5e1b7cacd11e2426ab5837a8e0b7294b9977cc0dcb78fee422eaa8470be1bdb35561c9668ed268f2dd92317e6f8ed68ba343b1f9918fff0d2746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-papers-af \
locale-papers-ar \
locale-papers-as \
locale-papers-ast \
locale-papers-be \
locale-papers-be@latin \
locale-papers-bg \
locale-papers-bn \
locale-papers-bn-IN \
locale-papers-br \
locale-papers-bs \
locale-papers-ca \
locale-papers-ca@valencia \
locale-papers-cs \
locale-papers-cy \
locale-papers-da \
locale-papers-de \
locale-papers-dz \
locale-papers-el \
locale-papers-en-CA \
locale-papers-en-GB \
locale-papers-en@shaw \
locale-papers-eo \
locale-papers-es \
locale-papers-et \
locale-papers-eu \
locale-papers-fa \
locale-papers-fi \
locale-papers-fr \
locale-papers-fur \
locale-papers-ga \
locale-papers-gd \
locale-papers-gl \
locale-papers-gu \
locale-papers-he \
locale-papers-hi \
locale-papers-hr \
locale-papers-hu \
locale-papers-ia \
locale-papers-id \
locale-papers-is \
locale-papers-it \
locale-papers-ja \
locale-papers-ka \
locale-papers-kk \
locale-papers-km \
locale-papers-kn \
locale-papers-ko \
locale-papers-lt \
locale-papers-lv \
locale-papers-mai \
locale-papers-mk \
locale-papers-ml \
locale-papers-mr \
locale-papers-ms \
locale-papers-nb \
locale-papers-nds \
locale-papers-ne \
locale-papers-nl \
locale-papers-nn \
locale-papers-oc \
locale-papers-or \
locale-papers-pa \
locale-papers-pl \
locale-papers-pt \
locale-papers-pt-BR \
locale-papers-ro \
locale-papers-ru \
locale-papers-si \
locale-papers-sk \
locale-papers-sl \
locale-papers-sq \
locale-papers-sr \
locale-papers-sr@latin \
locale-papers-sv \
locale-papers-ta \
locale-papers-te \
locale-papers-th \
locale-papers-tr \
locale-papers-ug \
locale-papers-uk \
locale-papers-vi \
locale-papers-wa \
locale-papers-zh-CN \
locale-papers-zh-HK \
locale-papers-zh-TW \
papers-lang \
papers-lang-all"

RDEPENDS:${PN} += "papers"

inherit rpm
