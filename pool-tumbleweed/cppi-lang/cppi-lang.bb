SUMMARY = "Translations for package cppi"
DESCRIPTION = "Provides translations for the 'cppi' package."
LICENSE = "GPL-3.0+"

PV = "1.18"

RPM_NAME = "cppi-lang-1.18-2.35.noarch.rpm"
RPM_HASH = "14a609e7d3686c32306f44ad4a4bbaf22f9122a18ec64472416167a3ba46a179062717c72322c574fdcdd09e88629cd26f290070691a36ef9f099d8d3c01401f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppi-lang \
cppi-lang-all \
locale-cppi-de \
locale-cppi-eo \
locale-cppi-fi \
locale-cppi-fr \
locale-cppi-gl \
locale-cppi-hr \
locale-cppi-it \
locale-cppi-ja \
locale-cppi-pl \
locale-cppi-sr \
locale-cppi-sv \
locale-cppi-uk \
locale-cppi-vi"

RDEPENDS:${PN} += "cppi"

inherit rpm
