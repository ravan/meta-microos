SUMMARY = "Translations for package pidgin-plugin-privacy-please"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-privacy-please' package."
LICENSE = "GPL-3.0+"

PV = "0.7.1"

RPM_NAME = "pidgin-plugin-privacy-please-lang-0.7.1-1.35.noarch.rpm"
RPM_HASH = "01f397e15167676e2c9c4d21705ec163294af7dc6a45a3f9a68ea48295dada3a5fe43d58341bc41037f8df9165240a794d3499fee2da3e5dff9fbdc565644580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pidgin-plugin-privacy-please-de \
locale-pidgin-plugin-privacy-please-pl \
locale-pidgin-plugin-privacy-please-ru \
pidgin-plugin-privacy-please-lang \
pidgin-plugin-privacy-please-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-privacy-please"

inherit rpm
