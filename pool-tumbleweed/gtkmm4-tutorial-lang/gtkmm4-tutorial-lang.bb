SUMMARY = "Translations for package gtkmm4-tutorial"
DESCRIPTION = "Provides translations for the 'gtkmm4-tutorial' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "gtkmm4-tutorial-lang-4.14.0-1.1.noarch.rpm"
RPM_HASH = "2391eb22faa606c5752dade7c68e2334abb574deb15ab721bf1b7356ae5b5aa129c35f64d5142d27a87ad908370f8a0826e53d14faa7d4157882567db277a01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm4-tutorial-lang \
gtkmm4-tutorial-lang-all"

RDEPENDS:${PN} += "gtkmm4-tutorial"

inherit rpm
