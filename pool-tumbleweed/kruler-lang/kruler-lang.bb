SUMMARY = "Translations for package kruler"
DESCRIPTION = "Provides translations for the 'kruler' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kruler-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "ab306bcfda8b81f2acb991e0f700092c2ae92af16a13f371df573d5b634a8aeb91c850e604520e9e7c6e5fa60577a02c082d8c9602af3a2a42f15861d63d80da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kruler-lang \
kruler-lang-all \
locale-kruler-af \
locale-kruler-ar \
locale-kruler-ast \
locale-kruler-be \
locale-kruler-bg \
locale-kruler-br \
locale-kruler-bs \
locale-kruler-ca \
locale-kruler-ca@valencia \
locale-kruler-cs \
locale-kruler-cy \
locale-kruler-da \
locale-kruler-de \
locale-kruler-el \
locale-kruler-en-GB \
locale-kruler-eo \
locale-kruler-es \
locale-kruler-et \
locale-kruler-eu \
locale-kruler-fa \
locale-kruler-fi \
locale-kruler-fr \
locale-kruler-ga \
locale-kruler-gl \
locale-kruler-he \
locale-kruler-hi \
locale-kruler-hr \
locale-kruler-hu \
locale-kruler-ia \
locale-kruler-id \
locale-kruler-is \
locale-kruler-it \
locale-kruler-ja \
locale-kruler-ka \
locale-kruler-kk \
locale-kruler-km \
locale-kruler-ko \
locale-kruler-lt \
locale-kruler-lv \
locale-kruler-mk \
locale-kruler-ml \
locale-kruler-mr \
locale-kruler-ms \
locale-kruler-nb \
locale-kruler-nds \
locale-kruler-ne \
locale-kruler-nl \
locale-kruler-nn \
locale-kruler-oc \
locale-kruler-pa \
locale-kruler-pl \
locale-kruler-pt \
locale-kruler-pt-BR \
locale-kruler-ro \
locale-kruler-ru \
locale-kruler-si \
locale-kruler-sk \
locale-kruler-sl \
locale-kruler-sq \
locale-kruler-sr \
locale-kruler-sr@ijekavian \
locale-kruler-sr@ijekavianlatin \
locale-kruler-sr@latin \
locale-kruler-sv \
locale-kruler-ta \
locale-kruler-th \
locale-kruler-tr \
locale-kruler-ug \
locale-kruler-uk \
locale-kruler-vi \
locale-kruler-zh-CN \
locale-kruler-zh-HK \
locale-kruler-zh-TW"

RDEPENDS:${PN} += "kruler"

inherit rpm
