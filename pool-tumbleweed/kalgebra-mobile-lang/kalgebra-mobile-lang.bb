SUMMARY = "Translations for package kalgebra-mobile"
DESCRIPTION = "Provides translations for the 'kalgebra-mobile' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kalgebra-mobile-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "2cdc0fb9d5b9a6953a770bd5ced04d63e5e11af03a3edc2c553f50b3fc668fe8dfd5df2aee420ed91df2984031aaa9247b7d0bfd367c929c0a5f9f5a0a7b098d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalgebra-mobile-lang \
kalgebra-mobile-lang-all \
locale-kalgebra-mobile-ar \
locale-kalgebra-mobile-ast \
locale-kalgebra-mobile-bg \
locale-kalgebra-mobile-ca \
locale-kalgebra-mobile-ca@valencia \
locale-kalgebra-mobile-cs \
locale-kalgebra-mobile-de \
locale-kalgebra-mobile-el \
locale-kalgebra-mobile-en-GB \
locale-kalgebra-mobile-eo \
locale-kalgebra-mobile-es \
locale-kalgebra-mobile-et \
locale-kalgebra-mobile-eu \
locale-kalgebra-mobile-fi \
locale-kalgebra-mobile-fr \
locale-kalgebra-mobile-ga \
locale-kalgebra-mobile-gl \
locale-kalgebra-mobile-he \
locale-kalgebra-mobile-hi \
locale-kalgebra-mobile-hu \
locale-kalgebra-mobile-ia \
locale-kalgebra-mobile-it \
locale-kalgebra-mobile-ja \
locale-kalgebra-mobile-ka \
locale-kalgebra-mobile-ko \
locale-kalgebra-mobile-lt \
locale-kalgebra-mobile-lv \
locale-kalgebra-mobile-ml \
locale-kalgebra-mobile-nl \
locale-kalgebra-mobile-nn \
locale-kalgebra-mobile-pa \
locale-kalgebra-mobile-pl \
locale-kalgebra-mobile-pt \
locale-kalgebra-mobile-pt-BR \
locale-kalgebra-mobile-ru \
locale-kalgebra-mobile-sk \
locale-kalgebra-mobile-sl \
locale-kalgebra-mobile-sv \
locale-kalgebra-mobile-tr \
locale-kalgebra-mobile-ug \
locale-kalgebra-mobile-uk \
locale-kalgebra-mobile-zh-CN \
locale-kalgebra-mobile-zh-TW"

RDEPENDS:${PN} += "kalgebra-mobile"

inherit rpm
