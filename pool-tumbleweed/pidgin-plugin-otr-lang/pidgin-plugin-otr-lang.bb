SUMMARY = "Translations for package pidgin-plugin-otr"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-otr' package."
LICENSE = "GPL-2.0+"

PV = "4.0.2"

RPM_NAME = "pidgin-plugin-otr-lang-4.0.2-3.35.noarch.rpm"
RPM_HASH = "8d47ae215ee580e31aaf82204260fbeff9df503444e659a9ff7dd1b7e47ffffeb140d4a34a3cf9bb589009a3ea13bd6c208e33328a4a53ef9db26fca82d233ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pidgin-plugin-otr-ar \
locale-pidgin-plugin-otr-cs \
locale-pidgin-plugin-otr-da \
locale-pidgin-plugin-otr-de \
locale-pidgin-plugin-otr-el \
locale-pidgin-plugin-otr-es \
locale-pidgin-plugin-otr-fa \
locale-pidgin-plugin-otr-fi \
locale-pidgin-plugin-otr-fr \
locale-pidgin-plugin-otr-hu \
locale-pidgin-plugin-otr-it \
locale-pidgin-plugin-otr-nb-NO \
locale-pidgin-plugin-otr-nl \
locale-pidgin-plugin-otr-nn \
locale-pidgin-plugin-otr-pl \
locale-pidgin-plugin-otr-pt-BR \
locale-pidgin-plugin-otr-ru \
locale-pidgin-plugin-otr-sk \
locale-pidgin-plugin-otr-sv \
locale-pidgin-plugin-otr-vi \
locale-pidgin-plugin-otr-zh-CN \
pidgin-plugin-otr-lang \
pidgin-plugin-otr-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-otr"

inherit rpm
