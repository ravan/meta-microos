SUMMARY = "Translations for package vocalis"
DESCRIPTION = "Provides translations for the 'vocalis' package."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "43.beta+131"

RPM_NAME = "vocalis-lang-43.beta+131-1.2.noarch.rpm"
RPM_HASH = "cba8a1574d40855c6c91cf40132c1d512117d31674d06cebed893f57a53a109f681e74c7a8dfca09653f79dbd0feffe4e5b7555d212de61b125ca8555f30e0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vocalis-af \
locale-vocalis-ar \
locale-vocalis-as \
locale-vocalis-be \
locale-vocalis-bs \
locale-vocalis-ca \
locale-vocalis-ca@valencia \
locale-vocalis-cs \
locale-vocalis-da \
locale-vocalis-de \
locale-vocalis-el \
locale-vocalis-en-GB \
locale-vocalis-eo \
locale-vocalis-es \
locale-vocalis-eu \
locale-vocalis-fa \
locale-vocalis-fi \
locale-vocalis-fr \
locale-vocalis-fur \
locale-vocalis-gl \
locale-vocalis-he \
locale-vocalis-hi \
locale-vocalis-hr \
locale-vocalis-hu \
locale-vocalis-id \
locale-vocalis-is \
locale-vocalis-it \
locale-vocalis-ja \
locale-vocalis-ka \
locale-vocalis-kk \
locale-vocalis-ko \
locale-vocalis-lt \
locale-vocalis-lv \
locale-vocalis-ml \
locale-vocalis-ms \
locale-vocalis-nb \
locale-vocalis-ne \
locale-vocalis-nl \
locale-vocalis-oc \
locale-vocalis-pa \
locale-vocalis-pl \
locale-vocalis-pt \
locale-vocalis-pt-BR \
locale-vocalis-ro \
locale-vocalis-ru \
locale-vocalis-sk \
locale-vocalis-sl \
locale-vocalis-sr \
locale-vocalis-sr@latin \
locale-vocalis-sv \
locale-vocalis-te \
locale-vocalis-th \
locale-vocalis-tr \
locale-vocalis-uk \
locale-vocalis-vi \
locale-vocalis-zh-CN \
locale-vocalis-zh-HK \
locale-vocalis-zh-TW \
vocalis-lang \
vocalis-lang-all"

RDEPENDS:${PN} += "vocalis"

inherit rpm
