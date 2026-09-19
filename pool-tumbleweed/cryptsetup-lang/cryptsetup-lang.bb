SUMMARY = "Translations for package cryptsetup"
DESCRIPTION = "Provides translations for the 'cryptsetup' package.(cryptsetup)"
LICENSE = "CC-BY-SA-4.0 & LGPL-2.0-or-later-with-cryptsetup-OpenSSL-exception"

PV = "2.8.7"

RPM_NAME = "cryptsetup-lang-2.8.7-1.2.noarch.rpm"
RPM_HASH = "697771c28a83a2d00f162466dbe78d86836951fae0c32c7f893ca09fdc10d202f6905520fd69200a8dad229097e85c1cdd215ea7c167350286180dc0dbc14ef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cryptsetup-lang \
cryptsetup-lang-all \
locale-cryptsetup-cs \
locale-cryptsetup-da \
locale-cryptsetup-de \
locale-cryptsetup-es \
locale-cryptsetup-fi \
locale-cryptsetup-fr \
locale-cryptsetup-id \
locale-cryptsetup-it \
locale-cryptsetup-ja \
locale-cryptsetup-ka \
locale-cryptsetup-ko \
locale-cryptsetup-nl \
locale-cryptsetup-pl \
locale-cryptsetup-pt-BR \
locale-cryptsetup-ro \
locale-cryptsetup-ru \
locale-cryptsetup-sk \
locale-cryptsetup-sr \
locale-cryptsetup-sv \
locale-cryptsetup-uk \
locale-cryptsetup-vi \
locale-cryptsetup-zh-CN"

RDEPENDS:${PN} += "cryptsetup"

inherit rpm
