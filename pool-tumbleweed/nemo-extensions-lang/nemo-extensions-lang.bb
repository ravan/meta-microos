SUMMARY = "Translations for nemo-extensions packages"
DESCRIPTION = "Provides translations for the nemo-extensions packages."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.2"

RPM_NAME = "nemo-extensions-lang-6.6.2-1.2.noarch.rpm"
RPM_HASH = "aef6ce7871e4005888a03931bb51f600210f4af93c101f42d878113eed9886b66726ad240480fe7bef6b53e09cc8a35c9b0d4beca5799a6f2f8fc0aae4c0a737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nemo-extensions-ar \
locale-nemo-extensions-be \
locale-nemo-extensions-bg \
locale-nemo-extensions-bn \
locale-nemo-extensions-br \
locale-nemo-extensions-ca \
locale-nemo-extensions-ca@valencia \
locale-nemo-extensions-cs \
locale-nemo-extensions-cy \
locale-nemo-extensions-da \
locale-nemo-extensions-de \
locale-nemo-extensions-el \
locale-nemo-extensions-en-CA \
locale-nemo-extensions-en-GB \
locale-nemo-extensions-eo \
locale-nemo-extensions-es \
locale-nemo-extensions-et \
locale-nemo-extensions-eu \
locale-nemo-extensions-fa \
locale-nemo-extensions-fi \
locale-nemo-extensions-fr \
locale-nemo-extensions-fr-CA \
locale-nemo-extensions-he \
locale-nemo-extensions-hi \
locale-nemo-extensions-hr \
locale-nemo-extensions-hu \
locale-nemo-extensions-ia \
locale-nemo-extensions-id \
locale-nemo-extensions-is \
locale-nemo-extensions-it \
locale-nemo-extensions-ja \
locale-nemo-extensions-ka \
locale-nemo-extensions-kk \
locale-nemo-extensions-ko \
locale-nemo-extensions-lt \
locale-nemo-extensions-lv \
locale-nemo-extensions-nb \
locale-nemo-extensions-ne \
locale-nemo-extensions-nl \
locale-nemo-extensions-nn \
locale-nemo-extensions-oc \
locale-nemo-extensions-pl \
locale-nemo-extensions-pt \
locale-nemo-extensions-pt-BR \
locale-nemo-extensions-ro \
locale-nemo-extensions-ru \
locale-nemo-extensions-sk \
locale-nemo-extensions-sl \
locale-nemo-extensions-sq \
locale-nemo-extensions-sr \
locale-nemo-extensions-sr@latin \
locale-nemo-extensions-sv \
locale-nemo-extensions-ta \
locale-nemo-extensions-te \
locale-nemo-extensions-th \
locale-nemo-extensions-tr \
locale-nemo-extensions-uk \
locale-nemo-extensions-vi \
locale-nemo-extensions-zh-CN \
locale-nemo-extensions-zh-HK \
locale-nemo-extensions-zh-TW \
nemo-extension-compare-lang \
nemo-extension-emblems-lang \
nemo-extension-gtkhash-lang \
nemo-extension-image-converter-lang \
nemo-extension-pastebin-lang \
nemo-extension-preview-lang \
nemo-extension-repairer-lang \
nemo-extension-seahorse-lang \
nemo-extension-share-lang \
nemo-extensions-lang \
nemo-extensions-lang-all"

RDEPENDS:${PN} += ""

inherit rpm
