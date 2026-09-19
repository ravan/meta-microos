SUMMARY = "Hiligaynon Dictionary for Aspell"
DESCRIPTION = "A Hiligaynon dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.11"

RPM_NAME = "aspell-hil-0.11-4.7.aarch64.rpm"
RPM_HASH = "eeb09f7660541a9b1b63c2f502d3fa79c5c749096cbef0b135f38b2e1092de8f2c4c39af3cd3c1e50abbcfee68287b8a5d5a2ac61709850a664646923fce0975"

RPROVIDES:${PN} += "aspell-hil \
locale-aspell-hil"

RDEPENDS:${PN} += ""

inherit rpm
