SUMMARY = "Battle for Wesnoth: Basic file system layout"
DESCRIPTION = "This package solely contains the basic file structure in order to have it owned by a package."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.18.8"

RPM_NAME = "wesnoth-fslayout-1.18.8-1.1.noarch.rpm"
RPM_HASH = "d72b47a2ad81894eb65689183fb4d3cd8a26232abf04cd6b08b4fb4e21dde8e1138660c8fcf41cc9c6b86ec1e66fe514a4904cd466fe357db87183915d364bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wesnoth-fslayout"

RDEPENDS:${PN} += ""

inherit rpm
