SUMMARY = "Translations for package libgtop"
DESCRIPTION = "Provides translations for the 'libgtop' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.41.3+4"

RPM_NAME = "libgtop-lang-2.41.3+4-3.3.noarch.rpm"
RPM_HASH = "f20435138868c15d0a9095cecd57b4a50650bf5b64f1fc10313c983607248f58bf3726bdcebd20efe5c89a28e2772c0fd2edbc751490211dfbab87c034bdf1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgtop-lang \
libgtop-lang-all \
locale-libgtop-ar \
locale-libgtop-as \
locale-libgtop-ast \
locale-libgtop-az \
locale-libgtop-be \
locale-libgtop-bg \
locale-libgtop-bn \
locale-libgtop-bn-IN \
locale-libgtop-bs \
locale-libgtop-ca \
locale-libgtop-ca@valencia \
locale-libgtop-cs \
locale-libgtop-cy \
locale-libgtop-da \
locale-libgtop-de \
locale-libgtop-dz \
locale-libgtop-el \
locale-libgtop-en-CA \
locale-libgtop-en-GB \
locale-libgtop-en@shaw \
locale-libgtop-eo \
locale-libgtop-es \
locale-libgtop-et \
locale-libgtop-eu \
locale-libgtop-fa \
locale-libgtop-fi \
locale-libgtop-fr \
locale-libgtop-fur \
locale-libgtop-ga \
locale-libgtop-gl \
locale-libgtop-gu \
locale-libgtop-he \
locale-libgtop-hi \
locale-libgtop-hr \
locale-libgtop-hu \
locale-libgtop-id \
locale-libgtop-it \
locale-libgtop-ja \
locale-libgtop-ka \
locale-libgtop-kn \
locale-libgtop-ko \
locale-libgtop-lt \
locale-libgtop-lv \
locale-libgtop-mai \
locale-libgtop-mk \
locale-libgtop-ml \
locale-libgtop-mr \
locale-libgtop-ms \
locale-libgtop-nb \
locale-libgtop-ne \
locale-libgtop-nl \
locale-libgtop-nn \
locale-libgtop-oc \
locale-libgtop-or \
locale-libgtop-pa \
locale-libgtop-pl \
locale-libgtop-pt \
locale-libgtop-pt-BR \
locale-libgtop-ro \
locale-libgtop-ru \
locale-libgtop-sk \
locale-libgtop-sl \
locale-libgtop-sq \
locale-libgtop-sr \
locale-libgtop-sr@latin \
locale-libgtop-sv \
locale-libgtop-ta \
locale-libgtop-te \
locale-libgtop-th \
locale-libgtop-tr \
locale-libgtop-ug \
locale-libgtop-uk \
locale-libgtop-vi \
locale-libgtop-zh-CN \
locale-libgtop-zh-HK \
locale-libgtop-zh-TW"

RDEPENDS:${PN} += "libgtop"

inherit rpm
