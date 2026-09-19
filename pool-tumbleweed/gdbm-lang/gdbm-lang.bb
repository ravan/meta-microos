SUMMARY = "Translations for package gdbm"
DESCRIPTION = "Provides translations for the 'gdbm' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.26"

RPM_NAME = "gdbm-lang-1.26-1.6.noarch.rpm"
RPM_HASH = "ec41cf71c2fa327c17e41628b8366d88dd87125e3533057b2bc087f9a1144b08ef4d659300a300847413122bc7d217d703c97fbed6c678da427a213465c4b0b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdbm-lang \
gdbm-lang-all \
locale-gdbm-da \
locale-gdbm-de \
locale-gdbm-eo \
locale-gdbm-es \
locale-gdbm-fi \
locale-gdbm-fr \
locale-gdbm-ja \
locale-gdbm-ka \
locale-gdbm-pl \
locale-gdbm-pt-BR \
locale-gdbm-ro \
locale-gdbm-ru \
locale-gdbm-sr \
locale-gdbm-sv \
locale-gdbm-uk \
locale-gdbm-vi"

RDEPENDS:${PN} += "gdbm"

inherit rpm
