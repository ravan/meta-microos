SUMMARY = "Graphics"
DESCRIPTION = "Handling of digital photos and graphics."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-imaging-20201106-5.5.aarch64.rpm"
RPM_HASH = "ae4f3ea1bbe45c939dbd8888083638f7f91e46617beaa76389846d278244c487c0cd18c55154fc7d8c4841640a77a466b758aa42139a7cf96008296175edd20e"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-desktop-imaging \
patterns-openSUSE-imaging"

RDEPENDS:${PN} += ""

inherit rpm
