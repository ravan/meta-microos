SUMMARY = "Translations for package bijiben"
DESCRIPTION = "Provides translations for the 'bijiben' package."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "40.2+git586.102d7c2f"

RPM_NAME = "bijiben-lang-40.2+git586.102d7c2f-1.3.noarch.rpm"
RPM_HASH = "c865444cb717f26ef7ddc73199521ab7ab4daf17289a37cc2ce8dcc84c210efe6ed4bfd54d0e4681ad18547e51e306bd2950791fd0a8ac49d48e473fb27230aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bijiben-lang \
bijiben-lang-all \
locale-bijiben-af \
locale-bijiben-ar \
locale-bijiben-as \
locale-bijiben-be \
locale-bijiben-bg \
locale-bijiben-bs \
locale-bijiben-ca \
locale-bijiben-ca@valencia \
locale-bijiben-cs \
locale-bijiben-da \
locale-bijiben-de \
locale-bijiben-el \
locale-bijiben-en-AU \
locale-bijiben-en-GB \
locale-bijiben-eo \
locale-bijiben-es \
locale-bijiben-et \
locale-bijiben-eu \
locale-bijiben-fa \
locale-bijiben-fi \
locale-bijiben-fr \
locale-bijiben-fur \
locale-bijiben-ga \
locale-bijiben-gl \
locale-bijiben-he \
locale-bijiben-hi \
locale-bijiben-hr \
locale-bijiben-hu \
locale-bijiben-id \
locale-bijiben-is \
locale-bijiben-it \
locale-bijiben-ja \
locale-bijiben-ka \
locale-bijiben-kk \
locale-bijiben-ko \
locale-bijiben-lt \
locale-bijiben-lv \
locale-bijiben-ml \
locale-bijiben-ms \
locale-bijiben-nb \
locale-bijiben-ne \
locale-bijiben-nl \
locale-bijiben-oc \
locale-bijiben-or \
locale-bijiben-pa \
locale-bijiben-pl \
locale-bijiben-pt \
locale-bijiben-pt-BR \
locale-bijiben-ro \
locale-bijiben-ru \
locale-bijiben-sk \
locale-bijiben-sl \
locale-bijiben-sr \
locale-bijiben-sr@latin \
locale-bijiben-sv \
locale-bijiben-ta \
locale-bijiben-te \
locale-bijiben-th \
locale-bijiben-tr \
locale-bijiben-uk \
locale-bijiben-vi \
locale-bijiben-zh-CN \
locale-bijiben-zh-HK \
locale-bijiben-zh-TW"

RDEPENDS:${PN} += "bijiben"

inherit rpm
