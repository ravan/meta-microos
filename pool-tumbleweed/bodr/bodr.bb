SUMMARY = "Blue Obelisk Data Repository"
DESCRIPTION = "The Blue Obelisk Data Repository lists many important chemoinformatics data \
such as element and isotope properties, atomic radii, etc. including \
references to original literature. Developers can use this repository to make \
their software interoperable."
LICENSE = "CC0-1.0"

PV = "10"

RPM_NAME = "bodr-10-1.18.noarch.rpm"
RPM_HASH = "3e3df9fd4babb857ca1156f15a08bbb37b729678279788b1bf6a5f1c86f65f6a96ee5e8ac9d71c1790d8ea49ce6db076c6b28b55e43ad75aebe18f35087d22fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bodr \
pkgconfig-bodr"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
