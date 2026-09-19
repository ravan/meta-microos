SUMMARY = "Translations for package pipewire"
DESCRIPTION = "Provides translations for the 'pipewire' package."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-lang-1.6.8-2.1.noarch.rpm"
RPM_HASH = "ac728ab9f3550e4a906ae3cb48ec9b2eeda8e8385a91066245e067432930714822bc4311c513dc99f446c332c703b61f06109a8a5b76f65104e5f4fcc3f99c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pipewire-af \
locale-pipewire-ar \
locale-pipewire-as \
locale-pipewire-be \
locale-pipewire-bg \
locale-pipewire-bn-IN \
locale-pipewire-ca \
locale-pipewire-cs \
locale-pipewire-da \
locale-pipewire-de \
locale-pipewire-de-CH \
locale-pipewire-el \
locale-pipewire-eo \
locale-pipewire-es \
locale-pipewire-fi \
locale-pipewire-fr \
locale-pipewire-gl \
locale-pipewire-gu \
locale-pipewire-he \
locale-pipewire-hi \
locale-pipewire-hr \
locale-pipewire-hu \
locale-pipewire-id \
locale-pipewire-it \
locale-pipewire-ja \
locale-pipewire-ka \
locale-pipewire-kk \
locale-pipewire-kn \
locale-pipewire-ko \
locale-pipewire-lt \
locale-pipewire-ml \
locale-pipewire-mr \
locale-pipewire-nl \
locale-pipewire-nn \
locale-pipewire-oc \
locale-pipewire-or \
locale-pipewire-pa \
locale-pipewire-pl \
locale-pipewire-pt \
locale-pipewire-pt-BR \
locale-pipewire-ro \
locale-pipewire-ru \
locale-pipewire-si \
locale-pipewire-sk \
locale-pipewire-sl \
locale-pipewire-sr \
locale-pipewire-sr@latin \
locale-pipewire-sv \
locale-pipewire-ta \
locale-pipewire-te \
locale-pipewire-tr \
locale-pipewire-uk \
locale-pipewire-zh-CN \
locale-pipewire-zh-TW \
pipewire-lang \
pipewire-lang-all"

RDEPENDS:${PN} += "pipewire"

inherit rpm
