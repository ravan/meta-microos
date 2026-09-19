SUMMARY = "Translations for package template-glib"
DESCRIPTION = "Provides translations for the 'template-glib' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "template-glib-lang-3.40.0-1.4.noarch.rpm"
RPM_HASH = "1e3ca89a964eb1e88b77f6cd73a0decfb80c191311de33cf5dd37b79b14dc126a6a6e2564baa67b15b5a0b338f0f08baeccd3538a97881b2b235f02fe3aebd24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-template-glib-ar \
locale-template-glib-bg \
locale-template-glib-ca \
locale-template-glib-cs \
locale-template-glib-da \
locale-template-glib-de \
locale-template-glib-el \
locale-template-glib-en-GB \
locale-template-glib-es \
locale-template-glib-eu \
locale-template-glib-fr \
locale-template-glib-fur \
locale-template-glib-hi \
locale-template-glib-hr \
locale-template-glib-hu \
locale-template-glib-id \
locale-template-glib-it \
locale-template-glib-ka \
locale-template-glib-kk \
locale-template-glib-lt \
locale-template-glib-nl \
locale-template-glib-pl \
locale-template-glib-pt \
locale-template-glib-pt-BR \
locale-template-glib-ro \
locale-template-glib-ru \
locale-template-glib-sl \
locale-template-glib-sr \
locale-template-glib-sv \
locale-template-glib-tr \
locale-template-glib-uk \
locale-template-glib-zh-CN \
template-glib-lang \
template-glib-lang-all"

RDEPENDS:${PN} += "template-glib"

inherit rpm
