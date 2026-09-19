SUMMARY = "Translations for package ksirk"
DESCRIPTION = "Provides translations for the 'ksirk' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ksirk-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "c88be5eea24b51d87413d3e42a4ccdb4496a77053b9d195af2da60ea0f1f9fee4ead1692a3fc8eafa7720812fd620007cbf957b3ba7d9e2fedccd5d7681375eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksirk-lang \
ksirk-lang-all \
locale-ksirk-ar \
locale-ksirk-ast \
locale-ksirk-be \
locale-ksirk-bs \
locale-ksirk-ca \
locale-ksirk-ca@valencia \
locale-ksirk-cs \
locale-ksirk-da \
locale-ksirk-de \
locale-ksirk-el \
locale-ksirk-en-GB \
locale-ksirk-eo \
locale-ksirk-es \
locale-ksirk-et \
locale-ksirk-eu \
locale-ksirk-fi \
locale-ksirk-fr \
locale-ksirk-ga \
locale-ksirk-gl \
locale-ksirk-he \
locale-ksirk-hi \
locale-ksirk-hr \
locale-ksirk-hu \
locale-ksirk-ia \
locale-ksirk-is \
locale-ksirk-it \
locale-ksirk-ja \
locale-ksirk-ka \
locale-ksirk-kk \
locale-ksirk-km \
locale-ksirk-ko \
locale-ksirk-lt \
locale-ksirk-lv \
locale-ksirk-mai \
locale-ksirk-ml \
locale-ksirk-mr \
locale-ksirk-ms \
locale-ksirk-nb \
locale-ksirk-nds \
locale-ksirk-nl \
locale-ksirk-nn \
locale-ksirk-oc \
locale-ksirk-pl \
locale-ksirk-pt \
locale-ksirk-pt-BR \
locale-ksirk-ro \
locale-ksirk-ru \
locale-ksirk-sk \
locale-ksirk-sl \
locale-ksirk-sr \
locale-ksirk-sr@ijekavian \
locale-ksirk-sr@ijekavianlatin \
locale-ksirk-sr@latin \
locale-ksirk-sv \
locale-ksirk-tr \
locale-ksirk-ug \
locale-ksirk-uk \
locale-ksirk-zh-CN \
locale-ksirk-zh-TW"

RDEPENDS:${PN} += "ksirk"

inherit rpm
