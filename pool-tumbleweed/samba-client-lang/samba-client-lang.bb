SUMMARY = "Translations for package samba-client"
DESCRIPTION = "Provides translations for the 'samba-client' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-client-lang-4.24.6+git.488.e38f6c96c62-1.1.noarch.rpm"
RPM_HASH = "3c33db3866f2c5bd4f29a8ae97d74fd7fbfad1b368cef7f646936bdd1477a754068387246b1f120cf6c764a1d6aabd2087979942c33d477d42ac3b80bac890e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-samba-client-de \
locale-samba-client-ka \
samba-client-lang \
samba-client-lang-all"

RDEPENDS:${PN} += "samba-client"

inherit rpm
