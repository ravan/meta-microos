SUMMARY = "Translations for package hasl"
DESCRIPTION = "Provides translations for the 'hasl' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.0"

RPM_NAME = "hasl-lang-0.5.0-1.4.noarch.rpm"
RPM_HASH = "086b5b280b76e756b67b56a745c5f5e7544b10d787423b4165c7e3562975d36a09a638f7a2f414eeedbb9b1aa81856aca785292719a0564ff92712f93b969359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hasl-lang \
hasl-lang-all \
locale-hasl-bg \
locale-hasl-de \
locale-hasl-gl \
locale-hasl-he \
locale-hasl-ka \
locale-hasl-pt-PT \
locale-hasl-ro \
locale-hasl-sv"

RDEPENDS:${PN} += "hasl"

inherit rpm
