SUMMARY = "Translations for package partclone"
DESCRIPTION = "Provides translations for the 'partclone' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.50"

RPM_NAME = "partclone-lang-0.3.50-1.1.noarch.rpm"
RPM_HASH = "fe38ca224602894806571682dbe03e6b28037cde91195321fc84443f2a9f5db201487e9ab87f3044b216b7bd6e53dff0636b722344e98944f07c2c71518302a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-partclone-de \
locale-partclone-fr-FR \
locale-partclone-ka \
locale-partclone-pt-BR \
locale-partclone-ru \
locale-partclone-vi \
locale-partclone-zh-CN \
locale-partclone-zh-TW \
partclone-lang \
partclone-lang-all"

RDEPENDS:${PN} += "partclone"

inherit rpm
