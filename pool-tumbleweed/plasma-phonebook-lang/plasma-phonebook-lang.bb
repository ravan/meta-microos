SUMMARY = "Translations for package plasma-phonebook"
DESCRIPTION = "Provides translations for the 'plasma-phonebook' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "plasma-phonebook-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "a7cb15eeb62c81143f094d72a3f40bc4378c1b381ad406308e2d527d5cba68fc740ca549086e5e72ec7d0eab3c2882097458e1c856d108a4bd2ef7386ed5f42f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-phonebook-ar \
locale-plasma-phonebook-ast \
locale-plasma-phonebook-az \
locale-plasma-phonebook-ca \
locale-plasma-phonebook-ca@valencia \
locale-plasma-phonebook-cs \
locale-plasma-phonebook-da \
locale-plasma-phonebook-de \
locale-plasma-phonebook-en-GB \
locale-plasma-phonebook-eo \
locale-plasma-phonebook-es \
locale-plasma-phonebook-et \
locale-plasma-phonebook-eu \
locale-plasma-phonebook-fi \
locale-plasma-phonebook-fr \
locale-plasma-phonebook-ga \
locale-plasma-phonebook-gl \
locale-plasma-phonebook-he \
locale-plasma-phonebook-hi \
locale-plasma-phonebook-hu \
locale-plasma-phonebook-ia \
locale-plasma-phonebook-is \
locale-plasma-phonebook-it \
locale-plasma-phonebook-ja \
locale-plasma-phonebook-ka \
locale-plasma-phonebook-ko \
locale-plasma-phonebook-lt \
locale-plasma-phonebook-lv \
locale-plasma-phonebook-nl \
locale-plasma-phonebook-nn \
locale-plasma-phonebook-pa \
locale-plasma-phonebook-pl \
locale-plasma-phonebook-pt \
locale-plasma-phonebook-pt-BR \
locale-plasma-phonebook-ro \
locale-plasma-phonebook-ru \
locale-plasma-phonebook-sk \
locale-plasma-phonebook-sl \
locale-plasma-phonebook-sv \
locale-plasma-phonebook-tr \
locale-plasma-phonebook-ug \
locale-plasma-phonebook-uk \
locale-plasma-phonebook-vi \
locale-plasma-phonebook-zh-CN \
locale-plasma-phonebook-zh-TW \
plasma-phonebook-lang \
plasma-phonebook-lang-all"

RDEPENDS:${PN} += "plasma-phonebook"

inherit rpm
