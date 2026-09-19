SUMMARY = "Translations for package endeavour"
DESCRIPTION = "Provides translations for the 'endeavour' package."
LICENSE = "GPL-3.0-or-later"

PV = "43.0.git.170"

RPM_NAME = "endeavour-lang-43.0.git.170-1.3.noarch.rpm"
RPM_HASH = "8b4afff2501aa4ae3374e2624943b0ddadab4aebf883d18adf2dfb092f8c712e80b8fe15f013d134db8114e1614de4b65da19bb148949dfa47cd2d94e79dad6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "endeavour-lang \
endeavour-lang-all \
locale-endeavour-af \
locale-endeavour-ar \
locale-endeavour-be \
locale-endeavour-bg \
locale-endeavour-ca \
locale-endeavour-ca@valencia \
locale-endeavour-cs \
locale-endeavour-da \
locale-endeavour-de \
locale-endeavour-el \
locale-endeavour-en-GB \
locale-endeavour-eo \
locale-endeavour-es \
locale-endeavour-et \
locale-endeavour-eu \
locale-endeavour-fa \
locale-endeavour-fi \
locale-endeavour-fr \
locale-endeavour-fur \
locale-endeavour-gl \
locale-endeavour-he \
locale-endeavour-hi \
locale-endeavour-hr \
locale-endeavour-hu \
locale-endeavour-id \
locale-endeavour-is \
locale-endeavour-it \
locale-endeavour-ja \
locale-endeavour-ka \
locale-endeavour-kk \
locale-endeavour-ko \
locale-endeavour-lt \
locale-endeavour-lv \
locale-endeavour-ml \
locale-endeavour-ms \
locale-endeavour-nb \
locale-endeavour-ne \
locale-endeavour-nl \
locale-endeavour-oc \
locale-endeavour-pa \
locale-endeavour-pl \
locale-endeavour-pt \
locale-endeavour-pt-BR \
locale-endeavour-ro \
locale-endeavour-ru \
locale-endeavour-sk \
locale-endeavour-sl \
locale-endeavour-sr \
locale-endeavour-sr@latin \
locale-endeavour-sv \
locale-endeavour-th \
locale-endeavour-tr \
locale-endeavour-uk \
locale-endeavour-vi \
locale-endeavour-zh-CN \
locale-endeavour-zh-TW"

RDEPENDS:${PN} += "endeavour"

inherit rpm
