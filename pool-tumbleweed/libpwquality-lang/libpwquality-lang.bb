SUMMARY = "Translations for package libpwquality"
DESCRIPTION = "Provides translations for the 'libpwquality' package."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality-lang-1.4.5-5.9.noarch.rpm"
RPM_HASH = "4a361e9fd575b2cd6b250d21e3b2bcdb366a366330ab38c75faf1122bedc409147b4fabc830ca996b6ac616d30bcfe73859e69843f1165593c8b55f8b34974b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpwquality-lang \
libpwquality-lang-all \
locale-libpwquality-ar \
locale-libpwquality-as \
locale-libpwquality-az \
locale-libpwquality-bg \
locale-libpwquality-bn-IN \
locale-libpwquality-ca \
locale-libpwquality-cs \
locale-libpwquality-da \
locale-libpwquality-de \
locale-libpwquality-es \
locale-libpwquality-eu \
locale-libpwquality-fa \
locale-libpwquality-fi \
locale-libpwquality-fr \
locale-libpwquality-fur \
locale-libpwquality-gu \
locale-libpwquality-he \
locale-libpwquality-hi \
locale-libpwquality-hu \
locale-libpwquality-id \
locale-libpwquality-it \
locale-libpwquality-ja \
locale-libpwquality-ka \
locale-libpwquality-kk \
locale-libpwquality-km \
locale-libpwquality-kn \
locale-libpwquality-ko \
locale-libpwquality-ml \
locale-libpwquality-mr \
locale-libpwquality-nb \
locale-libpwquality-nl \
locale-libpwquality-or \
locale-libpwquality-pa \
locale-libpwquality-pl \
locale-libpwquality-pt \
locale-libpwquality-pt-BR \
locale-libpwquality-ru \
locale-libpwquality-si \
locale-libpwquality-sk \
locale-libpwquality-sq \
locale-libpwquality-sr \
locale-libpwquality-sr@latin \
locale-libpwquality-sv \
locale-libpwquality-ta \
locale-libpwquality-te \
locale-libpwquality-tr \
locale-libpwquality-uk \
locale-libpwquality-vi \
locale-libpwquality-zh-CN \
locale-libpwquality-zh-TW"

RDEPENDS:${PN} += "libpwquality"

inherit rpm
