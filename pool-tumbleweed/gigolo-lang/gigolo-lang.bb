SUMMARY = "Translations for package gigolo"
DESCRIPTION = "Provides translations for the 'gigolo' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "gigolo-lang-0.6.0-1.6.noarch.rpm"
RPM_HASH = "f426330847d31e174afd112dc3ea3995fe0304d0d2921a11dc136d0b3baaa0a484414a73cbcc0cad82c74aadd652a8402b4aab2b5abcb55360e3139e7ddb91f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gigolo-lang \
gigolo-lang-all \
locale-gigolo-ar \
locale-gigolo-ast \
locale-gigolo-be \
locale-gigolo-bg \
locale-gigolo-ca \
locale-gigolo-cs \
locale-gigolo-da \
locale-gigolo-de \
locale-gigolo-el \
locale-gigolo-en-AU \
locale-gigolo-en-CA \
locale-gigolo-en-GB \
locale-gigolo-eo \
locale-gigolo-es \
locale-gigolo-et \
locale-gigolo-eu \
locale-gigolo-fi \
locale-gigolo-fr \
locale-gigolo-gl \
locale-gigolo-he \
locale-gigolo-hr \
locale-gigolo-hu \
locale-gigolo-id \
locale-gigolo-is \
locale-gigolo-it \
locale-gigolo-ja \
locale-gigolo-kk \
locale-gigolo-ko \
locale-gigolo-lt \
locale-gigolo-lv \
locale-gigolo-ms \
locale-gigolo-nb \
locale-gigolo-nl \
locale-gigolo-oc \
locale-gigolo-pl \
locale-gigolo-pt \
locale-gigolo-pt-BR \
locale-gigolo-ro \
locale-gigolo-ru \
locale-gigolo-sk \
locale-gigolo-sl \
locale-gigolo-sq \
locale-gigolo-sr \
locale-gigolo-sv \
locale-gigolo-te \
locale-gigolo-th \
locale-gigolo-tr \
locale-gigolo-ug \
locale-gigolo-uk \
locale-gigolo-zh-CN \
locale-gigolo-zh-TW"

RDEPENDS:${PN} += "gigolo"

inherit rpm
