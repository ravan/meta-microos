SUMMARY = "Translations for package zathura"
DESCRIPTION = "Provides translations for the 'zathura' package."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-lang-2026.07.18-1.1.noarch.rpm"
RPM_HASH = "c713892e20d271d2bbf42c9e89591c153c57cc842dbedcc119350a1402b48296f49064a258de24619ae9f5e2157a187c9415de3bf8e6e6e3b39da95b489fb494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zathura-ar \
locale-zathura-ca \
locale-zathura-cs \
locale-zathura-de \
locale-zathura-el \
locale-zathura-eo \
locale-zathura-es \
locale-zathura-es-CL \
locale-zathura-et \
locale-zathura-fr \
locale-zathura-he \
locale-zathura-hu \
locale-zathura-id \
locale-zathura-it \
locale-zathura-ka \
locale-zathura-lt \
locale-zathura-nl \
locale-zathura-pl \
locale-zathura-pt \
locale-zathura-pt-BR \
locale-zathura-ru \
locale-zathura-sv \
locale-zathura-tr \
locale-zathura-uk \
locale-zathura-zh-CN \
zathura-lang \
zathura-lang-all"

RDEPENDS:${PN} += "zathura"

inherit rpm
