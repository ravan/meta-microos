SUMMARY = "Translations for package tinysparql"
DESCRIPTION = "Provides translations for the 'tinysparql' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.1"

RPM_NAME = "tinysparql-lang-3.11.1-1.3.noarch.rpm"
RPM_HASH = "6a60f1e610085afdf872a4c901f58c1fc01953d06feb4c0ef49101e475fc8c6f5c992898b3a40f433abfecdbe0208c92a176711ec215a4d83ffe89d7adf9e6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tinysparql-ar \
locale-tinysparql-as \
locale-tinysparql-be \
locale-tinysparql-be@latin \
locale-tinysparql-bg \
locale-tinysparql-bs \
locale-tinysparql-ca \
locale-tinysparql-ca@valencia \
locale-tinysparql-cs \
locale-tinysparql-da \
locale-tinysparql-de \
locale-tinysparql-dz \
locale-tinysparql-el \
locale-tinysparql-en-GB \
locale-tinysparql-eo \
locale-tinysparql-es \
locale-tinysparql-et \
locale-tinysparql-eu \
locale-tinysparql-fa \
locale-tinysparql-fi \
locale-tinysparql-fr \
locale-tinysparql-fur \
locale-tinysparql-gl \
locale-tinysparql-he \
locale-tinysparql-hi \
locale-tinysparql-hr \
locale-tinysparql-hu \
locale-tinysparql-id \
locale-tinysparql-is \
locale-tinysparql-it \
locale-tinysparql-ja \
locale-tinysparql-ka \
locale-tinysparql-kk \
locale-tinysparql-ko \
locale-tinysparql-lt \
locale-tinysparql-lv \
locale-tinysparql-mk \
locale-tinysparql-ml \
locale-tinysparql-ms \
locale-tinysparql-nb \
locale-tinysparql-nds \
locale-tinysparql-ne \
locale-tinysparql-nl \
locale-tinysparql-oc \
locale-tinysparql-pa \
locale-tinysparql-pl \
locale-tinysparql-pt \
locale-tinysparql-pt-BR \
locale-tinysparql-ro \
locale-tinysparql-ru \
locale-tinysparql-sk \
locale-tinysparql-sl \
locale-tinysparql-sr \
locale-tinysparql-sr@latin \
locale-tinysparql-sv \
locale-tinysparql-te \
locale-tinysparql-th \
locale-tinysparql-tr \
locale-tinysparql-ug \
locale-tinysparql-uk \
locale-tinysparql-vi \
locale-tinysparql-zh-CN \
locale-tinysparql-zh-HK \
locale-tinysparql-zh-TW \
tinysparql-lang \
tinysparql-lang-all"

RDEPENDS:${PN} += "tinysparql"

inherit rpm
