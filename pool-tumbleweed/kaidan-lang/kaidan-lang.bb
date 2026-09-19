SUMMARY = "Translations for package kaidan"
DESCRIPTION = "Provides translations for the 'kaidan' package."
LICENSE = "AML & GPL-3.0-or-later & SUSE-GPL-3.0+-with-openssl-exception & MIT & CC-BY-SA-4.0"

PV = "0.16.0"

RPM_NAME = "kaidan-lang-0.16.0-1.2.noarch.rpm"
RPM_HASH = "6364c27aff9af5d31960e07c774e8fe021d63dfadfe681294aece54d208de860fef92eb2d0919c037112c7fbdba79fb429d2ae5b207740c3ecdb0734deba9250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaidan-lang \
kaidan-lang-all \
locale-kaidan-ar \
locale-kaidan-ca \
locale-kaidan-ca@valencia \
locale-kaidan-cs \
locale-kaidan-de \
locale-kaidan-el \
locale-kaidan-en-GB \
locale-kaidan-eo \
locale-kaidan-es \
locale-kaidan-eu \
locale-kaidan-fi \
locale-kaidan-fr \
locale-kaidan-ga \
locale-kaidan-gl \
locale-kaidan-he \
locale-kaidan-hu \
locale-kaidan-it \
locale-kaidan-ja \
locale-kaidan-ka \
locale-kaidan-ko \
locale-kaidan-lt \
locale-kaidan-mr \
locale-kaidan-ms \
locale-kaidan-nb \
locale-kaidan-nl \
locale-kaidan-pa \
locale-kaidan-pl \
locale-kaidan-pt \
locale-kaidan-pt-BR \
locale-kaidan-ru \
locale-kaidan-sk \
locale-kaidan-sl \
locale-kaidan-sv \
locale-kaidan-tr \
locale-kaidan-uk \
locale-kaidan-zh-CN \
locale-kaidan-zh-TW"

RDEPENDS:${PN} += "kaidan"

inherit rpm
