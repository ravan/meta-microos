SUMMARY = "Translations for package resources"
DESCRIPTION = "Provides translations for the 'resources' package."
LICENSE = "GPL-3.0-or-later"

PV = "51.0"

RPM_NAME = "resources-lang-51.0-1.1.noarch.rpm"
RPM_HASH = "d969655885b58d638e59c57d08402e8a9410edf1a6375212e75965232dd5ff7988c5871273e81743a8c69ef9ea55f70e92da9ef04ccfe02f7f9323d68a16ad0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-resources-ar \
locale-resources-be \
locale-resources-bg \
locale-resources-bn \
locale-resources-ca \
locale-resources-cs \
locale-resources-de \
locale-resources-el \
locale-resources-en-GB \
locale-resources-eo \
locale-resources-es \
locale-resources-eu \
locale-resources-fa \
locale-resources-fi \
locale-resources-fr \
locale-resources-he \
locale-resources-hi \
locale-resources-hu \
locale-resources-it \
locale-resources-ja \
locale-resources-ka \
locale-resources-kk \
locale-resources-nb \
locale-resources-nl \
locale-resources-nn \
locale-resources-oc \
locale-resources-pl \
locale-resources-pt \
locale-resources-pt-BR \
locale-resources-ro \
locale-resources-ru \
locale-resources-sk \
locale-resources-sl \
locale-resources-sr \
locale-resources-sv \
locale-resources-tr \
locale-resources-uk \
locale-resources-vi \
locale-resources-zh-CN \
locale-resources-zh-TW \
resources-lang \
resources-lang-all"

RDEPENDS:${PN} += "resources"

inherit rpm
