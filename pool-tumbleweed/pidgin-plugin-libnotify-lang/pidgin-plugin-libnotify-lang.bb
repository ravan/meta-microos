SUMMARY = "Translations for package pidgin-plugin-libnotify"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-libnotify' package."
LICENSE = "GPL-3.0+"

PV = "0.14"

RPM_NAME = "pidgin-plugin-libnotify-lang-0.14-2.8.noarch.rpm"
RPM_HASH = "0838063af8825c5504ba8f2bb40042bad34a7c4084408251e4973bf407f7ed356e6d858a15c9808b270134e6da9eab2a2ce5560b43b4cdd98b8d55369c694f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pidgin-plugin-libnotify-bg \
locale-pidgin-plugin-libnotify-de \
locale-pidgin-plugin-libnotify-es \
locale-pidgin-plugin-libnotify-fr \
locale-pidgin-plugin-libnotify-gl \
locale-pidgin-plugin-libnotify-hu \
locale-pidgin-plugin-libnotify-it \
locale-pidgin-plugin-libnotify-nl \
locale-pidgin-plugin-libnotify-pl \
locale-pidgin-plugin-libnotify-pt \
locale-pidgin-plugin-libnotify-pt-BR \
locale-pidgin-plugin-libnotify-ro \
locale-pidgin-plugin-libnotify-ru \
locale-pidgin-plugin-libnotify-sl \
locale-pidgin-plugin-libnotify-sv \
locale-pidgin-plugin-libnotify-zh-CN \
pidgin-plugin-libnotify-lang \
pidgin-plugin-libnotify-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-libnotify"

inherit rpm
