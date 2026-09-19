SUMMARY = "Documentation"
DESCRIPTION = "Help and Documentation, various books."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-books-20201106-5.5.aarch64.rpm"
RPM_HASH = "dfb29e577a24d1f138bd425a64f28411c3c4b6e842f05f0d8d36c08768c9a412f4013b834c0a21112f51a774dc30647082befb62a395625e160a7ff8d5851d07"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-desktop-books \
patterns-openSUSE-books"

RDEPENDS:${PN} += ""

inherit rpm
