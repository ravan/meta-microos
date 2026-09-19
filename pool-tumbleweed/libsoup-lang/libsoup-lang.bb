SUMMARY = "Translations for package libsoup"
DESCRIPTION = "Provides translations for the 'libsoup' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.6"

RPM_NAME = "libsoup-lang-3.6.6-8.1.noarch.rpm"
RPM_HASH = "3a30d37e807b1282c1b77a2aa0a1fe50ecf39a38349e0d72e50bf99dcb65b6b36ad60f15e5aaa32180e7d5664c410418ef28607d7cbddc5dcf9bd45f4f23fc4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsoup-lang \
libsoup-lang-all \
locale-libsoup-as \
locale-libsoup-be \
locale-libsoup-bg \
locale-libsoup-bn-IN \
locale-libsoup-bs \
locale-libsoup-ca \
locale-libsoup-ca@valencia \
locale-libsoup-cs \
locale-libsoup-da \
locale-libsoup-de \
locale-libsoup-el \
locale-libsoup-en-GB \
locale-libsoup-eo \
locale-libsoup-es \
locale-libsoup-et \
locale-libsoup-eu \
locale-libsoup-fa \
locale-libsoup-fi \
locale-libsoup-fr \
locale-libsoup-fur \
locale-libsoup-gd \
locale-libsoup-gl \
locale-libsoup-gu \
locale-libsoup-he \
locale-libsoup-hi \
locale-libsoup-hr \
locale-libsoup-hu \
locale-libsoup-id \
locale-libsoup-it \
locale-libsoup-ja \
locale-libsoup-ka \
locale-libsoup-kk \
locale-libsoup-kn \
locale-libsoup-ko \
locale-libsoup-lt \
locale-libsoup-lv \
locale-libsoup-ml \
locale-libsoup-mr \
locale-libsoup-ms \
locale-libsoup-nb \
locale-libsoup-ne \
locale-libsoup-nl \
locale-libsoup-oc \
locale-libsoup-or \
locale-libsoup-pa \
locale-libsoup-pl \
locale-libsoup-pt \
locale-libsoup-pt-BR \
locale-libsoup-ro \
locale-libsoup-ru \
locale-libsoup-sk \
locale-libsoup-sl \
locale-libsoup-sr \
locale-libsoup-sr@latin \
locale-libsoup-sv \
locale-libsoup-ta \
locale-libsoup-te \
locale-libsoup-th \
locale-libsoup-tr \
locale-libsoup-ug \
locale-libsoup-uk \
locale-libsoup-vi \
locale-libsoup-zh-CN \
locale-libsoup-zh-HK \
locale-libsoup-zh-TW"

RDEPENDS:${PN} += "libsoup"

inherit rpm
