SUMMARY = "Translations for package gtranslator"
DESCRIPTION = "Provides translations for the 'gtranslator' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+157"

RPM_NAME = "gtranslator-lang-50.0+157-1.2.noarch.rpm"
RPM_HASH = "3e8ad70da62873be393148b28c70f9b8e5f2b6eee694e8d4419f4a4af602705c3247f8dd11567c62791ee36e619160a467bf2f42e8d71408834029dcad0d21c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtranslator-lang \
gtranslator-lang-all \
locale-gtranslator-ar \
locale-gtranslator-az \
locale-gtranslator-be \
locale-gtranslator-bg \
locale-gtranslator-bs \
locale-gtranslator-ca \
locale-gtranslator-ca@valencia \
locale-gtranslator-cs \
locale-gtranslator-da \
locale-gtranslator-de \
locale-gtranslator-dz \
locale-gtranslator-el \
locale-gtranslator-en-CA \
locale-gtranslator-en-GB \
locale-gtranslator-eo \
locale-gtranslator-es \
locale-gtranslator-et \
locale-gtranslator-eu \
locale-gtranslator-fa \
locale-gtranslator-fi \
locale-gtranslator-fr \
locale-gtranslator-fur \
locale-gtranslator-ga \
locale-gtranslator-gl \
locale-gtranslator-he \
locale-gtranslator-hi \
locale-gtranslator-hr \
locale-gtranslator-hu \
locale-gtranslator-ia \
locale-gtranslator-id \
locale-gtranslator-is \
locale-gtranslator-it \
locale-gtranslator-ja \
locale-gtranslator-ka \
locale-gtranslator-kk \
locale-gtranslator-ko \
locale-gtranslator-lt \
locale-gtranslator-lv \
locale-gtranslator-mk \
locale-gtranslator-nb \
locale-gtranslator-nds \
locale-gtranslator-nl \
locale-gtranslator-nn \
locale-gtranslator-oc \
locale-gtranslator-pa \
locale-gtranslator-pl \
locale-gtranslator-pt \
locale-gtranslator-pt-BR \
locale-gtranslator-ro \
locale-gtranslator-ru \
locale-gtranslator-sk \
locale-gtranslator-sl \
locale-gtranslator-sq \
locale-gtranslator-sr \
locale-gtranslator-sr@latin \
locale-gtranslator-sv \
locale-gtranslator-ta \
locale-gtranslator-te \
locale-gtranslator-th \
locale-gtranslator-tr \
locale-gtranslator-uk \
locale-gtranslator-vi \
locale-gtranslator-wa \
locale-gtranslator-zh-CN \
locale-gtranslator-zh-HK \
locale-gtranslator-zh-TW"

RDEPENDS:${PN} += "gtranslator"

inherit rpm
