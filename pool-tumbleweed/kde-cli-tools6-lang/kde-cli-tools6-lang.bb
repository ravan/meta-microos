SUMMARY = "Translations for package kde-cli-tools6"
DESCRIPTION = "Provides translations for the 'kde-cli-tools6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kde-cli-tools6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "1e8e6a7d1996b6af10414c4bbcc317bf8b083002b337d01f5fa4800bd7a2e7cd3989ad4d1e61302657effa53554491d69da9824a65861fd5a467ca2a2570c55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kde-cli-tools6-lang \
kde-cli-tools6-lang-all \
locale-kde-cli-tools6-af \
locale-kde-cli-tools6-ar \
locale-kde-cli-tools6-ast \
locale-kde-cli-tools6-az \
locale-kde-cli-tools6-be \
locale-kde-cli-tools6-be@latin \
locale-kde-cli-tools6-bg \
locale-kde-cli-tools6-bn \
locale-kde-cli-tools6-bn-IN \
locale-kde-cli-tools6-br \
locale-kde-cli-tools6-bs \
locale-kde-cli-tools6-ca \
locale-kde-cli-tools6-ca@valencia \
locale-kde-cli-tools6-cs \
locale-kde-cli-tools6-cy \
locale-kde-cli-tools6-da \
locale-kde-cli-tools6-de \
locale-kde-cli-tools6-el \
locale-kde-cli-tools6-en-GB \
locale-kde-cli-tools6-eo \
locale-kde-cli-tools6-es \
locale-kde-cli-tools6-et \
locale-kde-cli-tools6-eu \
locale-kde-cli-tools6-fa \
locale-kde-cli-tools6-fi \
locale-kde-cli-tools6-fr \
locale-kde-cli-tools6-ga \
locale-kde-cli-tools6-gl \
locale-kde-cli-tools6-gu \
locale-kde-cli-tools6-he \
locale-kde-cli-tools6-hi \
locale-kde-cli-tools6-hr \
locale-kde-cli-tools6-hu \
locale-kde-cli-tools6-ia \
locale-kde-cli-tools6-id \
locale-kde-cli-tools6-is \
locale-kde-cli-tools6-it \
locale-kde-cli-tools6-ja \
locale-kde-cli-tools6-ka \
locale-kde-cli-tools6-kk \
locale-kde-cli-tools6-km \
locale-kde-cli-tools6-kn \
locale-kde-cli-tools6-ko \
locale-kde-cli-tools6-lt \
locale-kde-cli-tools6-lv \
locale-kde-cli-tools6-mai \
locale-kde-cli-tools6-mk \
locale-kde-cli-tools6-ml \
locale-kde-cli-tools6-mr \
locale-kde-cli-tools6-ms \
locale-kde-cli-tools6-nb \
locale-kde-cli-tools6-nds \
locale-kde-cli-tools6-ne \
locale-kde-cli-tools6-nl \
locale-kde-cli-tools6-nn \
locale-kde-cli-tools6-oc \
locale-kde-cli-tools6-or \
locale-kde-cli-tools6-pa \
locale-kde-cli-tools6-pl \
locale-kde-cli-tools6-pt \
locale-kde-cli-tools6-pt-BR \
locale-kde-cli-tools6-ro \
locale-kde-cli-tools6-ru \
locale-kde-cli-tools6-si \
locale-kde-cli-tools6-sk \
locale-kde-cli-tools6-sl \
locale-kde-cli-tools6-sq \
locale-kde-cli-tools6-sr \
locale-kde-cli-tools6-sr@ijekavian \
locale-kde-cli-tools6-sr@ijekavianlatin \
locale-kde-cli-tools6-sr@latin \
locale-kde-cli-tools6-sv \
locale-kde-cli-tools6-ta \
locale-kde-cli-tools6-te \
locale-kde-cli-tools6-th \
locale-kde-cli-tools6-tr \
locale-kde-cli-tools6-ug \
locale-kde-cli-tools6-uk \
locale-kde-cli-tools6-vi \
locale-kde-cli-tools6-wa \
locale-kde-cli-tools6-zh-CN \
locale-kde-cli-tools6-zh-TW"

RDEPENDS:${PN} += "kde-cli-tools6"

inherit rpm
