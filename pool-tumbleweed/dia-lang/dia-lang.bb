SUMMARY = "Translations for package dia"
DESCRIPTION = "Provides translations for the 'dia' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.97.3"

RPM_NAME = "dia-lang-0.97.3-18.6.noarch.rpm"
RPM_HASH = "e4f50248f29c8ae2c2e3e9a5fe1b14644c20ddf31df28bc38406f7b358fbdf9403fa864b7daa801e5b292c7ad4a1ebbe7d2737f4225ffbd8036018550238a78d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dia-lang \
dia-lang-all \
locale-dia-ar \
locale-dia-ast \
locale-dia-az \
locale-dia-be \
locale-dia-bg \
locale-dia-bs \
locale-dia-ca \
locale-dia-ca@valencia \
locale-dia-cs \
locale-dia-da \
locale-dia-de \
locale-dia-dz \
locale-dia-el \
locale-dia-en-CA \
locale-dia-en-GB \
locale-dia-eo \
locale-dia-es \
locale-dia-eu \
locale-dia-fi \
locale-dia-fr \
locale-dia-ga \
locale-dia-gl \
locale-dia-gu \
locale-dia-hr \
locale-dia-hu \
locale-dia-id \
locale-dia-is \
locale-dia-it \
locale-dia-ja \
locale-dia-kn \
locale-dia-ko \
locale-dia-lt \
locale-dia-lv \
locale-dia-mk \
locale-dia-ml \
locale-dia-mr \
locale-dia-ms \
locale-dia-nb \
locale-dia-ne \
locale-dia-nl \
locale-dia-nn \
locale-dia-oc \
locale-dia-or \
locale-dia-pa \
locale-dia-pl \
locale-dia-pt \
locale-dia-pt-BR \
locale-dia-ro \
locale-dia-ru \
locale-dia-sk \
locale-dia-sl \
locale-dia-sq \
locale-dia-sr \
locale-dia-sr@latin \
locale-dia-sv \
locale-dia-ta \
locale-dia-th \
locale-dia-tr \
locale-dia-uk \
locale-dia-vi \
locale-dia-zh-CN \
locale-dia-zh-HK \
locale-dia-zh-TW"

RDEPENDS:${PN} += "dia"

inherit rpm
