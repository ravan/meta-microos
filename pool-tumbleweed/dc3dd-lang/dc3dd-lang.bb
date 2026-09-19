SUMMARY = "Translations for package dc3dd"
DESCRIPTION = "Provides translations for the 'dc3dd' package."
LICENSE = "GPL-3.0-only"

PV = "7.3.1"

RPM_NAME = "dc3dd-lang-7.3.1-3.6.noarch.rpm"
RPM_HASH = "fd28c3e99691cc213c8580c6bd4043eca85a4aad5fcafc7ed7d9292da0d487ef57dcacef7bfcb91575dea24986d27f331c6de7d7d6787069c39dd61a3db9e30f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dc3dd-lang \
dc3dd-lang-all \
locale-dc3dd-af \
locale-dc3dd-be \
locale-dc3dd-bg \
locale-dc3dd-ca \
locale-dc3dd-cs \
locale-dc3dd-da \
locale-dc3dd-de \
locale-dc3dd-el \
locale-dc3dd-es \
locale-dc3dd-et \
locale-dc3dd-eu \
locale-dc3dd-fi \
locale-dc3dd-fr \
locale-dc3dd-ga \
locale-dc3dd-gl \
locale-dc3dd-hu \
locale-dc3dd-it \
locale-dc3dd-ja \
locale-dc3dd-ko \
locale-dc3dd-lt \
locale-dc3dd-ms \
locale-dc3dd-nb \
locale-dc3dd-nl \
locale-dc3dd-pl \
locale-dc3dd-pt \
locale-dc3dd-pt-BR \
locale-dc3dd-ru \
locale-dc3dd-sk \
locale-dc3dd-sl \
locale-dc3dd-sv \
locale-dc3dd-tr \
locale-dc3dd-uk \
locale-dc3dd-vi \
locale-dc3dd-zh-CN \
locale-dc3dd-zh-TW"

RDEPENDS:${PN} += "dc3dd"

inherit rpm
