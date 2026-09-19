SUMMARY = "Translations for Psi+"
DESCRIPTION = "Various translations for Psi+."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2109+0"

RPM_NAME = "psi+-lang-1.5.2109+0-1.4.noarch.rpm"
RPM_HASH = "c107d172efdc034719b15da627b16eaa6c0a2462446f4ccfdd1008ebe9aff0260b15b1e97cf15309e92a4727833a84754902ba2da5209db9f8d15cd72f4bad4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psi+-lang"

RDEPENDS:${PN} += "psi+"

inherit rpm
