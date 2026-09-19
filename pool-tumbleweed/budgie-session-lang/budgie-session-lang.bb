SUMMARY = "Translations for package budgie-session"
DESCRIPTION = "Provides translations for the 'budgie-session' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0+0"

RPM_NAME = "budgie-session-lang-1.0.0+0-1.2.noarch.rpm"
RPM_HASH = "71a4fc6a65b63f7c8b59a3d663719318eb5482e783d066f1c7fa699e30634da13ac18fcef37deb6d1395d521c0ce44bb799262a9f60a78e42c24d24eab62c71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-session-lang \
budgie-session-lang-all \
locale-budgie-session-af \
locale-budgie-session-ar \
locale-budgie-session-as \
locale-budgie-session-ast \
locale-budgie-session-az \
locale-budgie-session-be \
locale-budgie-session-be@latin \
locale-budgie-session-bg \
locale-budgie-session-bn \
locale-budgie-session-bn-IN \
locale-budgie-session-br \
locale-budgie-session-bs \
locale-budgie-session-ca \
locale-budgie-session-ca@valencia \
locale-budgie-session-cs \
locale-budgie-session-cy \
locale-budgie-session-da \
locale-budgie-session-de \
locale-budgie-session-dz \
locale-budgie-session-el \
locale-budgie-session-en-CA \
locale-budgie-session-en-GB \
locale-budgie-session-en@shaw \
locale-budgie-session-eo \
locale-budgie-session-es \
locale-budgie-session-et \
locale-budgie-session-eu \
locale-budgie-session-fa \
locale-budgie-session-fi \
locale-budgie-session-fr \
locale-budgie-session-fur \
locale-budgie-session-ga \
locale-budgie-session-gd \
locale-budgie-session-gl \
locale-budgie-session-gu \
locale-budgie-session-he \
locale-budgie-session-hi \
locale-budgie-session-hr \
locale-budgie-session-hu \
locale-budgie-session-id \
locale-budgie-session-is \
locale-budgie-session-it \
locale-budgie-session-ja \
locale-budgie-session-ka \
locale-budgie-session-kk \
locale-budgie-session-km \
locale-budgie-session-kn \
locale-budgie-session-ko \
locale-budgie-session-lt \
locale-budgie-session-lv \
locale-budgie-session-mai \
locale-budgie-session-mk \
locale-budgie-session-ml \
locale-budgie-session-mr \
locale-budgie-session-ms \
locale-budgie-session-nb \
locale-budgie-session-nds \
locale-budgie-session-ne \
locale-budgie-session-nl \
locale-budgie-session-nn \
locale-budgie-session-oc \
locale-budgie-session-or \
locale-budgie-session-pa \
locale-budgie-session-pl \
locale-budgie-session-pt \
locale-budgie-session-pt-BR \
locale-budgie-session-ro \
locale-budgie-session-ru \
locale-budgie-session-si \
locale-budgie-session-sk \
locale-budgie-session-sl \
locale-budgie-session-sq \
locale-budgie-session-sr \
locale-budgie-session-sr@latin \
locale-budgie-session-sv \
locale-budgie-session-ta \
locale-budgie-session-te \
locale-budgie-session-th \
locale-budgie-session-tr \
locale-budgie-session-ug \
locale-budgie-session-uk \
locale-budgie-session-vi \
locale-budgie-session-wa \
locale-budgie-session-zh-CN \
locale-budgie-session-zh-HK \
locale-budgie-session-zh-TW"

RDEPENDS:${PN} += "budgie-session"

inherit rpm
