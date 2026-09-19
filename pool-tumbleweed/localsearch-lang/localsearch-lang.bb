SUMMARY = "Translations for package localsearch"
DESCRIPTION = "Provides translations for the 'localsearch' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.2"

RPM_NAME = "localsearch-lang-3.11.2-1.1.noarch.rpm"
RPM_HASH = "4031ce960cd138bdf6cfc3d5843ea6931be99107fd05ff472cb6466c12ac4af52354de90ac6bf908ab1c36811d7c5ffeaeafd27e475d807234c8a6bc9789e491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-localsearch-ar \
locale-localsearch-as \
locale-localsearch-be \
locale-localsearch-be@latin \
locale-localsearch-bg \
locale-localsearch-bs \
locale-localsearch-ca \
locale-localsearch-ca@valencia \
locale-localsearch-cs \
locale-localsearch-da \
locale-localsearch-de \
locale-localsearch-dz \
locale-localsearch-el \
locale-localsearch-en-GB \
locale-localsearch-eo \
locale-localsearch-es \
locale-localsearch-et \
locale-localsearch-eu \
locale-localsearch-fa \
locale-localsearch-fi \
locale-localsearch-fr \
locale-localsearch-fur \
locale-localsearch-gl \
locale-localsearch-he \
locale-localsearch-hi \
locale-localsearch-hr \
locale-localsearch-hu \
locale-localsearch-id \
locale-localsearch-it \
locale-localsearch-ja \
locale-localsearch-ka \
locale-localsearch-kk \
locale-localsearch-ko \
locale-localsearch-lt \
locale-localsearch-lv \
locale-localsearch-mk \
locale-localsearch-ml \
locale-localsearch-ms \
locale-localsearch-nb \
locale-localsearch-nds \
locale-localsearch-ne \
locale-localsearch-nl \
locale-localsearch-oc \
locale-localsearch-pa \
locale-localsearch-pl \
locale-localsearch-pt \
locale-localsearch-pt-BR \
locale-localsearch-ro \
locale-localsearch-ru \
locale-localsearch-sk \
locale-localsearch-sl \
locale-localsearch-sr \
locale-localsearch-sr@latin \
locale-localsearch-sv \
locale-localsearch-te \
locale-localsearch-th \
locale-localsearch-tr \
locale-localsearch-ug \
locale-localsearch-uk \
locale-localsearch-vi \
locale-localsearch-zh-CN \
locale-localsearch-zh-HK \
locale-localsearch-zh-TW \
localsearch-lang \
localsearch-lang-all"

RDEPENDS:${PN} += "localsearch"

inherit rpm
