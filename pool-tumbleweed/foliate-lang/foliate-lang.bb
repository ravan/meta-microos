SUMMARY = "Translations for package foliate"
DESCRIPTION = "Provides translations for the 'foliate' package."
LICENSE = "GPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "foliate-lang-3.3.0-3.2.noarch.rpm"
RPM_HASH = "c84c5ae9855f1e3f2301e229dfd71117820613456f9529554d38fd105629c116eb0da823ee2e3bb148b41b2cca8e9646f6e828993d35565ce3b1363bfee75360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foliate-lang \
foliate-lang-all \
locale-foliate-ar \
locale-foliate-cs \
locale-foliate-de \
locale-foliate-el \
locale-foliate-es \
locale-foliate-eu \
locale-foliate-fr \
locale-foliate-gl \
locale-foliate-he \
locale-foliate-hi \
locale-foliate-hr \
locale-foliate-hu \
locale-foliate-id \
locale-foliate-it \
locale-foliate-ja \
locale-foliate-ko \
locale-foliate-nb \
locale-foliate-nl \
locale-foliate-nn \
locale-foliate-oc \
locale-foliate-pt-BR \
locale-foliate-ru \
locale-foliate-sr \
locale-foliate-sv \
locale-foliate-tr \
locale-foliate-uk \
locale-foliate-zh-CN \
locale-foliate-zh-TW"

RDEPENDS:${PN} += "foliate"

inherit rpm
