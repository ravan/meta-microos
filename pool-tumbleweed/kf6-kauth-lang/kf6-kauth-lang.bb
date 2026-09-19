SUMMARY = "Translations for package kf6-kauth"
DESCRIPTION = "Provides translations for the 'kf6-kauth' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kauth-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "548ca7513552860fcb709b360163738922e196a54930217459aca2db070f3c3fcb4a3830a664d606c475a7e89696bcbd167ad8d489d9a80ddf0a813c2ab6108c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kauth-lang \
kf6-kauth-lang-all \
locale-kf6-kauth-af \
locale-kf6-kauth-ar \
locale-kf6-kauth-as \
locale-kf6-kauth-ast \
locale-kf6-kauth-az \
locale-kf6-kauth-be \
locale-kf6-kauth-be@latin \
locale-kf6-kauth-bg \
locale-kf6-kauth-bn \
locale-kf6-kauth-bn-IN \
locale-kf6-kauth-br \
locale-kf6-kauth-bs \
locale-kf6-kauth-ca \
locale-kf6-kauth-ca@valencia \
locale-kf6-kauth-cs \
locale-kf6-kauth-cy \
locale-kf6-kauth-da \
locale-kf6-kauth-de \
locale-kf6-kauth-el \
locale-kf6-kauth-en-GB \
locale-kf6-kauth-eo \
locale-kf6-kauth-es \
locale-kf6-kauth-et \
locale-kf6-kauth-eu \
locale-kf6-kauth-fa \
locale-kf6-kauth-fi \
locale-kf6-kauth-fr \
locale-kf6-kauth-ga \
locale-kf6-kauth-gd \
locale-kf6-kauth-gl \
locale-kf6-kauth-gu \
locale-kf6-kauth-he \
locale-kf6-kauth-hi \
locale-kf6-kauth-hr \
locale-kf6-kauth-hu \
locale-kf6-kauth-ia \
locale-kf6-kauth-id \
locale-kf6-kauth-is \
locale-kf6-kauth-it \
locale-kf6-kauth-ja \
locale-kf6-kauth-ka \
locale-kf6-kauth-kk \
locale-kf6-kauth-km \
locale-kf6-kauth-kn \
locale-kf6-kauth-ko \
locale-kf6-kauth-lt \
locale-kf6-kauth-lv \
locale-kf6-kauth-mai \
locale-kf6-kauth-mk \
locale-kf6-kauth-ml \
locale-kf6-kauth-mr \
locale-kf6-kauth-ms \
locale-kf6-kauth-nb \
locale-kf6-kauth-nds \
locale-kf6-kauth-ne \
locale-kf6-kauth-nl \
locale-kf6-kauth-nn \
locale-kf6-kauth-oc \
locale-kf6-kauth-or \
locale-kf6-kauth-pa \
locale-kf6-kauth-pl \
locale-kf6-kauth-pt \
locale-kf6-kauth-pt-BR \
locale-kf6-kauth-ro \
locale-kf6-kauth-ru \
locale-kf6-kauth-si \
locale-kf6-kauth-sk \
locale-kf6-kauth-sl \
locale-kf6-kauth-sq \
locale-kf6-kauth-sr \
locale-kf6-kauth-sr@ijekavian \
locale-kf6-kauth-sr@ijekavianlatin \
locale-kf6-kauth-sr@latin \
locale-kf6-kauth-sv \
locale-kf6-kauth-ta \
locale-kf6-kauth-te \
locale-kf6-kauth-th \
locale-kf6-kauth-tr \
locale-kf6-kauth-ug \
locale-kf6-kauth-uk \
locale-kf6-kauth-vi \
locale-kf6-kauth-wa \
locale-kf6-kauth-zh-CN \
locale-kf6-kauth-zh-HK \
locale-kf6-kauth-zh-TW"

RDEPENDS:${PN} += "kf6-kauth"

inherit rpm
