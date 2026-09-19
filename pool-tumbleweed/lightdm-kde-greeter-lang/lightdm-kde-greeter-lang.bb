SUMMARY = "Translations for package lightdm-kde-greeter"
DESCRIPTION = "Provides translations for the 'lightdm-kde-greeter' package."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.5"

RPM_NAME = "lightdm-kde-greeter-lang-6.0.5-1.4.noarch.rpm"
RPM_HASH = "31b65436e8f0939b5a9f7b942754e1c2351d277352b29fc52005a55ba478aa48541633fd030a4cab648b269b417a6dd361d24e62494a106ee50201d9f6502226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-kde-greeter-lang \
lightdm-kde-greeter-lang-all"

RDEPENDS:${PN} += "lightdm-kde-greeter"

inherit rpm
