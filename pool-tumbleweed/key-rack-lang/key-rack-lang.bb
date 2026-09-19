SUMMARY = "Translations for package key-rack"
DESCRIPTION = "Provides translations for the 'key-rack' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "key-rack-lang-0.5.0-1.3.noarch.rpm"
RPM_HASH = "6562ffe027479920fca5787b2b72358ed0184ca4de4d0b8197e066ebe2e510fdc631ebdc250c4720b1a08225916eabe2d62d135a0827b8684120687f55f083da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "key-rack-lang \
key-rack-lang-all \
locale-key-rack-cs \
locale-key-rack-de \
locale-key-rack-el \
locale-key-rack-eu \
locale-key-rack-fa \
locale-key-rack-fi \
locale-key-rack-he \
locale-key-rack-hi \
locale-key-rack-hu \
locale-key-rack-id \
locale-key-rack-ka \
locale-key-rack-kk \
locale-key-rack-nb \
locale-key-rack-pt-BR \
locale-key-rack-ru \
locale-key-rack-sl \
locale-key-rack-sr \
locale-key-rack-sv \
locale-key-rack-tr \
locale-key-rack-uk \
locale-key-rack-zh-CN"

RDEPENDS:${PN} += "key-rack"

inherit rpm
