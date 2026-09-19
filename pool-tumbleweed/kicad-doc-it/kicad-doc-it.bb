SUMMARY = "Italian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Italian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-it-10.0.6-1.1.noarch.rpm"
RPM_HASH = "8a1fd50ed78c48e9485164b2e18f573ee1f44324435cc492997d2a4e3159077118e0ea31fb0bdb3ffdab7371e84882225fcb13ab4cf5f2efe7ca0b00afc748a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-it \
locale-kicad-doc-it"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
