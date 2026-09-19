SUMMARY = "Help and Support Documentation"
DESCRIPTION = "Man tool and Man pages for various tools and POSIX API."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-documentation-20241218-34.1.aarch64.rpm"
RPM_HASH = "1ea9f6bf92a28dd4e78fcaaa54fee84f0118d9be626e00c417f69a13637733742022fc4a91964d83b80217d4e1275c6778c67dfea918ddda40b8a111a743f250"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-documentation \
patterns-openSUSE-documentation"

RDEPENDS:${PN} += "man \
pattern-"

inherit rpm
