SUMMARY = "Translations for package policycoreutils"
DESCRIPTION = "Provides translations for the 'policycoreutils' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "policycoreutils-lang-3.11-2.2.noarch.rpm"
RPM_HASH = "dc4d0c2fcf4bc390d5cd07f6d073b96eaf7636118e92a7bd7c5ff247292d9b93ed51e73eefac87848cbada13bd19a5492627126f379ab71fdf6e194510f2d821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-policycoreutils-af \
locale-policycoreutils-ar \
locale-policycoreutils-as \
locale-policycoreutils-ast \
locale-policycoreutils-az \
locale-policycoreutils-be \
locale-policycoreutils-bg \
locale-policycoreutils-bn \
locale-policycoreutils-bn-IN \
locale-policycoreutils-br \
locale-policycoreutils-bs \
locale-policycoreutils-ca \
locale-policycoreutils-cs \
locale-policycoreutils-cy \
locale-policycoreutils-da \
locale-policycoreutils-de \
locale-policycoreutils-de-CH \
locale-policycoreutils-dz \
locale-policycoreutils-el \
locale-policycoreutils-en-GB \
locale-policycoreutils-eo \
locale-policycoreutils-es \
locale-policycoreutils-es-MX \
locale-policycoreutils-et \
locale-policycoreutils-eu \
locale-policycoreutils-fa \
locale-policycoreutils-fi \
locale-policycoreutils-fr \
locale-policycoreutils-ga \
locale-policycoreutils-gl \
locale-policycoreutils-gu \
locale-policycoreutils-he \
locale-policycoreutils-hi \
locale-policycoreutils-hr \
locale-policycoreutils-hu \
locale-policycoreutils-ia \
locale-policycoreutils-id \
locale-policycoreutils-is \
locale-policycoreutils-it \
locale-policycoreutils-ja \
locale-policycoreutils-ka \
locale-policycoreutils-kk \
locale-policycoreutils-km \
locale-policycoreutils-kn \
locale-policycoreutils-ko \
locale-policycoreutils-lt \
locale-policycoreutils-lv \
locale-policycoreutils-mai \
locale-policycoreutils-mk \
locale-policycoreutils-ml \
locale-policycoreutils-mr \
locale-policycoreutils-ms \
locale-policycoreutils-nb \
locale-policycoreutils-nds \
locale-policycoreutils-ne \
locale-policycoreutils-nl \
locale-policycoreutils-nn \
locale-policycoreutils-or \
locale-policycoreutils-pa \
locale-policycoreutils-pl \
locale-policycoreutils-pt \
locale-policycoreutils-pt-BR \
locale-policycoreutils-ro \
locale-policycoreutils-ru \
locale-policycoreutils-si \
locale-policycoreutils-sk \
locale-policycoreutils-sl \
locale-policycoreutils-sq \
locale-policycoreutils-sr \
locale-policycoreutils-sr@latin \
locale-policycoreutils-sv \
locale-policycoreutils-ta \
locale-policycoreutils-te \
locale-policycoreutils-th \
locale-policycoreutils-tr \
locale-policycoreutils-uk \
locale-policycoreutils-vi \
locale-policycoreutils-zh-CN \
locale-policycoreutils-zh-HK \
locale-policycoreutils-zh-TW \
policycoreutils-lang \
policycoreutils-lang-all"

RDEPENDS:${PN} += "policycoreutils"

inherit rpm
