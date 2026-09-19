SUMMARY = "Translations for package amberol"
DESCRIPTION = "Provides translations for the 'amberol' package."
LICENSE = "CC-BY-SA-3.0 & CC0-1.0 & GPL-3.0-or-later"

PV = "2026.1"

RPM_NAME = "amberol-lang-2026.1-1.4.noarch.rpm"
RPM_HASH = "c2612e95b0e1f718a5cbab91caa3772e716e99ba5755e0813a696502729ba19c3bc782de6af795f7deceb9049df9ea1105cceaa2726eceee4cc6083c76632848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amberol-lang \
amberol-lang-all \
locale-amberol-ar \
locale-amberol-az \
locale-amberol-be \
locale-amberol-bg \
locale-amberol-ca \
locale-amberol-cs \
locale-amberol-da \
locale-amberol-de \
locale-amberol-el \
locale-amberol-en-GB \
locale-amberol-eo \
locale-amberol-es \
locale-amberol-eu \
locale-amberol-fa \
locale-amberol-fi \
locale-amberol-fr \
locale-amberol-fur \
locale-amberol-gl \
locale-amberol-he \
locale-amberol-hi \
locale-amberol-hr \
locale-amberol-hu \
locale-amberol-ia \
locale-amberol-id \
locale-amberol-is \
locale-amberol-it \
locale-amberol-ka \
locale-amberol-kk \
locale-amberol-ko \
locale-amberol-lt \
locale-amberol-ml \
locale-amberol-nb \
locale-amberol-ne \
locale-amberol-nl \
locale-amberol-oc \
locale-amberol-pl \
locale-amberol-pt \
locale-amberol-pt-BR \
locale-amberol-ro \
locale-amberol-ru \
locale-amberol-sk \
locale-amberol-sl \
locale-amberol-sr \
locale-amberol-sv \
locale-amberol-tr \
locale-amberol-uk \
locale-amberol-zh-CN"

RDEPENDS:${PN} += "amberol"

inherit rpm
