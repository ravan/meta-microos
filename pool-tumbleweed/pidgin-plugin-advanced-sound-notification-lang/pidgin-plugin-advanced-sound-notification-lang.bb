SUMMARY = "Translations for package pidgin-plugin-advanced-sound-notification"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-advanced-sound-notification' package."
LICENSE = "GPL-2.0+"

PV = "1.2.1"

RPM_NAME = "pidgin-plugin-advanced-sound-notification-lang-1.2.1-11.35.noarch.rpm"
RPM_HASH = "a02f478b389c11cb83e5b3668c286bd55403b4368ed08b0af8ec49c5a0318abb18c7b06930258306868ce174af5392402630fb98fff80bfa2573303a18d20107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pidgin-plugin-advanced-sound-notification-de \
locale-pidgin-plugin-advanced-sound-notification-es \
locale-pidgin-plugin-advanced-sound-notification-fr \
locale-pidgin-plugin-advanced-sound-notification-ru \
locale-pidgin-plugin-advanced-sound-notification-tr \
locale-pidgin-plugin-advanced-sound-notification-zh-CN \
pidgin-plugin-advanced-sound-notification-lang \
pidgin-plugin-advanced-sound-notification-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-advanced-sound-notification"

inherit rpm
