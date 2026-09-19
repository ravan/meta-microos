SUMMARY = "Translations for package pidgin-plugin-birthday-reminder"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-birthday-reminder' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "pidgin-plugin-birthday-reminder-lang-1.13-1.16.noarch.rpm"
RPM_HASH = "7b4ad9ae8319acb91e8a7d09c98386978ef27449a4f11cc1abf2aebef45727119213fb91d2f07d1b8e9e562fcb2adf99acff357a26dabcb3f78342fddbe9758c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pidgin-plugin-birthday-reminder-cs \
locale-pidgin-plugin-birthday-reminder-de \
locale-pidgin-plugin-birthday-reminder-el \
locale-pidgin-plugin-birthday-reminder-es \
locale-pidgin-plugin-birthday-reminder-fr \
locale-pidgin-plugin-birthday-reminder-gl \
locale-pidgin-plugin-birthday-reminder-he \
locale-pidgin-plugin-birthday-reminder-it \
locale-pidgin-plugin-birthday-reminder-lt \
locale-pidgin-plugin-birthday-reminder-nl \
locale-pidgin-plugin-birthday-reminder-pl \
locale-pidgin-plugin-birthday-reminder-pt \
locale-pidgin-plugin-birthday-reminder-pt-BR \
locale-pidgin-plugin-birthday-reminder-ru \
locale-pidgin-plugin-birthday-reminder-sk \
locale-pidgin-plugin-birthday-reminder-ta \
locale-pidgin-plugin-birthday-reminder-tr \
pidgin-plugin-birthday-reminder-lang \
pidgin-plugin-birthday-reminder-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-birthday-reminder"

inherit rpm
