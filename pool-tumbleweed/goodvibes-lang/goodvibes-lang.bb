SUMMARY = "Translations for package goodvibes"
DESCRIPTION = "Provides translations for the 'goodvibes' package."
LICENSE = "GPL-3.0-only"

PV = "0.8.4"

RPM_NAME = "goodvibes-lang-0.8.4-1.3.noarch.rpm"
RPM_HASH = "0aa546b78228e25b6c1f4759b181fa94707436b9c3a68f37daeed9690c981f10f704bcd4f451150ca657538c3bbd791396844ded50b24f724e3e71ce938fd2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goodvibes-lang \
goodvibes-lang-all \
locale-goodvibes-ca \
locale-goodvibes-cs \
locale-goodvibes-da \
locale-goodvibes-de \
locale-goodvibes-el \
locale-goodvibes-en-US \
locale-goodvibes-es \
locale-goodvibes-et \
locale-goodvibes-fi \
locale-goodvibes-fr \
locale-goodvibes-hr \
locale-goodvibes-hu \
locale-goodvibes-ia \
locale-goodvibes-id \
locale-goodvibes-it \
locale-goodvibes-ka \
locale-goodvibes-mr \
locale-goodvibes-nb-NO \
locale-goodvibes-nl \
locale-goodvibes-pl \
locale-goodvibes-pt \
locale-goodvibes-pt-BR \
locale-goodvibes-pt-PT \
locale-goodvibes-ru \
locale-goodvibes-sk \
locale-goodvibes-sv \
locale-goodvibes-ta \
locale-goodvibes-te \
locale-goodvibes-tr \
locale-goodvibes-zh-Hant"

RDEPENDS:${PN} += "goodvibes"

inherit rpm
