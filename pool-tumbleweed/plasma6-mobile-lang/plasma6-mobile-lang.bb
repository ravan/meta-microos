SUMMARY = "Translations for package plasma6-mobile"
DESCRIPTION = "Provides translations for the 'plasma6-mobile' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-mobile-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "845cbcbe04ef021873a09d74aa4eb90887a3b638c9a2c38f374efc266d8996e25d48bd79bfbef65c0582bc81fef0eec5a144c5ee0bd49c84109cfcbd3e144d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-mobile-ar \
locale-plasma6-mobile-ast \
locale-plasma6-mobile-az \
locale-plasma6-mobile-ca \
locale-plasma6-mobile-ca@valencia \
locale-plasma6-mobile-cs \
locale-plasma6-mobile-da \
locale-plasma6-mobile-de \
locale-plasma6-mobile-en-GB \
locale-plasma6-mobile-eo \
locale-plasma6-mobile-es \
locale-plasma6-mobile-et \
locale-plasma6-mobile-eu \
locale-plasma6-mobile-fi \
locale-plasma6-mobile-fr \
locale-plasma6-mobile-ga \
locale-plasma6-mobile-gl \
locale-plasma6-mobile-he \
locale-plasma6-mobile-hi \
locale-plasma6-mobile-hu \
locale-plasma6-mobile-ia \
locale-plasma6-mobile-id \
locale-plasma6-mobile-is \
locale-plasma6-mobile-it \
locale-plasma6-mobile-ja \
locale-plasma6-mobile-ka \
locale-plasma6-mobile-ko \
locale-plasma6-mobile-lt \
locale-plasma6-mobile-lv \
locale-plasma6-mobile-nl \
locale-plasma6-mobile-nn \
locale-plasma6-mobile-pa \
locale-plasma6-mobile-pl \
locale-plasma6-mobile-pt \
locale-plasma6-mobile-pt-BR \
locale-plasma6-mobile-ro \
locale-plasma6-mobile-ru \
locale-plasma6-mobile-sk \
locale-plasma6-mobile-sl \
locale-plasma6-mobile-sv \
locale-plasma6-mobile-ta \
locale-plasma6-mobile-tr \
locale-plasma6-mobile-uk \
locale-plasma6-mobile-vi \
locale-plasma6-mobile-zh-CN \
locale-plasma6-mobile-zh-TW \
plasma6-mobile-lang \
plasma6-mobile-lang-all"

RDEPENDS:${PN} += "plasma6-mobile"

inherit rpm
