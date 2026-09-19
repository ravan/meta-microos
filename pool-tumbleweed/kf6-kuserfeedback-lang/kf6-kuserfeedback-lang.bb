SUMMARY = "Translations for package kf6-kuserfeedback"
DESCRIPTION = "Provides translations for the 'kf6-kuserfeedback' package."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "kf6-kuserfeedback-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "ae83254f08be22d3536a8d4f23e85bb5b6f3e311d05c41cffe44e13913848e60500a0a74d2608684c81ed5328aecd1473acd1e520534ed330b81953faaa32062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kuserfeedback-lang \
kf6-kuserfeedback-lang-all \
locale-kf6-kuserfeedback-ar \
locale-kf6-kuserfeedback-ast \
locale-kf6-kuserfeedback-az \
locale-kf6-kuserfeedback-bg \
locale-kf6-kuserfeedback-ca \
locale-kf6-kuserfeedback-ca@valencia \
locale-kf6-kuserfeedback-cs \
locale-kf6-kuserfeedback-da \
locale-kf6-kuserfeedback-de \
locale-kf6-kuserfeedback-en-GB \
locale-kf6-kuserfeedback-eo \
locale-kf6-kuserfeedback-es \
locale-kf6-kuserfeedback-et \
locale-kf6-kuserfeedback-eu \
locale-kf6-kuserfeedback-fi \
locale-kf6-kuserfeedback-fr \
locale-kf6-kuserfeedback-ga \
locale-kf6-kuserfeedback-gl \
locale-kf6-kuserfeedback-he \
locale-kf6-kuserfeedback-hi \
locale-kf6-kuserfeedback-hu \
locale-kf6-kuserfeedback-ia \
locale-kf6-kuserfeedback-id \
locale-kf6-kuserfeedback-is \
locale-kf6-kuserfeedback-it \
locale-kf6-kuserfeedback-ja \
locale-kf6-kuserfeedback-ka \
locale-kf6-kuserfeedback-ko \
locale-kf6-kuserfeedback-lt \
locale-kf6-kuserfeedback-lv \
locale-kf6-kuserfeedback-nl \
locale-kf6-kuserfeedback-nn \
locale-kf6-kuserfeedback-pl \
locale-kf6-kuserfeedback-pt \
locale-kf6-kuserfeedback-pt-BR \
locale-kf6-kuserfeedback-ro \
locale-kf6-kuserfeedback-ru \
locale-kf6-kuserfeedback-sk \
locale-kf6-kuserfeedback-sl \
locale-kf6-kuserfeedback-sv \
locale-kf6-kuserfeedback-ta \
locale-kf6-kuserfeedback-tr \
locale-kf6-kuserfeedback-ug \
locale-kf6-kuserfeedback-uk \
locale-kf6-kuserfeedback-zh-CN \
locale-kf6-kuserfeedback-zh-TW"

RDEPENDS:${PN} += "kf6-kuserfeedback"

inherit rpm
