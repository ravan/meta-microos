SUMMARY = "Translations for package mlterm"
DESCRIPTION = "Provides translations for the 'mlterm' package."
LICENSE = "BSD-3-Clause"

PV = "3.9.5"

RPM_NAME = "mlterm-lang-3.9.5-1.1.noarch.rpm"
RPM_HASH = "9822f3695e321519bb165ccb8bac27a5cac1f61a382291fd2a6be5db2ba276710ae7077e88b95deed5ebc0ff446bc17c699dffad90bc7819fcc7ea5fa6c4527c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mlterm-ar \
locale-mlterm-de \
locale-mlterm-ja \
locale-mlterm-vi \
locale-mlterm-zh-TW \
mlterm-lang \
mlterm-lang-all"

RDEPENDS:${PN} += "mlterm"

inherit rpm
