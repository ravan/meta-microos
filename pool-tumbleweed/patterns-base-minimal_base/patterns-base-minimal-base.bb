SUMMARY = "Minimal Appliance Base"
DESCRIPTION = "This is the minimal runtime system. It is really a minimal system. It is intended as base for Appliances."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-minimal_base-20241218-34.1.aarch64.rpm"
RPM_HASH = "f92313280782e5bad624a2b0310c7a8305c26d6f3d89f3b3dd09cc5401ecf198418d8cc2e7cee111890919de74bd462aabe1245c9cba79db1a272dc502c77d96"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-minimal-base \
patterns-openSUSE-minimal-base"

RDEPENDS:${PN} += "branding \
build-key \
distribution-release \
filesystem"

inherit rpm
