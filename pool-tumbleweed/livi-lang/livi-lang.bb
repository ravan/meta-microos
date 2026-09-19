SUMMARY = "Translations for package livi"
DESCRIPTION = "Provides translations for the 'livi' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "livi-lang-0.5.0-1.2.noarch.rpm"
RPM_HASH = "db738294e456dbaaebbbd81744b36560402e4ad29d74440fdc2f65c07f0c59f2e32b74044b41a3f86e609f72fdc2bdb59b9f6b6a5ef5c35c475b1949546c228b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "livi-lang \
livi-lang-all \
locale-livi-de \
locale-livi-ru \
locale-livi-tr"

RDEPENDS:${PN} += "livi"

inherit rpm
