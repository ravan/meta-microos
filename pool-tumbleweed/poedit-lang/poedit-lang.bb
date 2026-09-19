SUMMARY = "Translations for package poedit"
DESCRIPTION = "Provides translations for the 'poedit' package."
LICENSE = "MIT"

PV = "3.9.1"

RPM_NAME = "poedit-lang-3.9.1-1.2.noarch.rpm"
RPM_HASH = "c1efb5b0e75d04ec43af6e34a7cafda5d34953ab6857269509fbecd81d67a5b5d0de5497ee6a9db37887f36a51af30bdb483d10006724448d829e8d4e8082801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-poedit-af \
locale-poedit-ar \
locale-poedit-az \
locale-poedit-be \
locale-poedit-bg \
locale-poedit-bs \
locale-poedit-ca \
locale-poedit-cs \
locale-poedit-da \
locale-poedit-de \
locale-poedit-el \
locale-poedit-en-GB \
locale-poedit-es \
locale-poedit-et \
locale-poedit-eu \
locale-poedit-fa \
locale-poedit-fi \
locale-poedit-fr \
locale-poedit-ga \
locale-poedit-gl \
locale-poedit-he \
locale-poedit-hr \
locale-poedit-hu \
locale-poedit-id \
locale-poedit-is \
locale-poedit-it \
locale-poedit-ja \
locale-poedit-ka \
locale-poedit-kk \
locale-poedit-ko \
locale-poedit-lt \
locale-poedit-lv \
locale-poedit-ms \
locale-poedit-nb \
locale-poedit-nl \
locale-poedit-oc \
locale-poedit-pa \
locale-poedit-pl \
locale-poedit-pt-BR \
locale-poedit-pt-PT \
locale-poedit-ro \
locale-poedit-ru \
locale-poedit-sk \
locale-poedit-sl \
locale-poedit-sq \
locale-poedit-sr \
locale-poedit-sr@latin \
locale-poedit-sv \
locale-poedit-th \
locale-poedit-tr \
locale-poedit-ug \
locale-poedit-uk \
locale-poedit-vi \
locale-poedit-zh-CN \
locale-poedit-zh-TW \
poedit-lang \
poedit-lang-all"

RDEPENDS:${PN} += "poedit"

inherit rpm
