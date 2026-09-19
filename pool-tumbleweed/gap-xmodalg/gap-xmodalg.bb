SUMMARY = "GAP: Crossed Modules and Cat1-Algebras"
DESCRIPTION = "The XMod(Alg) package provides a collection of functions for \
computing with crossed modules and cat1-algebras and morphisms of \
these structures."
LICENSE = "GPL-2.0-or-later"

PV = "1.32"

RPM_NAME = "gap-xmodalg-1.32-1.3.noarch.rpm"
RPM_HASH = "a25fbf48a181fdd35c3fd0b22214f037b8dd3aa0982f436d913f90b92e4cdb4dd8144392718921d38b61d63eed9d94cea75c45436c53c0857cea7c93dc710fa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-xmodalg"

RDEPENDS:${PN} += "gap-core \
gap-laguna \
gap-xmod"

inherit rpm
