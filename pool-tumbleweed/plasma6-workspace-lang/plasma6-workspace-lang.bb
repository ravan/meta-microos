SUMMARY = "Translations for package plasma6-workspace"
DESCRIPTION = "Provides translations for the 'plasma6-workspace' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-workspace-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "f1fe61174c42bf4f7ea33bdd5ee41630ab959ef4230ee46cbe427792cbc0d41ec97bd6c6c41c234115d1ea65b52c1c772a755cc004d70cfea76a0d758659c017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-workspace-af \
locale-plasma6-workspace-ar \
locale-plasma6-workspace-ast \
locale-plasma6-workspace-az \
locale-plasma6-workspace-be \
locale-plasma6-workspace-be@latin \
locale-plasma6-workspace-bg \
locale-plasma6-workspace-bn \
locale-plasma6-workspace-bn-IN \
locale-plasma6-workspace-br \
locale-plasma6-workspace-bs \
locale-plasma6-workspace-ca \
locale-plasma6-workspace-ca@valencia \
locale-plasma6-workspace-cs \
locale-plasma6-workspace-cy \
locale-plasma6-workspace-da \
locale-plasma6-workspace-de \
locale-plasma6-workspace-el \
locale-plasma6-workspace-en-GB \
locale-plasma6-workspace-eo \
locale-plasma6-workspace-es \
locale-plasma6-workspace-et \
locale-plasma6-workspace-eu \
locale-plasma6-workspace-fa \
locale-plasma6-workspace-fi \
locale-plasma6-workspace-fr \
locale-plasma6-workspace-ga \
locale-plasma6-workspace-gl \
locale-plasma6-workspace-gu \
locale-plasma6-workspace-he \
locale-plasma6-workspace-hi \
locale-plasma6-workspace-hr \
locale-plasma6-workspace-hu \
locale-plasma6-workspace-ia \
locale-plasma6-workspace-id \
locale-plasma6-workspace-is \
locale-plasma6-workspace-it \
locale-plasma6-workspace-ja \
locale-plasma6-workspace-ka \
locale-plasma6-workspace-kk \
locale-plasma6-workspace-km \
locale-plasma6-workspace-kn \
locale-plasma6-workspace-ko \
locale-plasma6-workspace-lt \
locale-plasma6-workspace-lv \
locale-plasma6-workspace-mai \
locale-plasma6-workspace-mk \
locale-plasma6-workspace-ml \
locale-plasma6-workspace-mr \
locale-plasma6-workspace-ms \
locale-plasma6-workspace-nb \
locale-plasma6-workspace-nds \
locale-plasma6-workspace-ne \
locale-plasma6-workspace-nl \
locale-plasma6-workspace-nn \
locale-plasma6-workspace-oc \
locale-plasma6-workspace-or \
locale-plasma6-workspace-pa \
locale-plasma6-workspace-pl \
locale-plasma6-workspace-pt \
locale-plasma6-workspace-pt-BR \
locale-plasma6-workspace-ro \
locale-plasma6-workspace-ru \
locale-plasma6-workspace-si \
locale-plasma6-workspace-sk \
locale-plasma6-workspace-sl \
locale-plasma6-workspace-sq \
locale-plasma6-workspace-sr \
locale-plasma6-workspace-sr@ijekavian \
locale-plasma6-workspace-sr@ijekavianlatin \
locale-plasma6-workspace-sr@latin \
locale-plasma6-workspace-sv \
locale-plasma6-workspace-ta \
locale-plasma6-workspace-te \
locale-plasma6-workspace-th \
locale-plasma6-workspace-tr \
locale-plasma6-workspace-ug \
locale-plasma6-workspace-uk \
locale-plasma6-workspace-vi \
locale-plasma6-workspace-wa \
locale-plasma6-workspace-zh-CN \
locale-plasma6-workspace-zh-TW \
plasma6-workspace-lang \
plasma6-workspace-lang-all"

RDEPENDS:${PN} += "plasma6-workspace"

inherit rpm
