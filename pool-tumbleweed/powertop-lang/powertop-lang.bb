SUMMARY = "Translations for package powertop"
DESCRIPTION = "Provides translations for the 'powertop' package."
LICENSE = "GPL-2.0-only"

PV = "2.16"

RPM_NAME = "powertop-lang-2.16-2.1.noarch.rpm"
RPM_HASH = "af4e6dc0480631d74e06eab29ece3bc87b1fb71d8b4220df65731f4ca34a238222cf44e2d19f2d9b33532843962ab5bb44ca74c96492755dab39bd44f3aab836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-powertop-ca \
locale-powertop-cs-CZ \
locale-powertop-de-DE \
locale-powertop-en-GB \
locale-powertop-en-US \
locale-powertop-es-ES \
locale-powertop-pt-PT \
locale-powertop-zh-TW \
powertop-lang \
powertop-lang-all"

RDEPENDS:${PN} += "powertop"

inherit rpm
